package com.atguigu.spring5.service;

import com.atguigu.spring5.User;
import com.atguigu.spring5.dao.UserDao;
import com.atguigu.spring5.dao.UserDaoImpl;

public class UserService {

    //创建UserDap类型属性，生成set方法
    private UserDao userDao;
    public void setUserDao(UserDao userDao){
        this.userDao=userDao;
    }

    public void add(){
        System.out.println("service add.........");
        userDao.update();
        //创建userDao的对象的原始方式
        //UserDao userDao=new UserDaoImpl();
        //userDao.update();
    }
}
