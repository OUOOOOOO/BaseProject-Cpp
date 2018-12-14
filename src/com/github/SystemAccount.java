package com.github;

import java.io.*;

/**
 * ±b¤á¨t²Î
 * @author Perry
 *
 */
public class SystemAccount {
	
	private String user = null;
	private String password = null;
	private boolean controller = true;
	
	public SystemAccount(String user, String passwd) {
		
		if(controller == true) {
			
			if(user.length() > 4 && user.length() < 16 ) {
				
				if(passwd.length() >= 6 && passwd.length() < 18) {
					
					this.user = user;
					this.password = passwd;
					this.controller = false;
					
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
			
			if(user.length() > 4 && user.length() < 16 ) {
				
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
	
	public String toString() {
		
		return ("User Name : " + user);
		
	}
	
	public static void main(String[] args) {
		
		
		
	}
	
}
