package com.cg.presentation;

import java.util.Random;

import com.cg.model.CurrentAccount;
import com.cg.model.Person;
import com.cg.model.SavingAccount;

public class Client2 {
	
	public static void main(String[] args) {
		Person smithDetails= new Person();
		Person kathyDetails= new Person();

		CurrentAccount smith= new CurrentAccount();
		SavingAccount kathy= new SavingAccount();
		Random random= new Random();
		
		long smithaccNo=random.nextLong();
		if(smithaccNo<0) {
			smithaccNo=smithaccNo*(-1);
		}
		
		smithDetails.setName("Smith");
		smithDetails.setAge(22);
		smith.setAccHolder(smithDetails);
		smith.setAccNo(smithaccNo);
		smith.setBalance(2000);
		
		System.out.println(smithDetails.getName()+" account No is "+smithaccNo);
		
		
		long kathyaccNo=random.nextLong();
		if(kathyaccNo<0) {
			kathyaccNo=smithaccNo*(-1);
		}

		kathyDetails.setName("Kathy");
		kathyDetails.setAge(25);
		kathy.setAccHolder(smithDetails);
		kathy.setAccNo(kathyaccNo);
		kathy.setBalance(3000);
		
		
		System.out.println(kathyDetails.getName()+" account No is "+kathyaccNo);
		
		smith.deposit(2000);
		kathy.withdraw(2500);
		
		System.out.println("Updated Balance for Smith is "+smith.getBalance());
		System.out.println("Updated Balance for Kathy is "+kathy.getBalance());
		
		
		System.out.println("=======================================");
	}

}
