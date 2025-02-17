package org.example;

import java.util.ArrayList;

public class Account {
    private String name, accountNumber;
    private double balance;

    //Constructor
    public Account(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //method to get name
    public String getName() {
        return name;
    }

    //method to set name
    public void setName(String accountName) {
        this.name = accountName;
    }

    //method to get accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    //method to set accountNumber
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    //method to get balance
    public double getBalance() {
        return balance;
    }

    //method to set balance
    public void setBalance(double accountBalance) {
        this.balance = accountBalance;
    }

    // Method to deposit a specified amount into the account
    public void deposit(double amount) {
        // Increase the balance by the specified amount
        balance += amount;
    }

    // Method to withdraw a specified amount from the account
    public void withdraw(double amount) {
        // Decrease the balance by the specified amount
        balance -= amount;
    }

    // Method to retrieve the account information
    public String getAccountInfo() {
        // Return a string containing the name, account number, and balance
        return "Name: " + name + ", Account Number: " + accountNumber + ", Balance: " + balance;
    }
}
