package com.dzhenenko.spring_patterns.demo.factory;

public class FactoryPatternMain {
    public static void main(String[] args) {
        AccountFactory accountFactory = new AccountFactory();
        accountFactory.getAccount("CURRENT");

        Account savingAccount = accountFactory.getAccount("SAVING");
        savingAccount.accountType();

        Account currentAccount = accountFactory.getAccount("CURRENT");
        currentAccount.accountType();
    }

}
