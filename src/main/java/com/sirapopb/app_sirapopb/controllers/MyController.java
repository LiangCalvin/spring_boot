package com.sirapopb.app_sirapopb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/greet")
    public String display(){
        return  "Hi Kim";
    }

    @GetMapping("/about")
    public String dis_about(){
        return "About";
    }

    @GetMapping("/greet2")
    public String display2(){
        return  "Hi Kim2";
    }
}
