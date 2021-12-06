package com.ma.dao;


/**
 * @author ASUS
 */
public class UserDaoMysqlImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("Mysql获取用户数据！");
    }
}
