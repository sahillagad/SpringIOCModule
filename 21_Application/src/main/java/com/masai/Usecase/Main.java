package com.masai.Usecase;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.masai.Entity.Account;
import com.masai.Persentation.AccountPersentation;

public class Main {

 
	
	public static void main(String[] args) {
		
		ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
	AccountPersentation persentation=app.getBean("accountPersentation",AccountPersentation.class);
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("press 1  For Deposite Amount");
		System.out.println("press 2  For get account");
		System.out.println("press 3  For registered account");
		System.out.println("press 4  For  update account");
		System.out.println("press 5  For  withdraw amount");
		System.out.println("Press 6 for calculate Interest");
		
		int output=sc.nextInt();
		
		if(output==1) {
			System.out.println("Enter Account Number");
			int accountNo= sc.nextInt();
			
			System.out.println("Enter deposite amount");
			int amount= sc.nextInt();
			
			persentation.depositeCash(accountNo, amount);
			
		}
		if(output==2) {
			System.out.println("Enter Account Number");
			int accountNo= sc.nextInt();
			persentation.getAccountByAccNo(accountNo);
		}
		if(output==3) {
			
						
			System.out.println("Enter Address");
			String add= sc.next();
			
			System.out.println("Enter name");
		    String name=sc.next();
			
			System.out.println("Enter Account balance");
			double bal=sc.nextDouble();
			
			Account account=new Account(name, add, bal);
			
			persentation.regsiteredAccount(account);
		}
		if(output==4) {
			
			System.out.println("Enter Account Number");
			int  accountNo=sc.nextInt();
			
			System.out.println("Enter Address");
			String add= sc.next();
			
			System.out.println("Enter name");
		    String name=sc.next();
			
		    Account account=new Account(accountNo, name, add);
		    
		    persentation.updateAccount(account);
		}
		if(output==5) {
			System.out.println("Enter Account Number");
			int accountNo= sc.nextInt();
			
			System.out.println("Enter withdraw amount");
			int amount= sc.nextInt();
			
			persentation.withdrawCash(accountNo, amount);
		}
		if(output==6) {
			System.out.println("Enter Account Number");
			int accountNo= sc.nextInt();
			persentation.calculateInterest(accountNo);
			
		}
		
	}
}
