package com.qa.example;

public class BankAccount {
	
    public float balance = 0;
    private long accountNum;

    private BankAccount(long newAccountNum) {
        this.accountNum = newAccountNum;
    }

    public BankAccount(float newBalance, long newAccountNum) {
        this(newAccountNum);
        this.balance = newBalance;
    }

    public static BankAccount newBankAccount() {
        return new BankAccount(80105101114115L);
    }

	public float getBalance() {
		return balance;
	}
	

}
