package com.masai.Service;

import com.masai.Entity.Account;

public interface AccountService {
	public String regsiteredAccount(Account account);
	public String updateAccount(Account account);
	public String withdrawCash(int accountNo,int amount );
	public String depositeCash(int accountNo,int amount);
	public Account getAccountByAccNo(int accountNo);

	
	public String calculateInterest(int accountNo);
}
