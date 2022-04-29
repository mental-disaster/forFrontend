package com.example.forfrontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {

    @GetMapping("/main")
    public String root(){
        return "/apps/main";
    }
}
