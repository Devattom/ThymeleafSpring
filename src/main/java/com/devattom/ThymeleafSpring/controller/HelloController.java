package com.devattom.ThymeleafSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
public class HelloController {
    @GetMapping("/showForm")
    public String showForm() {
        return "hello-form";
    }

    @RequestMapping("/processForm")
    public String processForm(Model model) {
        model.addAttribute("message", "Hello World!");
        model.addAttribute("date", LocalDateTime.now());
        return "hello";
    }
}
