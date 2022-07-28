package com.qa.example;

public class BuildBankAccount {

	public static void main(String[] args) {
		//BankAccount account1 = BankAccount.newBankAccount();
		
		BankAccount account2 = new BankAccount(122.43F, 6676886789L);
		System.out.println(account2.balance);

	}

}
