package com.cg.model;

public class Account {
	public long accNo;
	public double balance;
	public Person accHolder= new Person();
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person personDetails) {
		accHolder.setName(personDetails.getName());
		accHolder.setAge(personDetails.getAge());
	}
	
	public void deposit(double amount) {
		balance=amount+balance;
	}
	public void withdraw(double amount) {
		balance= balance-amount;
	}
	

}
