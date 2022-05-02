package com.example.forfrontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {

    @GetMapping("/main")
    public String root(){
        return "/apps/main";
    }

    @GetMapping("/search")
    public String search(){
        return "/apps/search";
    }

    @GetMapping("/button")
    public String button() { return "/apps/button"; }

    @GetMapping("/popup")
    public String popup() { return "/apps/popup"; }
}
