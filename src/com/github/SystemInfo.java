package com.github;

import java.util.HashMap;
import java.util.Map;

/**
 * ·j´M¥\¯à
 * @author Admin
 *
 */
public class SystemInfo {

    private Map<String, Store> listStore;
    
    public SystemInfo() {
        listStore = new HashMap<String, Store>();
        
        
    }
    
    public void init() {
        new Store("A01", "TEST1", 100);
        new Store("A11", "TEST2", 150);
        new Store("B55", "TEST3", -100);
    }
    
    public void addStore(Store a) {
        listStore.put(a.getStoreID(), a);
    }
    
    public Store getStore(String id) {
        return listStore.get(id);
    }
    
    public void showStore() {
        if(listStore.isEmpty()) {
            return;
        }
        for(Store s : listStore.values()) {
            System.out.println(s);
        }
    }
    
    public Map<String, Store> getListStore() {
    	return listStore;
    }
}
