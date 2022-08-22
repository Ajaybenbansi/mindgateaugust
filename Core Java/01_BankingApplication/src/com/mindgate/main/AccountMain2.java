package com.mindgate.main;

import com.mindgate.pojo.Account;

public class AccountMain2 {
public static void main(String[] args) {
	
	System.out.println("This is accountversion2");
	
	Account account= new Account(102, "salman",5000);
	 System.out.println("withdraw :: 500");
	 boolean result =account.withdraw(500);
	 if(result)
		 System.out.println("transaction succseful!!");
	 else
		 System.out.println("Transaction Declined");
	 
	 System.out.println("balance:"+ account.getBalance());
}


}
