package com.github;

import java.util.HashMap;
import java.util.Map;

/**
 * ·j´M¥\¯à
 * @author Admin
 *
 */
public class SystemSearch {
    private Map<String, Store> listStore;
    private String storename;
    private String foodtype;
    private int minimum_price;
    private int maximum_price;
    private int vote;
    private int distance;
    private boolean NotFound;
    
    
    public SystemSearch(Map<String, Store> listStore) {
        this.listStore = listStore;
	}
	
	public void setSearch() {
		storename = "TEST1";
        distance = 100;
	}

	
	public void Search() {
		System.out.println("start search.");
		this.setSearch();
        NotFound = true;
		
		
        if(listStore.isEmpty()) {
        	System.out.println("I can't do it.");
            return;
        }
        for(Store s : listStore.values()) {
        	if(s.getName().equals(storename)) {
        		if(s.getLocation() <= distance) {
        			System.out.println(s);
        			NotFound = false;
        		}
        	}
        }
        if(NotFound) {
        	System.out.println("Not found.");
        	setSearch();
        }
    }
}
