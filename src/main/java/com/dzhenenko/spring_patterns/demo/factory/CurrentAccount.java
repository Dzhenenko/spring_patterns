package com.dzhenenko.spring_patterns.demo.factory;

public class CurrentAccount implements Account {
    @Override
    public void accountType() {
        System.out.println("CURRENT ACCOUNT");
    }
}
