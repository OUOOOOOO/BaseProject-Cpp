package com.github;

import java.util.Map;

public class Store {

    private String storeID; //ID
    private String name;    //�W��
    private String foodtype;//�������O
    private int price;      //����
    private int vote;       //����
    private int location;   //�Z��
    private String Business_Hours; //��~�ɶ�
    private String Meal_time;      //���\�ɶ����j
    private int seats;             //�̤j���ΤH��
    
    
    private Map<String, Integer> listMenu;
    
    public Store(String storeID, String name, int location) {
        this.storeID = storeID;
        this.name = name;
        this.location = location;
        
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
    
    public void setVote(int vote) {
    	this.vote = vote;
    }
    
    public int getVote() {
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
        return "Store [storeID=" + storeID + ", name=" + name + ", location=" + location + "]";
    }
}
