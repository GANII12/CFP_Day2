package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWebController {
    @GetMapping("/web")
    public String hello(){
        return "hello Ganesh";
    }

    @GetMapping("/web/message")
    public String message(Model model){
        model.addAttribute("message","this is custom message, hello from bridgelabz");
        return "message";
    }

}
