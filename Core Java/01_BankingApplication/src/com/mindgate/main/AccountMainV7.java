import java.util.Scanner;

import com.mindagte.pojo.Account;
import com.mindagte.pojo.Current;
import com.mindagte.pojo.Savings;
import com.mindgate.factory.AccountFactory;

public class AccountMainV7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AccountFactory accountFactory=new AccountFactory();
		
		int choice;
		System.out.println("enter ypour choice: press 1 for savings and press 2 for current");
		
		choice= sc.nextInt();
		Account account=accountFactory.getAccount(choice);
		
		if(account instanceof Savings)
			System.out.println("savings Object Created");
		if(account instanceof Current)
			System.out.println("current Object Created");
		

	}

}
