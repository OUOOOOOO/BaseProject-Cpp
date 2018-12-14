package com.github;

import java.util.Map;
import java.util.Scanner;
import java.math.*;;

/**
 * 排行功能
 * @author Admin
 *
 */
public class SystemRank {
	
    private Map<String, Store> listStore;
    Scanner scan = new Scanner(System.in);
    private Store[] foodlist;
    
    public SystemRank(Map<String, Store> listStore) {
        this.listStore = listStore;
	}
    
    public void getftype() {
    	System.out.println("請輸入食物種類代號；  \n1: noodles  \n2. rice  \n3: others");
    	int ftype = scan.nextInt();
    	while ((ftype < 1) || (ftype > 3))
    	{
    		System.out.println("Please enter again；  \n1: noodles  \n2. rice  \n3: others");
    		ftype = scan.nextInt();
    	}

        if (ftype == 1)
        {
        	for(Store s : listStore.values()) {
        	if (s.getFoodtype().equals("noodles")) {
        		foodlist[foodlist.length] = s;}
        	}    	        
        	if(foodlist.length == 0) {
        	System.out.println("I can't do it.");
            return;
            }
        }       
        else if (ftype == 2)
        {
        	for(Store s : listStore.values()) {
        	if (s.getFoodtype().equals("rice")) {
        		foodlist[foodlist.length] = s;
        		}
        	}  	        
        	if(foodlist.length == 0 ) {
        	System.out.println("I can't do it.");
            return;
            }
        }
        else if (ftype == 3)
        {
        	for(Store s : listStore.values()) {
        	if (s.getFoodtype().equals("others")) {
        		foodlist[foodlist.length] = s;
        		}
        	}    	        
        	if(foodlist.length == 0 ) {
        	System.out.println("I can't do it.");
            return;
            }
        }
    }
    
    public void getfrank() {
    	System.out.println("請輸入排序依據；  \n1: vote  \n2.mininum price  \n3: distance");
    	int frank = scan.nextInt();
    	while ((frank < 1) || (frank > 3)){
    		System.out.println("Please enter again；  \n1: vote  \\n2.mininum price  \\n3: distance");
    		frank = scan.nextInt();
    	}
    	
    	if (frank == 1){
    		for (int i=0 ; i < foodlist.length; i++ ) {
    			if (foodlist[i].getVote() < foodlist[i+1].getVote()) {
    				Store temp = foodlist[i];
    				foodlist[i] =  foodlist[i+1];
    				foodlist[i+1] = temp;
    			}
    		}
    	}
    	else if (frank == 2){
    		for (int i=0 ; i < foodlist.length; i++ ) {
    			if (foodlist[i].getPrice() > foodlist[i+1].getPrice()) {
    				Store temp = foodlist[i];
    				foodlist[i] =  foodlist[i+1];
    				foodlist[i+1] = temp;
    			}
    		}
    	}
    	else if (frank == 3){
    		for (int i=0 ; i < foodlist.length; i++ ) {
    			int a = Math.abs(foodlist[i].getLocation());
    			int b = Math.abs(foodlist[i+1].getLocation());
    			if (a > b) {
    				Store temp = foodlist[i];
    				foodlist[i] =  foodlist[i+1];
    				foodlist[i+1] = temp;
    			}
    		}
    	}
    	
    }
    
    public void showfrank() {
    	for (int i=0 ; i < foodlist.length; i++ ) {
    			System.out.println(foodlist[i].toString());
			}
    }

}
