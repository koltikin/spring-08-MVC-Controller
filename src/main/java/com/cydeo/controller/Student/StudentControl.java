package com.cydeo.controller.Student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentControl {

    @RequestMapping("student")
    public String getStudentPage(){
        return "StudenT/welcome.html"; // file directory and file name not case-sensitive
    }
}
