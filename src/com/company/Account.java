package com.company;

public abstract class Account implements IAccount{

    private static int DEFAULT_AGENCY = 1;
    private static int SEQUENTIAL = 1;

    protected int agency;
    protected int number;
    protected double balance;
    protected Client client;

    public Account(Client client){
        this.agency = DEFAULT_AGENCY;
        this.number = SEQUENTIAL++;
        this.client = client;
    }

    @Override
    public void withdraw(double value) {

        this.balance -= value;
    }

    @Override
    public void deposit(double value) {

        this.balance += value;
    }

    @Override
    public void transfer(double value, Account destinedAccount) {

        this.deposit(value);
        destinedAccount.withdraw(value);
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

    protected void printInfo() {
        System.out.println(String.format("User: %s", this.client.getName()));
        System.out.println(String.format("Agency: %d", this.agency));
        System.out.println(String.format("Number: %d", this.number));
        System.out.println(String.format("Balance: %.2f", this.balance));
    }
}
