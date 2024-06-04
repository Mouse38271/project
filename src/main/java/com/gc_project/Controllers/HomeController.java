package com.gc_project.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;


@Controller
@RequestMapping ("/Home")
public class HomeController {
    @GetMapping
    public String welcome(){
        return "index";
    }
}
