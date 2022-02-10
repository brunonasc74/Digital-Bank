package com.company;

public class CheckingAccount extends Account {

    public CheckingAccount(Client client) {
        super(client);
    }

    @Override
    public void bankStatement() {
        System.out.println("-Checking Account Statement-");
        super.printInfo();

    }
}
