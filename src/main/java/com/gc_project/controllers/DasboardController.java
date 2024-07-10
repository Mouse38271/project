package com.gc_project.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping ("/Home")
public class DasboardController {
    @GetMapping
    public String viewHomePage(){
        return "home";
    }
}
