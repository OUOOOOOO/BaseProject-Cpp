package com.github;

import java.util.Scanner;

public class SystemManage {
	
	private SystemAccount systemAccount;
	Scanner scan;
	
	public SystemManage() {
		
		
		
	}
	
	public boolean login() {
		
		String inputS, inputUser = null, inputPasswd = null;
		int inputI = 1;
		scan = new Scanner(System.in);
		boolean control = true;
		
		System.out.println("1.Default login");
		System.out.println("2.User login");
		System.out.print(">> ");
		inputI = scan.nextInt();
		
		if(inputI == 1) {
			
			control = false;
			
		}
		
		else if(inputI == 2){
			
			System.out.println("1.User login");
			System.out.println("2.Create Account\n(If you don't have Account)");
			System.out.print(">> ");
			inputI = scan.nextInt();
			
			if(inputI == 1) {
				
				System.out.print("User :");
				inputUser = scan.next();
				
				if(inputUser.equals("A0000")) {
					
					System.out.print("Password :");
					inputPasswd = scan.next();
					
					if(inputPasswd.equals("123456")) {
						
						control = true;
						
					}
					
					else {
						
						System.out.println("Error: Wrong Password");
						System.exit(0);
						
					}
					
				}
				
				else {
					
					System.out.println("Error: Wrong UserName");
					System.exit(0);
					
				}
			}
		
			else if(inputI == 2) {
				
				System.out.print("Please Enter Your UserName >> ");
				inputUser = scan.next();
				System.out.print("Please Enter Your Password >> ");
				inputPasswd = scan.next();
				systemAccount = new SystemAccount(inputUser, inputPasswd);
				
				System.out.println("Your Account created successed.");
				
			}
			
		}
		
		//scan.close();
		
		return control;
		
	}
	
}
