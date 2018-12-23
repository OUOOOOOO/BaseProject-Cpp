package com.github;

import java.util.Map;

public class Store {

    private String storeID; //ID
    private String name;    //名稱
    private String foodtype;//食物類別
    private int price;      //價格
    private double vote;       //評價
    private int location;   //距離
    private int[] Business_Hours; //營業時間
    private int Meal_time;      //取餐時間間隔
    private int seats;             //最大內用人數
    
    private Map<String, Integer> listMenu;
    
    /*
     * 
     */
    
    public static enum FoodType {
        rice(),
        noodle(),
        others();
        
        private String str;
        
        FoodType() {
            this.str = this.toString();
        }
        
        public String getName() {
            return str;
        }
        
        public static FoodType random() {
            int i = (int) (Math.random()*3);
            return FoodType.values()[i];
        }
    }
    
    /*
     * 
     */
    
    public Store(String storeID, String name) {
        this.storeID = storeID;
        this.name = name;
        this.location = (int) (Math.random()*300);
        this.foodtype = FoodType.random().getName();
        this.price = (int) (Math.random()*30 + 1)*10;
        this.vote = Math.random()*5;
        this.Business_Hours = new int[2];
        this.Business_Hours[0] = (int) (Math.random()*24);
        this.Business_Hours[1] = (int) (Business_Hours[0] + 8);
        if(Business_Hours[1] > 24) {
            Business_Hours[1] = 24;
        }
        this.Meal_time = (int) (Math.random()*60 + 1);
        this.seats = (int) (Math.random()*60 + 1);
        
        addList();
    }
    
    public Store(String storeID, String name, int location, String foodtype, int price, double vote) {
        this.storeID = storeID;
        this.name = name;
        this.location = location;
        this.foodtype = foodtype;
        this.price = price;
        this.vote = vote;
        
        addList();
    }
    
    public void addList() {
        Main.getInstance().systemInfo.addStore(this);
    }
    
    /*
     * 
     */

    public String getStoreID() {
        return storeID;
    }

    public void setStoreID(String storeID) {
        this.storeID = storeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }
    
    public void setFoodtype(String foodtype) {
    	this.foodtype = foodtype;
    }
    
    public String getFoodtype() {
    	return foodtype;
    }
    
    public void setVote(double vote) {
    	this.vote = vote;
    }
    
    public double getVote() {
    	return vote;
    }
    
    public void setPrice(int price) {
    	this.price = price;
    }
    
    public int getPrice() {
    	return price;
    }

    public int[] getBusiness_Hours() {
        return Business_Hours;
    }

    public void setBusiness_Hours(int[] business_Hours) {
        Business_Hours = business_Hours;
    }

    public int getMeal_time() {
        return Meal_time;
    }

    public void setMeal_time(int meal_time) {
        Meal_time = meal_time;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
    	String str = null;
    	str = String.format("(%3s) %8s %-20s \t價位約為$%-8d 評價%6.1f 與你距離 %5sm", storeID,"[" + foodtype + "]",name,price,vote,location);
        return str;
//        		"(" + storeID + ") [" + foodtype + "]  " + name + "  價位約為 $" + price + "  評價" + vote +   " 與你距離 " + location + "m";
    }
    
    public String getFullDes() {
//        String str = toString();
//        str += "\n";
//        str += String.format("營業時間: %02d~%02d時  平均用餐時間: %02d分鐘  當前尚餘座位:%2d", Business_Hours[0], Business_Hours[1], Meal_time, seats);
//        return str;
//              "(" + storeID + ") [" + foodtype + "]  " + name + "  價位約為 $" + price + "  評價" + vote +   " 與你距離 " + location + "m";
        return storeID + " " + name + "\n" + 
                "價位: $" + price + "\n" + 
                "評價: " + String.format("%1.1f", vote) + "\n" + 
                "營業時間: " + Business_Hours[0] + ":00~" + Business_Hours[1] + ":00\n" + 
                "取餐時間間隔: " + Meal_time + "分鐘\n" + 
                "最大內用人數: " + seats + "\n" + 
                "語你的距離: " + location + "公尺\n";
    }
}
