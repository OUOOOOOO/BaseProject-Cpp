package com.github;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner; 
import java.util.Collections;

/**
 * 排行功能
 * @author Admin
 *
 */
public class SystemRank {
	
    private Map<String, Store> listStore;
    Scanner scan = new Scanner(System.in);
    private ArrayList<Store> foodlist = new ArrayList<Store>();
    
    public SystemRank(Map<String, Store> listStore) {
        this.listStore = listStore;
	}
    public SystemRank() {
        
	}
    
    public void getRanking() {
		if(listStore == null) {  			
		     System.out.println("Sorry, there's no store in the system.");
		     return;

			}
    	getftype();
    	getfrank();
    	searchShop();
    	//System.out.println("Finish.");
    }
    
    public void getftype() {
        foodlist.clear();
    	System.out.println("請輸入食物種類代號:  (1: 麵食  2: 飯類  3: 其他)");
    	int ftype = scan.nextInt();
    	while ((ftype < 1) || (ftype > 3))
    	{
    		System.out.println("Please enter again:  (1: 麵食  2: 飯類  3: 其他)");
    		ftype = scan.nextInt();
    	}

        if (ftype == 1)
        {       	
        	for(Store s : listStore.values()) {
        	if (s.getFoodtype().equals("noodle")) {     		
        		foodlist.add(s) ;  
        	}  
        }    
        }
        else if (ftype == 2)
        {
        	for(Store s : listStore.values()) {
        	if (s.getFoodtype().equals("rice")) {
        		foodlist.add(s);
        		}
        	}  	        
        }
        else if (ftype == 3)
        {
        	for(Store s : listStore.values()) {
        	if (s.getFoodtype().equals("others")) {
        		foodlist.add(s);
        		}
        	}    	        
        }
    }
    
    public void getfrank() {
    	
        if(foodlist.isEmpty()) {
        	System.out.println("There's no that kind of store.");
        	return;
        }
    	System.out.println("請輸入排序依據；  (1: 評價  2: 價位  3: 距離)");
    	int frank = scan.nextInt();
    	while ((frank < 1) || (frank > 3)){
    		System.out.println("Please enter again；  (1: 評價  2: 價位  3: 距離)");
    		frank = scan.nextInt();
    	}
      
    	if (frank == 1){
    		for (int j=0; j<foodlist.size(); j++)
    		{
    			for (int i=0 ; i < foodlist.size()-1; i++ ) {
    			if (foodlist.get(i).getVote() < foodlist.get(i+1).getVote()) {
    				Collections.swap(foodlist, i, i+1);
    			}
    		}
    		}
    		showvoterank();

    	}
    	else if (frank == 2){
    		for (int j=0; j<foodlist.size(); j++)
    		{
    			for (int i=0 ; i < foodlist.size()-1; i++ ) {
    			if (foodlist.get(i).getPrice() > foodlist.get(i+1).getPrice()) {
    				Collections.swap(foodlist, i, i+1);
    			}
    		}
    		}
    		showpricerank();
    	}
    	else if (frank == 3){
    		for (int j=0; j<foodlist.size(); j++)
    		{
    			for (int i=0 ; i < foodlist.size()-1; i++ ) {
    			int a = Math.abs(foodlist.get(i).getLocation());
    			int b = Math.abs(foodlist.get(i+1).getLocation());
    			if (a > b) {
    				Collections.swap(foodlist, i, i+1);
    			}
    		}
    		}
    		showdistancerank();
    	}
    	
    }
    
    public void showvoterank() {
    	
        if(foodlist.isEmpty()) {
        	return;
        }
    	for (int i=0 ; i < foodlist.size(); i++ ) {
    			System.out.println(i+1 +": 編號  " + foodlist.get(i).getStoreID()+"   店名  " + foodlist.get(i).getName()+ "   評價  "+foodlist.get(i).getVote());
			}
    }
    
    public void showpricerank() {
    	
        if(foodlist.isEmpty()) {
        	return;
        }
    	for (int i=0 ; i < foodlist.size(); i++ ) {
    			System.out.println(i+1 +": 編號  " + foodlist.get(i).getStoreID()+"   店名  " + foodlist.get(i).getName()+ "   價位  "+foodlist.get(i).getPrice());
			}
    }
    
    public void showdistancerank() {
    	
        if(foodlist.isEmpty()) {
        	return;
        }
    	for (int i=0 ; i < foodlist.size(); i++ ) {
    			System.out.println(i+1 +": 編號  " + foodlist.get(i).getStoreID()+"   店名  " + foodlist.get(i).getName()+ "   距離  "+foodlist.get(i).getLocation());
			}
    }
    
    public void searchShop() {
    	String ID;
    	boolean nosearch = true;
        if(foodlist.isEmpty()) {
        	return;
        }
        else {
        	System.out.println("輸入編號查看店家的詳細資訊:  \n輸入99即可退出。");
        	ID = scan.next();
        	//System.out.println(ID);
        	
        	if (ID.equals("99")){
        		return;
        	}         	
        	else { 
        		for (int i=0 ; i < foodlist.size(); i++ ) {
        			Store s = foodlist.get(i);
        			if (ID.equals(s.getStoreID())){
        				System.out.println(s.getFullDes());
        				nosearch = false;
        				return;
        			}
        		}
        		if (nosearch) {
        			System.out.println("沒有您想要的店家。");
        		}
        }
        }
    }
}


    