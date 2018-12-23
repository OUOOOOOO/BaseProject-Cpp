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
        new Store("A01", "¶Â²°¤l");
        new Store("A02", "¤j¤B©ÔÄÑ");
        new Store("B01", "¬õ»¶´Ô");        
        new Store("B02", "¦N³¥¯N¦×¶º");
        new Store("B03", "¤Ñª¯¤û±Æ");
        new Store("B04", "¾Û¨ý±M®a");
        new Store("C01", "­D¦Ñ¯R¬ü¦¡¬µÂû");
        new Store("C02", "¤E´ö«Î");
        new Store("C03", "¶Â½Þ©@­ù");
//        new Store("A01", "¶Â²°¤l", 85, "rice", 65, 4.7);
//        new Store("A02", "¤j¤B©ÔÄÑ", 90, "noodle", 90, 4);
//        new Store("B01", "¬õ»¶´Ô", 55, "rice", 70, 3.85);        
//        new Store("B02", "¦N³¥¯N¦×¶º", 50, "rice", 80, 3.14);
//        new Store("B03", "¤Ñª¯¤û±Æ", 30, "others", 120, 5);
//        new Store("B04", "¾Û¨ý±M®a", 20, "rice", 80, 2.7);
//        new Store("C01", "­D¦Ñ¯R¬ü¦¡¬µÂû", 400, "others", 200, 4.25);
//        new Store("C02", "¤E´ö«Î", 45, "noodle", 110, 3.33);
//        new Store("C03", "¶Â½Þ©@­ù", 40, "rice", 90, 3.33);
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
