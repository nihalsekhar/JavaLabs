package com.cg.model;

import com.cg.model.Account;

public class CurrentAccount extends Account{
	
	public double overDraftLimit=5000;

	@Override
	public void withdraw(double amount) {
		if((balance-amount)>0) {
			if(amount>overDraftLimit) {
				System.out.println("Cannot withdraw limit exceeding");
			}else {
				balance= balance-amount;
			}
		}
		
	}
	
	
	
	
	
	
}
