package com.masai.Dao;

import javax.persistence.EntityManager;

import com.masai.Entity.Account;
import com.masai.Utility.EMUtility;

public class AccountDaoImpl implements AccountDao {

	public String regsiteredAccount(Account account) {
    String result="Account Not Registered...";
    EntityManager em=EMUtility.provideEntityManager();
    
    em.getTransaction().begin();
    
    em.persist(account);
   result="Account Is Registered Successfully";   
    
    em.getTransaction().commit();
    em.close();
   return result;
	}

	public String updateAccount(Account account) {
		   String result="Account Not Update...";
		    EntityManager em=EMUtility.provideEntityManager();
		    Account account2=em.find(Account.class,account.getAccId());
		    
		    if(account2!=null) {
		    em.getTransaction().begin();
		    
		 
		      account2.setAddress(account.getAddress());
		      account2.setName(account.getName());
		      
		    
		   result="Account Is Update Successfully";   
		    
		    em.getTransaction().commit();
		    em.close();
		    }
		    else {
		    	result="invalid Account Number...";
		    	
		    }
		   return result;
	
	}

	public String withdrawCash(int accountNo, int amount) {
		   String result="withdraw CashProcess Failed...";
		    EntityManager em=EMUtility.provideEntityManager();
		    Account account2=em.find(Account.class,accountNo);	   
		    
		    if(account2!=null) {
		    em.getTransaction().begin();
	 
		    if(account2.getBalance()>=amount) {
		     
		    	 account2.setBalance((account2.getBalance()-amount));
		    	result="Account Is Update Successfully";   
		    	
	
		    }
		    else {
		    	
		     	result="insafficent Account Balance ";
		    }
		     	em.getTransaction().commit();
		        em.close();

		    }
		    
		    else {
		    	result="invalid Account Number...";
		    	
		    }
		   return result;
		
	}

	public String depositeCash(int accountNo, int amount) {
		   String result="deposite Cash Process Failed...";
		    EntityManager em=EMUtility.provideEntityManager();
		    Account account2=em.find(Account.class,accountNo);	   
		    
		    if(account2!=null) {
		    em.getTransaction().begin();
	 
		    
		    account2.setBalance((account2.getBalance()+amount));
		    result="deposite successfully...";
		    em.getTransaction().commit();
            em.close();
           
		    }
		    else {
		    	result="invalid Account Number...";
		    }
		   return result;
		
	}

	public Account getAccountByAccNo(int accountNo) {

		 
		    EntityManager em=EMUtility.provideEntityManager();
		    Account account2=em.find(Account.class,accountNo);	   
		    
		    
		    
		    return account2;
	}
	
	
	

}
