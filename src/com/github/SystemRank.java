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
    
    public void getRanking() {
    	getftype();
    	getfrank();
    	showfrank();
    	searchShop();
    	System.out.println("Finish.");
    }
    
    public void getftype() {
    	//foodlist = null;
    	System.out.println("請輸入食物種類代號:  (1: noodle  2: rice  3: others)");
    	int ftype = scan.nextInt();
    	while ((ftype < 1) || (ftype > 3))
    	{
    		System.out.println("Please enter again:  (1: vote  2: price  3: distance)");
    		ftype = scan.nextInt();
    	}

        if (ftype == 1)
        {
        	
        	for(Store s : listStore.values()) {
            if(listStore.isEmpty()) {
                System.out.println("I can't do it.");
                return;
                }
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
    	System.out.println("請輸入排序依據；  (1: vote  2: price  3: distance)");
    	int frank = scan.nextInt();
    	while ((frank < 1) || (frank > 3)){
    		System.out.println("Please enter again；  (1: vote  2: price  3: distance)");
    		frank = scan.nextInt();
    	}
      
    	if (frank == 1){
    		for (int i=0 ; i < foodlist.size()-1; i++ ) {
    			if (foodlist.get(i).getVote() < foodlist.get(i+1).getVote()) {
    				Collections.swap(foodlist, i, i+1);
    			}
    		}
    	}
    	else if (frank == 2){
    		for (int i=0 ; i < foodlist.size()-1; i++ ) {
    			if (foodlist.get(i).getPrice() > foodlist.get(i+1).getPrice()) {
    				Collections.swap(foodlist, i, i+1);
    			}
    		}
    	}
    	else if (frank == 3){
    		for (int i=0 ; i < foodlist.size()-1; i++ ) {
    			int a = Math.abs(foodlist.get(i).getLocation());
    			int b = Math.abs(foodlist.get(i+1).getLocation());
    			if (a > b) {
    				Collections.swap(foodlist, i, i+1);
    			}
    		}
    	}
    	
    }
    
    public void showfrank() {
    	
        if(foodlist.isEmpty()) {
        	return;
        }
    	for (int i=0 ; i < foodlist.size(); i++ ) {
    			System.out.println(i+1 +": ID= " + foodlist.get(i).getStoreID()+"      Name= " + foodlist.get(i).getName());
			}
    }
    public void searchShop() {
    	String ID;
    	SystemSearch search = new SystemSearch(Main.getInstance().systemInfo.getListStore());
        if(foodlist.isEmpty()) {
        	return;
        }
        else {
        	System.out.println("Enter Store ID for more information:  \nEnter 0 to exit.");
        	ID = scan.next();
        	if (ID =="0") {
        		return;
        	}
//        	search.setSearch();
//        	search.Search();
        }
    }

}
    