package com.masai.Service;

import com.masai.Dao.AccountDao;
import com.masai.Entity.Account;

public class AccountServiceImpl implements AccountService{

	AccountDao accountDao;
   double interestRate;
	



	public void setAccountDao(AccountDao accountDao) {
	this.accountDao = accountDao;
}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public String regsiteredAccount(Account account) {
	
		return accountDao.regsiteredAccount(account);
	}

	public String updateAccount(Account account) {

		return accountDao.updateAccount(account) ;
	}

	public String withdrawCash(int accountNo, int amount) {
		
		return accountDao.withdrawCash(accountNo, amount);
	}

	public String depositeCash(int accountNo, int amount) {

		return accountDao.depositeCash(accountNo, amount);
	}

	public Account getAccountByAccNo(int accountNo) {
	
		return accountDao.getAccountByAccNo(accountNo);
	}

	public String calculateInterest(int accountNo) {
	String out="account interst is not add";
	Account account=accountDao.getAccountByAccNo(accountNo);
	if(account!=null) {
		
		double bal=account.getBalance();
	    int intAmt=(int) ((bal*(interestRate))/100);
	   String rs= accountDao.depositeCash(accountNo, intAmt);
		
	
		   
		   out="account interst "+ intAmt+" is successfully add";
		
	  
	}
	else {
		
		out="Account id invalid please give proper id";
	}
	
	return out;
	}
	
	
	
}
