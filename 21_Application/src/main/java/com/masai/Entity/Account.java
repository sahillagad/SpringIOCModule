package com.masai.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {

	    @Id
	    @GeneratedValue(strategy =GenerationType.AUTO)
	    private int accId;
	    private String name;
	    private String address;
	    private double balance;
	    
	    
		public Account(int accId, String name, String address, double balance) {
			super();
			this.accId = accId;
			this.name = name;
			this.address = address;
			this.balance = balance;
		}


		public Account(int accId, String name, String address) {
			super();
			this.accId = accId;
			this.name = name;
			this.address = address;
		}


		public Account() {
			super();
		}


		public Account(String name, String address, double balance) {
			super();
			this.name = name;
			this.address = address;
			this.balance = balance;
		}


		public int getAccId() {
			return accId;
		}


		public void setAccId(int accId) {
			this.accId = accId;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getAddress() {
			return address;
		}


		public void setAddress(String address) {
			this.address = address;
		}


		public double getBalance() {
			return balance;
		}


		public void setBalance(double balance) {
			this.balance = balance;
		}


		@Override
		public String toString() {
			return "Account [accId=" + accId + ", name=" + name + ", address=" + address + ", balance=" + balance + "]";
		}
	    
	    
	
}
