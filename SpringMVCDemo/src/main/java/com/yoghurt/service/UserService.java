package com.yoghurt.service;

import com.yoghurt.dao.UserDao;
import com.yoghurt.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired private UserDao dao;

    public void addUser(User user){
        dao.addUser(user);
    }
}
