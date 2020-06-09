package com.example.designpatterns.transaction.entity;

import java.io.Serializable;

public class Account implements Serializable {

    private int id;
    private String accountName;
    private int accountBalance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "Account [id="+id+",accountName="+accountName+",accountBalance="+accountBalance+"]";
    }
}
