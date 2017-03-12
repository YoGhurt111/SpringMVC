package com.yoghurt.controller;

import com.yoghurt.auth.AuthPassport;
import com.yoghurt.entity.User;
import com.yoghurt.service.UserService;
import org.codehaus.jackson.map.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @Autowired
    private UserService service;

//    @RequestMapping(value = "addUser")
//    public String add(@RequestParam Long id,@RequestParam String name,@RequestParam String pwd){
//        User user=new User();
//        user.setName(name);
//        user.setId(id);
//        user.setPwd(pwd);
//        service.addUser(user);
//        return "user";
//    }
//
//    @RequestMapping(value = "deleteUserById", produces = "text/html;charset=UTF-8")
//    @ResponseBody
//    public String deleteById(@RequestParam Long id){
//        service.deleteUser(id);
//        return "id为" + id.toString() + "的用户已被删除";
//    }
//
//    @RequestMapping(value = "read", produces = "text/html;charset=UTF-8" )
//    @ResponseBody
//    public String read(@RequestParam Long id){
//        return service.read(id);
//    }

    @RequestMapping(value = "selectUser", produces = "text/html;charset=UTF-8" , method = RequestMethod.POST)
    public ModelAndView selectUser(User user){
        ModelAndView modelAndView = new ModelAndView();
        if (service.userExist(user)){
            modelAndView.addObject(user);
            modelAndView.setViewName("user");
            return modelAndView;
        }
        else {
            modelAndView.setViewName("index");
            return modelAndView;
        }
    }

    @RequestMapping(value = "A",  method = RequestMethod.GET)
    @AuthPassport
    public String differentView(String name){
//        if (name.equals("A")){
//            return "A";
//        }
//        else {
//            return "fail";
//        }
        return "A";
    }

}
