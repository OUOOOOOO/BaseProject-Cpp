package com.github;

import java.util.Map;

public class Store {

    private String storeID; //ID
    private String name;    //名稱
    private String foodtype;//食物類別
    private int price;      //價格
    private double vote;       //評價
    private int location;   //距離
    private String Business_Hours; //營業時間
    private String Meal_time;      //取餐時間間隔
    private int seats;             //最大內用人數
    
    
    private Map<String, Integer> listMenu;
    
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

    @Override
    public String toString() {
    	String str = null;
    	str = String.format("(%3s) %8s %-9s 價位約為$%-3s 評價%.1f 與你距離 %3sm", storeID,"[" + foodtype + "]",name,price,vote,location);
        return str;
//        		"(" + storeID + ") [" + foodtype + "]  " + name + "  價位約為 $" + price + "  評價" + vote +   " 與你距離 " + location + "m";
    }
}
