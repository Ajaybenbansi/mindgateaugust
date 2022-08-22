package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Account;
import com.mindgate.pojo.Saving;

public class AccountMain4 {

	public static void main(String[] args) {
		double amount;
		boolean result;
		String choice;
		boolean isSalary;
        
		String name;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter name");
		name = scanner.nextLine();

		double balance;
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("enter balance");
		balance = scanner.nextDouble();

		int accountNumber;
		Scanner scanner3 = new Scanner(System.in);
		System.out.println("enter accountno");
		accountNumber = scanner.nextInt();
		System.out.println("Do you want to open salary account? (True/False)");
		isSalary=scanner.nextBoolean();
		Saving account=new Saving(accountNumber,name,balance,isSalary);

		

		//System.out.println(account3);
	
	
	 int option;
	 
	 do {
	Scanner sc = new Scanner(System.in);
	System.out.println("press 1 for withdrwa");
	System.out.println("press 2 for deposit");
	System.out.println("press 3 for balance");
	option=sc.nextInt();
	  switch (option) {
	case 1: 
		System.out.println("enter amount");
		amount=sc.nextDouble();
		result=account.withdraw(amount);
		if(result)
			System.out.println("transaction succesfull");
		else
			System.out.println("transaction Declined");
		break;
		
	case 2: 
		System.out.println("enter amount");
		amount=sc.nextDouble();
		result=account.deposit(amount);
		if(result)
			System.out.println("transaction succesfull");
		else
			System.out.println("transaction Declined");
		break;
		
	case 3:
		System.out.println("Balance::"+account.getBalance());
		break;
		
	default:
		System.out.println("invalid response");
		break;
	}
	  System.out.println("do you want to countinue?:: yes/no");
	  choice=sc.next();
	 }while(choice.equals("yes"));

	}

}
