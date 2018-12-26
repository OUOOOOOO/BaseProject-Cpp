package com.github;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner; 
import java.util.Collections;

/**
 * �Ʀ�\��
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
    	System.out.println("�п�J���������N��:  (1: �ѭ�  2: ����  3: ��L)");
    	int ftype = scan.nextInt();
    	while ((ftype < 1) || (ftype > 3))
    	{
    		System.out.println("Please enter again:  (1: �ѭ�  2: ����  3: ��L)");
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
    	System.out.println("�п�J�ƧǨ̾ڡF  (1: ����  2: ����  3: �Z��)");
    	int frank = scan.nextInt();
    	while ((frank < 1) || (frank > 3)){
    		System.out.println("Please enter again�F  (1: ����  2: ����  3: �Z��)");
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
    			System.out.println(i+1 +": �s��  " + foodlist.get(i).getStoreID()+"   ���W  " + foodlist.get(i).getName()+ "   ����  "+foodlist.get(i).getVote());
			}
    }
    
    public void showpricerank() {
    	
        if(foodlist.isEmpty()) {
        	return;
        }
    	for (int i=0 ; i < foodlist.size(); i++ ) {
    			System.out.println(i+1 +": �s��  " + foodlist.get(i).getStoreID()+"   ���W  " + foodlist.get(i).getName()+ "   ����  "+foodlist.get(i).getPrice());
			}
    }
    
    public void showdistancerank() {
    	
        if(foodlist.isEmpty()) {
        	return;
        }
    	for (int i=0 ; i < foodlist.size(); i++ ) {
    			System.out.println(i+1 +": �s��  " + foodlist.get(i).getStoreID()+"   ���W  " + foodlist.get(i).getName()+ "   �Z��  "+foodlist.get(i).getLocation());
			}
    }
    
    public void searchShop() {
    	String ID;
    	boolean nosearch = true;
        if(foodlist.isEmpty()) {
        	return;
        }
        else {
        	System.out.println("��J�s���d�ݩ��a���ԲӸ�T:  \n��J99�Y�i�h�X�C");
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
        			System.out.println("�S���z�Q�n�����a�C");
        		}
        }
        }
    }
}


    