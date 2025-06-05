package com.devattom.ThymeleafSpring.controller;

import com.devattom.ThymeleafSpring.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    @GetMapping("/showStudentForm")
    public String showStudentForm(Model model) {
        model.addAttribute("student", new Student());

        return "student-form";
    }

    @PostMapping("/processStudentForm")
    public String processStudentForm(@ModelAttribute("student") Student student) {

        System.out.println("student: " + student.getFirstName() + " " + student.getLastName());
        return "student-confirmation";
    }
}
