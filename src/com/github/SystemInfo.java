package com.github;

import java.util.HashMap;
import java.util.Map;

/**
 * �j�M�\��
 * @author Admin
 *
 */
public class SystemInfo {

    private Map<String, Store> listStore;
    
    public SystemInfo() {
        listStore = new HashMap<String, Store>();
        
        
    }
    
    public void init() {
        new Store("A01", "�²��l");
        new Store("A02", "�j�B����");
        new Store("B01", "������");        
        new Store("B02", "�N���N�׶�");
        new Store("B03", "�Ѫ�����");
        new Store("B04", "�ۨ��M�a");
        new Store("C01", "�D�ѯR��������");
        new Store("C02", "�E����");
        new Store("C03", "�½ީ@��");
//        new Store("A01", "�²��l", 85, "rice", 65, 4.7);
//        new Store("A02", "�j�B����", 90, "noodle", 90, 4);
//        new Store("B01", "������", 55, "rice", 70, 3.85);        
//        new Store("B02", "�N���N�׶�", 50, "rice", 80, 3.14);
//        new Store("B03", "�Ѫ�����", 30, "others", 120, 5);
//        new Store("B04", "�ۨ��M�a", 20, "rice", 80, 2.7);
//        new Store("C01", "�D�ѯR��������", 400, "others", 200, 4.25);
//        new Store("C02", "�E����", 45, "noodle", 110, 3.33);
//        new Store("C03", "�½ީ@��", 40, "rice", 90, 3.33);
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
