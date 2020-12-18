package com.dzhenenko.spring_patterns.demo.factory;

public class SavingAccount implements Account{
    @Override
    public void accountType() {
        System.out.println("SAVING ACCOUNT");
    }
}
