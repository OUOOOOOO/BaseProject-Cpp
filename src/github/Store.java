package com.github;

import java.util.Map;

public class Store {

    private String storeID;
    private String name;
    private int location;
    
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

    @Override
    public String toString() {
        return "Store [storeID=" + storeID + ", name=" + name + ", location=" + location + "]";
    }
}
