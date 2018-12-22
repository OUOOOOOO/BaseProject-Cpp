package com.github;

import java.io.*;
import java.util.*;

/**
 * ±b¤á¨t²Î
 * @author admin 
 *
 */
public class SystemAccount {
	
	private String user = null;
	private String password = null;
	private boolean controller = true;
	private boolean checktheSame = true;
	private static String filePath = "C:\\test"; //Default path
	private final String userAccount = "userAccount.txt";
	
	public SystemAccount(String user, String passwd) {
		
		if(controller == true) {
			
			if(user.length() >= 4 && user.length() < 16 ) {
				
				if(passwd.length() >= 6 && passwd.length() < 18) {
					
					this.checkFileExist();					
					this.user = user;
					this.password = passwd;
					this.checkUserExist();
					
					if(checktheSame == true) {
							
						this.storeUserAccount(user, passwd, filePath);
						this.controller = false;
						
					}
						
					else {
							
						System.out.println("Error: the UserName has been create");
							
					}
					
				}
				
				else {
					
					System.out.println("Error: Password must have more than 6 words");
					this.user = user;
					this.password = "N/A";
					
				}//password error elimination
				
			}
			
			else {
				
				System.out.println("Error: User name must have more than 4 words");
				this.user = "N/A";
				
			}//user error elimination
		}
		
		else {
			
			System.out.println("Permission denied");
			
		}
	} // end of constructor
	
	public void setController(boolean control) {
		
		this.controller = control;
		
	}
	
	public void setUser(String user) {
		
		if(controller == true) {
			
			if(user.length() >= 4 && user.length() < 16 ) {
				
				this.user = user;
			
			}
			
			else {
				
				System.out.println("Error: User name must have more than 4 words");
				
			}
			
		}
		
		else {
			
			System.out.println("Permission denied");
			
		}
		
	}
	
	public String getUser() {
		
		return user;
		
	}
	
	public void setPassword(String passwd) {
		
		if(controller == true) {
			
			if(password.length() > 4 && password.length() < 16 ) {
				
				this.password = passwd;
			
			}
			
			else {
				
				System.out.println("Error: User name must have more than 4 words");
				
			}
			
		}
		
		else {
			
			System.out.println("Permission denied");
			
		}
		
	}
	
	public String getPassword() {
		
		return password;
		
	}
	
	public void checkFileExist() {
		
		File dir = new File(filePath);
		
		if(dir.exists() == false) {
			
			System.out.println("Error: Folder is not exist");
			System.out.println("(System is create one automatically)");
			dir.mkdir();
			
		}//check for dir whether exist
		
		File file = new File(filePath + "\\" + userAccount);
		
		if(file.exists() == false) {
			
			try {
				
				file.createNewFile();
				
			}
			
			catch(Exception e) {
				
				e.printStackTrace();
				
			}
		}// check for file whether exist
		
	}
	
	public void storeUserAccount(String storedUser, String storedPasswd, String filePath) {
		
		File dir = new File(filePath);
		
		if(dir.exists() == false) {
			
			dir.mkdir();
			
		}//check for dir whether exist
		
		File file = new File(filePath + "\\" + userAccount);
		
		if(file.exists() == false) {
			
			try {
				
				file.createNewFile();
				
			}
			
			catch(Exception e) {
				
				e.printStackTrace();
				
			}
		}// check for file whether exist
		
		try {
			
			FileWriter write = new FileWriter(file, true);
			write.write(user + ", " + password + "\n");
			write.close();
			
		}
		
		catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("Error: Invalid destination");
			
		}
		
		
		
	}//output to .txt file for store information
	
	public boolean checkUserExist() {
		
		StringTokenizer token = null;
		String checkPoint;
		Scanner checkPath = null;
		
		try {
			
			checkPath = new Scanner(new FileInputStream(filePath + "\\" + userAccount));
			
			if(checkPath.hasNextLine()) {
				
				while(checkPath.hasNext()) {
					
					checkPoint = checkPath.next();
					token = new StringTokenizer(checkPoint);
					
					while(token.hasMoreTokens()) {
						
						if(token.nextToken().equals(user + ",")) {
							
							this.checktheSame = false;
						
						}
						
					}
				
				}
				
			}
			
			else {
				
				System.out.println("Error: the file is empty");
				System.out.println("Please try input again.");
				
				File junk = new	File(filePath + "\\" + userAccount);
				
				try {
					
					FileWriter write = new FileWriter(junk, true);
					write.write("UserName" + ", " + "Password" + " :\n");
					write.close();
					System.exit(0);
					
				}
				
				catch(Exception e) {
					
					e.printStackTrace();
					System.out.println("Error: Invalid destination");
					
				}
				
			} // end of checkEmpty
			
		}
		
		catch(FileNotFoundException e) {
			
			e.printStackTrace();
			
		}
		
		return checktheSame;
		
	}
	
	public String toString() {
		
		return ("User Name : " + user);
		
	}
	
	/*public void main() {
		
		String inputUser = null, inputPasswd = null;
		Scanner scan = new Scanner(System.in);
		SystemAccount[] user_ = new SystemAccount[100];
		int i = 1;
		boolean control = false;
		String controller;
		
		
			do {
				
				System.out.print("Please Enter Your Username >> ");
				inputUser = scan.nextLine();
				System.out.print("Please Enter Your Password >> ");
				inputPasswd = scan.nextLine();
				user_[i] = new SystemAccount(inputUser, inputPasswd);
				System.out.println("Do you want to contiune input data?");
				System.out.print("(Yes/No) >> ");
				controller = scan.nextLine();
				controller = controller.toLowerCase();
				
				if(controller.equals("yes") || controller.equals("y")) {
					
					control = true;
					
				}
				
				else if(controller.equals("no") || controller.equals("n")) {
					
					control = false;
					
				}
			
			}while(control == true);
			
	}*/
	
}
