package com.gc_project.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @GetMapping("/Login")
    public String login() {
        return "Login";
    }

    @RequestMapping("/Home")
    public String home(Model model) {
        return "Home";
    }
}
