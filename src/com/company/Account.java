package com.company;

public abstract class Account implements IAccount{

    private static int DEFAULT_AGENCY = 1;
    private static int SEQUENTIAL = 1;

    private int agency;
    private int number;
    private double balance;

    public Account(){

        this.agency = DEFAULT_AGENCY;
        this.number = SEQUENTIAL;
    }

    @Override
    public void withdraw(double valor) {

    }

    @Override
    public void deposit(double valor) {

    }

    @Override
    public void transfer(double valor, Account destinedAccount) {

    }

    public int getAgency() {
        return agency;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }
}
