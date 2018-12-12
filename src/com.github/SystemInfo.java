package com.github;

import java.util.HashMap;
import java.util.Map;

/**
 * ��T�\��
 * @author Admin
 *
 */
public class SystemInfo {

    private Map<String, Store> listStore;
    
    public SystemInfo() {
        listStore = new HashMap<String, Store>();
        
        
    }
    
    public void init() {
        new Store("A01", "便利商店", 100);
        new Store("A11", "牛肉麵", 150);
        new Store("B55", "飲料店", -100);
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
}
