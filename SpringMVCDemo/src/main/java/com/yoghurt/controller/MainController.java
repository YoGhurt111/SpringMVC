package com.yoghurt.controller;

import com.yoghurt.auth.AuthPassport;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {


    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "fail")
    public String failView(){
        return "fail";
    }
}
