package com.gc_project.Controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showUploadForm() {
        return "login";
    }
}