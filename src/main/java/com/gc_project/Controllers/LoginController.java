package com.gc_project.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping ("/Login")
public class LoginController {
    @GetMapping
    public String login(){
        return "Login";
    }
}
