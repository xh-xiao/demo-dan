package com.xx.service;

import org.springframework.stereotype.Service;
@Service
public class UserSerevice {
    /**
     * 添加用户
     */
    public int addUser(){
        System.out.println("add user success !");
        return 1;
    }

    public int delUser(){
        System.out.println("del user success !");
        return 1;
    }
}
