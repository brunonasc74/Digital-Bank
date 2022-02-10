package com.company;

public class Main {
    public static void main(String[] args) {
        Client john = new Client();
        john.setName("John");

        Account checkingAccount = new CheckingAccount(john);
        checkingAccount.deposit(100);

        Account savingsAccount = new SavingsAccount(john);
        savingsAccount.transfer(25, checkingAccount);

        checkingAccount.bankStatement();
        savingsAccount.bankStatement();
    }
}
