package com.cg.model;

import com.cg.model.Account;

public class SavingAccount extends Account{
	
	final double minBalance=1000;

	@Override
	public void withdraw(double amount) {
		
		if((balance-amount)<=minBalance) {
			System.out.println("Cannot Withdraw");
		}else {
			System.out.println("Withdrawn");
			balance= balance-amount;
		}
	}

}
