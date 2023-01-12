package com.masai.Persentation;

import com.masai.Entity.Account;
import com.masai.Service.AccountService;

public class AccountPersentation {

	AccountService accountService;

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}
	
	
	public void regsiteredAccount(Account account) {
	
	 String rs=accountService.regsiteredAccount(account);	
	System.out.println(rs);
	}
	
	public void updateAccount(Account account) {
		
		 String rs=accountService.updateAccount(account);	
			System.out.println(rs);
	}

	public void withdrawCash(int accountNo,int amount ) {
		 String rs=accountService.withdrawCash(accountNo, amount);	
			System.out.println(rs);
		
	}
	public void depositeCash(int accountNo,int amount) {
		
		 String rs=accountService.depositeCash(accountNo, amount);	
			System.out.println(rs);
	}
	public void getAccountByAccNo(int accountNo) {
		
		Account account=accountService.getAccountByAccNo(accountNo);
		
		if(account!=null) {
         System.out.println("name     :  "+account.getName());
         System.out.println("Address :  "+account.getAddress());
         System.out.println("balance  :  "+account.getBalance());
			
		}
		else {
			System.out.println("Account is not Present Given Account Number");

		}
		
		
	}
	
	public String calculateInterest(int accountNo) {
	 String rs=	accountService.calculateInterest(accountNo);
		System.out.println(rs);
	 return rs;
	}
	
}
