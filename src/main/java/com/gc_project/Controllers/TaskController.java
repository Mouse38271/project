package com.gc_project.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping ("/TaskPage")
public class TaskController {
    @GetMapping
    public String viewTaskPage(){
        return "TaskPage";
    }
}
