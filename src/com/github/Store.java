package com.github;

import java.util.Map;

public class Store {

    private String storeID; //ID
    private String name;    //�W��
    private String foodtype;//�������O
    private int price;      //����
    private double vote;       //����
    private int location;   //�Z��
    private int[] Business_Hours; //��~�ɶ�
    private int Meal_time;      //���\�ɶ����j
    private int seats;             //�̤j���ΤH��
    
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
    	str = String.format("(%3s) %8s %-20s \t�������$%-8d ����%6.1f �P�A�Z�� %5sm", storeID,"[" + foodtype + "]",name,price,vote,location);
        return str;
//        		"(" + storeID + ") [" + foodtype + "]  " + name + "  ������� $" + price + "  ����" + vote +   " �P�A�Z�� " + location + "m";
    }
    
    public String getFullDes() {
//        String str = toString();
//        str += "\n";
//        str += String.format("��~�ɶ�: %02d~%02d��  �������\�ɶ�: %02d����  ��e�|�l�y��:%2d", Business_Hours[0], Business_Hours[1], Meal_time, seats);
//        return str;
//              "(" + storeID + ") [" + foodtype + "]  " + name + "  ������� $" + price + "  ����" + vote +   " �P�A�Z�� " + location + "m";
        return storeID + " " + name + "\n" + 
                "����: $" + price + "\n" + 
                "����: " + String.format("%1.1f", vote) + "\n" + 
                "��~�ɶ�: " + Business_Hours[0] + ":00~" + Business_Hours[1] + ":00\n" + 
                "���\�ɶ����j: " + Meal_time + "����\n" + 
                "�̤j���ΤH��: " + seats + "\n" + 
                "�y�A���Z��: " + location + "����\n";
    }
}
