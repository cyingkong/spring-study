package com.ma.service;

import com.ma.dao.UserDao;
import com.ma.dao.UserDaoImpl;
import com.ma.dao.UserDaoMysqlImpl;
import com.ma.dao.UserDaoOracleImpl;

/**
 * @author ASUS
 */
@SuppressWarnings("all")
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    //利用set动态实现值的注入！
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
