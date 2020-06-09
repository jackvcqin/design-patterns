package com.example.designpatterns.transaction.service;

import com.example.designpatterns.DesignPatternsApplication;
import com.example.designpatterns.transaction.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DesignPatternsApplication.class)
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void testUpdateBalance() throws Exception {
        accountService.updateBalance();
    }

}