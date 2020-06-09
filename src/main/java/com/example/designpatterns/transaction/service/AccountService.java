package com.example.designpatterns.transaction.service;

import com.example.designpatterns.transaction.dao.AccountDao;
import com.example.designpatterns.transaction.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Transient;
import org.springframework.stereotype.Service;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountService {

    @Autowired
    private AccountDao accountDao;

    public void updateBalance() throws Exception {
        addBalance();
        reduceBalance();
    }

    @Transactional(rollbackFor = Exception.class)
    private void addBalance() throws Exception {
        Account account = new Account();
        account.setId(1);
        account.setAccountBalance(5);
        accountDao.update(account);
    }

    @Transactional(rollbackFor = Exception.class)
    private void reduceBalance() throws Exception {
        if(true)
            throw new Exception("扣减失败");
        Account account = new Account();
        account.setId(1);
        account.setAccountBalance(-5);
        accountDao.update(account);
    }

}
