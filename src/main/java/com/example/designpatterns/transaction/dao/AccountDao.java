package com.example.designpatterns.transaction.dao;

import com.example.designpatterns.transaction.entity.Account;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountDao {

    public int update(Account account);

}
