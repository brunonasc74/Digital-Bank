package com.company;

public class SavingsAccount extends Account{

    public SavingsAccount(Client client) {
        super(client);
    }

    @Override
    public void bankStatement() {
        System.out.println("-Checking Savings Account-");
        super.printInfo();

    }
}
