package com.example.designpatterns.transaction.service;

import com.example.designpatterns.transaction.dao.AccountDao;
import com.example.designpatterns.transaction.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountDao accountDao;

    public Account updateBalance(){
        Account account = new Account();
        account.setId(1);
        account.setAccountBalance(10);
        accountDao.update(account);
        return account;
    }
}
