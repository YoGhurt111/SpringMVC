package com.yoghurt.controller;

import com.yoghurt.auth.AuthPassport;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {

    @AuthPassport(needAuth = false)
    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }
}
