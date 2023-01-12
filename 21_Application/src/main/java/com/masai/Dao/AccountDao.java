package com.masai.Dao;

import com.masai.Entity.Account;

public interface AccountDao {
 
	public String regsiteredAccount(Account account);
	public String updateAccount(Account account);
	public String withdrawCash(int accountNo,int amount );
	public String depositeCash(int accountNo,int amount);
	public Account getAccountByAccNo(int accountNo);
	
	
}
