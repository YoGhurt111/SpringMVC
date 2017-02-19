package com.yoghurt.controller;

import com.yoghurt.entity.User;
import com.yoghurt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    private UserService service;

    @RequestMapping(value = "addUser")
    public String add(@RequestParam Long id,@RequestParam String name,@RequestParam String pwd){
        User user=new User();
        user.setName(name);
        user.setId(id);
        user.setPwd(pwd);
        service.addUser(user);
        return "user";
    }
}
