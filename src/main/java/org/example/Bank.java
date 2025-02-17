package org.example;

import java.util.ArrayList;

public class Bank {

    // Declare an ArrayList to store Account objects
    private ArrayList<Account> accounts;

    // Constructor for the Bank class
    public Bank() {
        // Initialize the accounts ArrayList
        accounts = new ArrayList<Account>();
    }

    //method to add an account to the collection
    public void add_Account(Account addAccount) {
        accounts.add(addAccount);
    }

    //method to remove an account from the collection
    public void remove_Account(Account removeAccount) {
        accounts.remove(removeAccount);
    }

    //method to add money to an account
    public void add_Money(Account account, double amount) {
        account.deposit(amount);
    }

    //method to remove money from an account
    public void remove_Money(Account account, double amount) {
        account.withdraw(amount);
    }

    // Method to get the list of all accounts
    public ArrayList<Account> getAccounts() {
        // Return the accounts ArrayList
        return accounts;
    }
}
