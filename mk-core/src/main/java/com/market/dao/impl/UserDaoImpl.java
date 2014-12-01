package com.market.dao.impl;

import com.market.bean.User;

import com.market.dao.BaseDao;
import com.market.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    public User getUserById(String userId) {
        return (User) this.queryForObject("UserDao.getUserById", userId);
    }
}
