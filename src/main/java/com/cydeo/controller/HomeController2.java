package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController2 {

    @RequestMapping
    public String getLoginPage(){
        return "login.html";
    }
}
