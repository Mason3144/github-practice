package com.git.branch.stratage.assignment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainPageController {
    @GetMapping("/")
    public String mainPage(){
        return "To-do Application !";
    }
}
