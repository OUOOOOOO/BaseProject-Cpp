package com.github;

import java.util.Map;

public class Main {
    
    private static Main instance;
    public SystemManage systemManage;
    public SystemInfo systemInfo;
    public SystemSearch systemSearch;
    public SystemRank systemRank;
    
    public static Main getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        System.out.println("START");
        
        instance = new Main();
        
        instance.init();
    }
    
    public void init() {
        systemInfo = new SystemInfo();
        
        System.out.println("Create SystemInfo");
        
        systemInfo.init();
        
        systemInfo.showStore();
        
        systemManage = new SystemManage();
        systemManage.login();
        
        systemSearch = new SystemSearch(systemInfo.getListStore());
        systemSearch.Search();
        
        systemRank = new SystemRank(systemInfo.getListStore());
        systemRank.getRanking();
    }


}
