package com.github;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner; 

/**
 * �j�M�\��
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
//    name     = �W��
//    foodtype = �������O
//    price    = ����
//    vote     = ����
//    location = �Z��
    
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
		
		System.out.println("�n�ϥΦ�طj�M�覡?");
		System.out.println("1.���W 2.�s�� 3.��L 99.�h�X");
		type = scan.nextInt();
		while(true) {
			if(type == 1) {
				System.out.println("--------------------------------------");
				System.out.println("�п�J���a�W�١G");
				storename = scan.nextLine();
				storename = scan.nextLine();
				nameSearch = true;
				break;
			}else if(type == 2) {
			    System.out.println("--------------------------------------");
                System.out.println("�п�J���a�s���G");
                storeid = scan.nextLine();
                storeid = scan.nextLine();
                idSearch = true;
				break;
			}else if(type == 3) {
                break;
            }else if(type == 99) {
				return false;
				
			}else {
				System.out.println("�z��J���N�X�L�ġA�Э��s��J");
				System.out.println();
				System.out.println("�n�ϥΦ�طj�M�覡?");
		        System.out.println("1.���W 2.�s�� 3.��L 99.�h�X");
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
		System.out.println("�п�J�A�����������G");
		System.out.println("1.����  2.����  3.��L  0.���Ҽ{��������");
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
				System.out.println("�z��J���N�X�L�ġA�Э��s��J");
				System.out.println();
				System.out.println("�п�J�A�����������G");
				System.out.println("1.����  2.����  3.��L  0.���Ҽ{��������");
				type = scan.nextInt();
			}	
		}
		
		System.out.println("--------------------------------------");
		System.out.println("�п�J�A������϶��G");
		System.out.println("1.0~100��  2.101~200��  3.201~300��  0.���Ҽ{����");
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
				System.out.println("�z��J���N�X�L�ġA�Э��s��J");
				System.out.println();
				System.out.println("�п�J�A������϶��G");
				System.out.println("1.0~100��  2.101~200��  3.201~300��   0.���Ҽ{����");
				type = scan.nextInt();
			}	
		}
		
		System.out.println("--------------------------------------");
		System.out.println("�п�J���a�������϶��G");
		System.out.println("1.0~1  2.1~3  3.3~5  0.���Ҽ{����");
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
				System.out.println("�z��J���N�X�L�ġA�Э��s��J");
				System.out.println();
				System.out.println("�п�J���a�������϶��G");
				System.out.println("1.0~1  2.1~3  3.3~5  0.���Ҽ{����");
				type = scan.nextInt();
			}	
		}
		
		System.out.println("--------------------------------------");
		System.out.println("�п�J���a���Z���϶��G");
		System.out.println("1.0~50  2.50~100  3.100~  0.���Ҽ{�Z��");
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
				System.out.println("�z��J���N�X�L�ġA�Э��s��J");
				System.out.println();
				System.out.println("�п�J���a���Z���϶��G");
				System.out.println("1.0~50  2.50~100  3.100~  0.���Ҽ{�Z��");
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
        	System.out.println("�èS�����󩱮a��T�C");
            return;
        }
		
		
		while(true) {
			boolean wantToSreach = this.setSearch();
			if(wantToSreach) {
				
			}else {
				System.out.println("��^�D�e��");
				return;
			}
			
	        NotFound = true;
	        System.out.println("�C");
	        System.out.println("�C");
	        System.out.println("�C");
			this.Searching();
			
			if(NotFound) {
				System.out.println("�èS���z�ҷQ�n�����a�C");
			}
			
	        Scanner scan = new Scanner(System.in);
	        System.out.println("�O�_�n�A���j�M?");
	        System.out.println("1.�O 2.�_");
	        int type = scan.nextInt();
		    
	        while(true) {
	        	if(type == 1) {
	        		System.out.println("--------------------------------------");
	        		break;
	            }else if(type == 2) {
	            	System.out.println("��^�D�e��");
	            	return;
	            }else{
	            	System.out.println("�z��J���N���L�ġA�Э��s��J");
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