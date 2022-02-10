package com.company;

public abstract class Account implements IAccount{

    private int agency;
    private int number;
    private double balance;

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
