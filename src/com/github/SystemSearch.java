package com.github;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner; 

/**
 * 搜尋功能
 * @author Admin
 *
 */
public class SystemSearch {
    private Map<String, Store> listStore;
    private String storeid;
    private String storename;
    private String foodtype;
    private int minimum_price;
    private int maximum_price;
    private double minimum_vote;
    private double maximum_vote;
    private int minimum_distance;
    private int maximum_distance;
    private boolean NotFound;
    
    private boolean nameSearch;
    private boolean idSearch;
    private boolean foodtypeSearch;
    private boolean priceSearch;
    private boolean voteSearch;
    private boolean distanceSearch;
    
    
//    storeID  = ID
//    name     = 名稱
//    foodtype = 食物類別
//    price    = 價格
//    vote     = 評價
//    location = 距離
    
    public SystemSearch(Map<String, Store> listStore) {
        this.listStore = listStore;
	}
	
	public boolean setSearch() {
		Scanner scan = new Scanner(System.in);
		String word;
		int type = 0;
		nameSearch = false;
		idSearch = false;
		foodtypeSearch = false;
		priceSearch = false;
		voteSearch = false;
		distanceSearch = false;
		
		System.out.println("要使用何種搜尋方式?");
		System.out.println("1.店名 2.編號 3.其他 99.退出");
		type = scan.nextInt();
		while(true) {
			if(type == 1) {
				System.out.println("--------------------------------------");
				System.out.println("請輸入店家名稱：");
				storename = scan.nextLine();
				storename = scan.nextLine();
				nameSearch = true;
				break;
			}else if(type == 2) {
			    System.out.println("--------------------------------------");
                System.out.println("請輸入店家編號：");
                storeid = scan.nextLine();
                storeid = scan.nextLine();
                idSearch = true;
				break;
			}else if(type == 3) {
                break;
            }else if(type == 99) {
				return false;
				
			}else {
				System.out.println("您輸入的代碼無效，請重新輸入");
				System.out.println();
				System.out.println("要使用何種搜尋方式?");
		        System.out.println("1.店名 2.編號 3.其他 99.退出");
				type = scan.nextInt();
			}	
		}
		
		if(nameSearch) {
		    return true;
		}
		
		if(idSearch) {
            return true;
        }
		
		System.out.println("--------------------------------------");
		System.out.println("請輸入你的食物種類：");
		System.out.println("1.飯類  2.麵類  3.其他  0.不考慮食物種類");
		type = scan.nextInt();
		while(true) {
			if(type == 1) {
				foodtype = "rice";
				foodtypeSearch = true;
				break;
			}else if(type == 2) {
				foodtype = "noodle";
				foodtypeSearch = true;
				break;
			}else if(type == 3) {
				foodtype = "others";
				foodtypeSearch = true;
				break;
			}else if(type == 0) {
				break;
			}else if(type == 99) {
				return false;
			}else {
				System.out.println("您輸入的代碼無效，請重新輸入");
				System.out.println();
				System.out.println("請輸入你的食物種類：");
				System.out.println("1.飯類  2.麵類  3.其他  0.不考慮食物種類");
				type = scan.nextInt();
			}	
		}
		
		System.out.println("--------------------------------------");
		System.out.println("請輸入你的價格區間：");
		System.out.println("1.0~100元  2.101~200元  3.201~300元  0.不考慮價格");
		type = scan.nextInt();
		while(true) {
			if(type == 1) {
				minimum_price = 0;
				maximum_price = 100;
				priceSearch = true;
				break;
			}else if(type == 2) {
				minimum_price = 101;
				maximum_price = 200;
				priceSearch = true;
				break;
			}else if(type == 3) {
				minimum_price = 201;
				maximum_price = 300;
				priceSearch = true;
				break;
			}else if(type == 0) {
				break;
			}else if(type == 99) {
				return false;
			}else {
				System.out.println("您輸入的代碼無效，請重新輸入");
				System.out.println();
				System.out.println("請輸入你的價格區間：");
				System.out.println("1.0~100元  2.101~200元  3.201~300元   0.不考慮價格");
				type = scan.nextInt();
			}	
		}
		
		System.out.println("--------------------------------------");
		System.out.println("請輸入店家的評價區間：");
		System.out.println("1.0~1  2.1~3  3.3~5  0.不考慮評價");
		type = scan.nextInt();
		while(true) {
			if(type == 1) {
				minimum_vote = 0;
				maximum_vote = 1;
				voteSearch = true;
				break;
			}else if(type == 2) {
				minimum_vote = 1;
				maximum_vote = 3;
				voteSearch = true;
				break;
			}else if(type == 3) {
				minimum_vote = 3;
				maximum_vote = 5;
				voteSearch = true;
				break;
			}else if(type == 0) {
				break;
			}else if(type == 99) {
				return false;
			}else {
				System.out.println("您輸入的代碼無效，請重新輸入");
				System.out.println();
				System.out.println("請輸入店家的評價區間：");
				System.out.println("1.0~1  2.1~3  3.3~5  0.不考慮評價");
				type = scan.nextInt();
			}	
		}
		
		System.out.println("--------------------------------------");
		System.out.println("請輸入店家的距離區間：");
		System.out.println("1.0~50  2.50~100  3.100~  0.不考慮距離");
		type = scan.nextInt();
		while(true) {
			if(type == 1) {
				minimum_distance = 0;
				maximum_distance = 50;
				distanceSearch = true;
				break;
			}else if(type == 2) {
				minimum_distance = 50;
				maximum_distance = 100;
				distanceSearch = true;
				break;
			}else if(type == 3) {
				minimum_distance = 100;
				maximum_distance = 999;
				distanceSearch = true;
				break;
			}else if(type == 0) {
				break;
			}else if(type == 99) {
				return false;
				
			}else {
				System.out.println("您輸入的代碼無效，請重新輸入");
				System.out.println();
				System.out.println("請輸入店家的距離區間：");
				System.out.println("1.0~50  2.50~100  3.100~  0.不考慮距離");
				type = scan.nextInt();
			}	
		}
		return true;
	}
	
	public void Searching() {
		for(Store s : listStore.values()) {
        	if (nameSearch) {
        		if(s.getName().equals(storename)){
        		    System.out.println(s.getFullDes());
        		    NotFound = false;
//        			if (foodtypeSearch) {
//                		if(s.getFoodtype().equals(foodtype)){
//                			if (priceSearch) {
//                    			if(minimum_price <= s.getPrice() && s.getPrice() <= maximum_price) {
//                    				if (voteSearch) {
//                        				if(minimum_vote <= s.getVote() && s.getVote() <= maximum_vote) {
//                        					if (distanceSearch) {
//                            					if(minimum_distance <= s.getLocation() && s.getLocation() <= maximum_distance) {
//                            						System.out.println(s);
//                            						NotFound = false;
//                            					}
//                            				}else {
//                            					System.out.println(s);
//                        						NotFound = false;
//                            				}	
//                        				}
//                        			}else {
//                        				if (distanceSearch) {
//                        					if(minimum_distance <= s.getLocation() && s.getLocation() <= maximum_distance) {
//                        						System.out.println(s);
//                        						NotFound = false;
//                        					}
//                        				}else {
//                        					System.out.println(s);
//                    						NotFound = false;
//                        				}
//                        			}
//                    			}
//                    		}else {
//                    			if (voteSearch) {
//                    				if(minimum_vote <= s.getVote() && s.getVote() <= maximum_vote) {
//                    					if (distanceSearch) {
//                        					if(minimum_distance <= s.getLocation() && s.getLocation() <= maximum_distance) {
//                        						System.out.println(s);
//                        						NotFound = false;
//                        					}
//                        				}else {
//                        					System.out.println(s);
//                    						NotFound = false;
//                        				}	
//                    				}
//                    			}else {
//                    				if (distanceSearch) {
//                    					if(minimum_distance <= s.getLocation() && s.getLocation() <= maximum_distance) {
//                    						System.out.println(s);
//                    						NotFound = false;
//                    					}
//                    				}else {
//                    					System.out.println(s);
//                						NotFound = false;
//                    				}
//                    			}
//                    		}
//                		}
//                	}else {
//                		if (priceSearch) {
//                			if(minimum_price <= s.getPrice() && s.getPrice() <= maximum_price) {
//                				if (voteSearch) {
//                    				if(minimum_vote <= s.getVote() && s.getVote() <= maximum_vote) {
//                    					if (distanceSearch) {
//                        					if(minimum_distance <= s.getLocation() && s.getLocation() <= maximum_distance) {
//                        						System.out.println(s);
//                        						NotFound = false;
//                        					}
//                        				}else {
//                        					System.out.println(s);
//                    						NotFound = false;
//                        				}	
//                    				}
//                    			}else {
//                    				if (distanceSearch) {
//                    					if(minimum_distance <= s.getLocation() && s.getLocation() <= maximum_distance) {
//                    						System.out.println(s);
//                    						NotFound = false;
//                    					}
//                    				}else {
//                    					System.out.println(s);
//                						NotFound = false;
//                    				}
//                    			}
//                			}
//                		}else {
//                			if (voteSearch) {
//                				if(minimum_vote <= s.getVote() && s.getVote() <= maximum_vote) {
//                					if (distanceSearch) {
//                    					if(minimum_distance <= s.getLocation() && s.getLocation() <= maximum_distance) {
//                    						System.out.println(s);
//                    						NotFound = false;
//                    					}
//                    				}else {
//                    					System.out.println(s);
//                						NotFound = false;
//                    				}	
//                				}
//                			}else {
//                				if (distanceSearch) {
//                					if(minimum_distance <= s.getLocation() && s.getLocation() <= maximum_distance) {
//                						System.out.println(s);
//                						NotFound = false;
//                					}
//                				}else {
//                					System.out.println(s);
//            						NotFound = false;
//                				}
//                			}
//                		}
//                	}
            	}
            }else if(idSearch){
                if(s.getStoreID().equals(storeid)){
                    System.out.println(s.getFullDes());
                    NotFound = false;
                }
            }else {
            	if (foodtypeSearch) {
            		if(s.getFoodtype().equals(foodtype)){
            			if (priceSearch) {
                			if(minimum_price <= s.getPrice() && s.getPrice() <= maximum_price) {
                				if (voteSearch) {
                    				if(minimum_vote <= s.getVote() && s.getVote() <= maximum_vote) {
                    					if (distanceSearch) {
                        					if(minimum_distance <= s.getLocation() && s.getLocation() <= maximum_distance) {
                        						System.out.println(s);
                        						NotFound = false;
                        					}
                        				}else {
                        					System.out.println(s);
                    						NotFound = false;
                        				}	
                    				}
                    			}else {
                    				if (distanceSearch) {
                    					if(minimum_distance <= s.getLocation() && s.getLocation() <= maximum_distance) {
                    						System.out.println(s);
                    						NotFound = false;
                    					}
                    				}else {
                    					System.out.println(s);
                						NotFound = false;
                    				}
                    			}
                			}
                		}else {
                			if (voteSearch) {
                				if(minimum_vote <= s.getVote() && s.getVote() <= maximum_vote) {
                					if (distanceSearch) {
                    					if(minimum_distance <= s.getLocation() && s.getLocation() <= maximum_distance) {
                    						System.out.println(s);
                    						NotFound = false;
                    					}
                    				}else {
                    					System.out.println(s);
                						NotFound = false;
                    				}	
                				}
                			}else {
                				if (distanceSearch) {
                					if(minimum_distance <= s.getLocation() && s.getLocation() <= maximum_distance) {
                						System.out.println(s);
                						NotFound = false;
                					}
                				}else {
                					System.out.println(s);
            						NotFound = false;
                				}
                			}
                		}
            		}
            	}else {
            		if (priceSearch) {
            			if(minimum_price <= s.getPrice() && s.getPrice() <= maximum_price) {
            				if (voteSearch) {
                				if(minimum_vote <= s.getVote() && s.getVote() <= maximum_vote) {
                					if (distanceSearch) {
                    					if(minimum_distance <= s.getLocation() && s.getLocation() <= maximum_distance) {
                    						System.out.println(s);
                    						NotFound = false;
                    					}
                    				}else {
                    					System.out.println(s);
                						NotFound = false;
                    				}	
                				}
                			}else {
                				if (distanceSearch) {
                					if(minimum_distance <= s.getLocation() && s.getLocation() <= maximum_distance) {
                						System.out.println(s);
                						NotFound = false;
                					}
                				}else {
                					System.out.println(s);
            						NotFound = false;
                				}
                			}
            			}
            		}else {
            			if (voteSearch) {
            				if(minimum_vote <= s.getVote() && s.getVote() <= maximum_vote) {
            					if (distanceSearch) {
                					if(minimum_distance <= s.getLocation() && s.getLocation() <= maximum_distance) {
                						System.out.println(s);
                						NotFound = false;
                					}
                				}else {
                					System.out.println(s);
            						NotFound = false;
                				}	
            				}
            			}else {
            				if (distanceSearch) {
            					if(minimum_distance <= s.getLocation() && s.getLocation() <= maximum_distance) {
            						System.out.println(s);
            						NotFound = false;
            					}
            				}else {
            					System.out.println(s);
        						NotFound = false;
            				}
            			}
            		}
            	}
            }
        }
	}
	
	public void Search() {
		if(listStore.isEmpty()) {
        	System.out.println("並沒有任何店家資訊。");
            return;
        }
		
		
		while(true) {
			boolean wantToSreach = this.setSearch();
			if(wantToSreach) {
				
			}else {
				System.out.println("返回主畫面");
				return;
			}
			
	        NotFound = true;
	        System.out.println("。");
	        System.out.println("。");
	        System.out.println("。");
			this.Searching();
			
			if(NotFound) {
				System.out.println("並沒有您所想要的店家。");
			}
			
	        Scanner scan = new Scanner(System.in);
	        System.out.println("是否要再次搜尋?");
	        System.out.println("1.是 2.否");
	        int type = scan.nextInt();
		    
	        while(true) {
	        	if(type == 1) {
	        		System.out.println("--------------------------------------");
	        		break;
	            }else if(type == 2) {
	            	System.out.println("返回主畫面");
	            	return;
	            }else{
	            	System.out.println("您輸入的代號無效，請重新輸入");
	            	System.out.println();
	            }
	        }
		}
    }    
//        for(Store s : listStore.values()) {
//        	if(s.getName().equals(storename) && nameSearch) {
//        		if(s.getFoodtype().equals(foodtype) && foodtypeSearch) {
//        			if(minimum_price <= s.getPrice() && s.getPrice() <= maximum_price && priceSearch) {
//        				if(minimum_vote <= s.getVote() && s.getVote() <= maximum_vote && voteSearch) {
//        					if(minimum_distance <= s.getLocation() && s.getLocation() <= maximum_distance && distanceSearch) {
//        						System.out.println(s);
//        						NotFound = false;
//        					}	
//        				}
//        			}
//        		}
//        	}
//        }
        
}