package com.github;

public class Main {
    
    private static Main instance;
    
    public SystemInfo systemInfo;
    
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
    }

}
