package com.gc_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppController {

    @Autowired
    private UserRepository repo;
    
    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; // Pastikan login.html ada di templates
    }

    @GetMapping("/home")
    public String viewHomePage() {
        return "index"; // Pastikan index.html ada di templates
    }

    @GetMapping("/register")
    public String showSignUpForm(Model model) {
        model.addAttribute("user", new User()); // Ganti 'User' dengan nama kelas objek form Anda
        return "register"; // Pastikan register.html ada di templates
    }

    @PostMapping("/process_register")
    public String processRegistration(User user) {
        repo.save(user);
        return "register_success"; // Pastikan register_success.html ada di templates
    }
    
    @GetMapping("/list_users")
    public String viewUsersList() {
        return "users"; // Pastikan users.html ada di templates
    }
    
    // Redirect ke home setelah login berhasil
    @PostMapping("/login")
    public String login() {
        return "redirect:/index";
    }
}
