package com.example.StudentRestApisExample.controller;

import com.example.StudentRestApisExample.model.Student;
import com.example.StudentRestApisExample.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/Yey")
    public String hello() {
        return "Hello Jane!";

    }

    @GetMapping("/success")
    public String focus() {
        return "Congratulations!";
    }

    @GetMapping("/males")
    public List<Student> getMalesList() {
        return studentService.getMales();
    }

    @GetMapping("/Females")
    public List<Student> getFemalesList(){
        return studentService.getFemales();
    }

}

