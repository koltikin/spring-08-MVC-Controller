package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String getHomePage(){
        return "HomE.HtMl";        // file name of the 'Html' doesn't case-sensitive
    }

    @RequestMapping("/ziya")
    public String getHomePage2(){
        return "Home.Html";
    }

    @RequestMapping({"/Ziya","/Apple","orange"}) // if there is two end points or more it takes the first one.
                                                        // end points lowercase uppercase doesn't make sense.
    public String getHomePage3(){
        return "Home2.Html";
    }




}
