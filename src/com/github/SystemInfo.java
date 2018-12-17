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
        new Store("A01", "TEST1", 100, "rice", 50, 4.7);
        new Store("A11", "TEST2", 150, "noodle", 80, 4);
        new Store("B55", "TEST3", -100, "rice", 60, 3.85);        
        new Store("A23", "TEST4", 70, "rice", 79, 3.14);
        new Store("A12", "TEST5", 134, "others", 118, 5);
        new Store("B36", "TEST6", -20, "noodle", 250, 2.7);
        new Store("C19", "TEST7", 60, "others", 55, 4.25);
        new Store("C27", "TEST8", -399, "others", 89, 3.33);
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
