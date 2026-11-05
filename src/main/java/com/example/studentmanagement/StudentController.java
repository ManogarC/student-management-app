package com.example.studentmanagement;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "index";
    }

    @PostMapping("/students/add")
    public String addStudent(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String course) {

        studentService.addStudent(name, email, course);

        return "redirect:/";
    }
}