package com.github;

import java.util.Map;
import java.util.Scanner;

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
        systemInfo.init();
        systemInfo.showStore();
        
        System.out.println("--------------------------------------");
        
        systemManage = new SystemManage();
        boolean member = systemManage.login();
        
        if(member) {
        	systemSearch = new SystemSearch(systemInfo.getListStore());
        	systemRank = new SystemRank(systemInfo.getListStore());
        }else {
        	systemSearch = new SystemSearch(systemInfo.getListStore());
        }
        Scanner scan = new Scanner(System.in);
        while(true) {
        	System.out.println("--------------------------------------");
        	if(member) {
        		System.out.println("1.搜尋");
        		System.out.println("2.排行榜");
        		System.out.print("請輸入想要使用的功能：");
        	}else {
        		System.out.println("1.搜尋");
        		System.out.print("請輸入想要使用的功能：");
        	}
        	int type = scan.nextInt();
        	while(true) {
        		if(type == 1) {
        			System.out.println("--------------------------------------");
        			systemSearch.Search();
        			break;
        		}else if (type == 2 && member) {
        			System.out.println("--------------------------------------");
        			systemRank.getRanking();
        			break;
        		}else if(type == 2) { //member == flase
        			System.out.println("您並非會員，無法使用此功能。");
        			System.out.println();
        			System.out.print("請輸入想要使用的功能：");
        			type = scan.nextInt();
        		}else {
        			System.out.println("無效的代碼，請重新輸入。");
        			System.out.println();
        			System.out.print("請輸入想要使用的功能：");
        			type = scan.nextInt();
        		}
        	}
        }
    }


}
