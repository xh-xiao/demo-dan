package com.xx.service;

import com.xx.DemoApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(classes = DemoApplication.class)
class UserSereviceTest {

    @Autowired
    UserSerevice userSerevice;

    @Test
    void addUser() {
        int row=userSerevice.addUser();
        System.out.println(row);
    }

    @Test
    void delUser() {
    }
}