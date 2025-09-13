package com.joysistvi.abstractionactivity.day28;

public class SavingsAccount extends Account implements Transaction {
    public double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountInfo() {
        System.out.println("====Savings Account Information====");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount);
        System.out.println("New Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount);
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}
