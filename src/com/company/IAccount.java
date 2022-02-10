package com.company;

public interface IAccount {

    void withdraw(double valor);

    void deposit(double valor);

    void transfer(double valor, Account destinedAccount);
}
