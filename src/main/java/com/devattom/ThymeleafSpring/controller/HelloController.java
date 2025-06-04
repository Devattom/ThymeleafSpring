package com.devattom.ThymeleafSpring.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping("processFormModel")
    public String processFormModel(@RequestParam("name") String name, Model model) {
        name = name.toUpperCase();

        String hello = "Hello " + name + "!!!!!!";

        model.addAttribute("hello", hello);
        model.addAttribute("message", "Hello World!");
        model.addAttribute("date", LocalDateTime.now());

        return "hello";
    }
}
