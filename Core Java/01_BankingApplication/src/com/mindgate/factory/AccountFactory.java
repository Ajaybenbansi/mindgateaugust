package com.mindgate.factory;

import com.mindagte.pojo.Account;
import com.mindagte.pojo.Current;
import com.mindagte.pojo.Savings;

public class AccountFactory {
	public Account getAccount(int choice) {
		if (choice == 1) {
			return new Savings();

		}
		if (choice == 2) {
			return new Current();

		}
		return null;
	}

}
