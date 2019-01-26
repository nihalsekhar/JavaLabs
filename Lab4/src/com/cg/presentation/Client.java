package com.cg.presentation;

import java.util.Random;
import com.cg.model.Account;
import com.cg.model.Person;

public class Client {
	public static void main(String[] args) {
		Person smithDetails= new Person();
		Person kathyDetails= new Person();

		Account smith= new Account();
		Account kathy= new Account();
		Random random= new Random();
		
		long smithaccNo=random.nextLong();
		
		smithDetails.setName("Smith");
		smithDetails.setAge(22);
		smith.setAccHolder(smithDetails);
		smith.setAccNo(smithaccNo);
		smith.setBalance(2000);
		
		System.out.println(smithDetails.getName()+" account No is "+smithaccNo);
		
		
		long kathyaccNo=random.nextLong();

		kathyDetails.setName("Kathy");
		kathyDetails.setAge(25);
		kathy.setAccHolder(smithDetails);
		kathy.setAccNo(kathyaccNo);
		kathy.setBalance(3000);
		
		
		System.out.println(kathyDetails.getName()+" account No is "+kathyaccNo);
		
		smith.deposit(2000);
		kathy.withdraw(2000);
		
		System.out.println("Updated Balance for Smith is "+smith.getBalance());
		System.out.println("Updated Balance for Kathy is "+kathy.getBalance());
		
		
		System.out.println("=======================================");
		

		
	}

}
