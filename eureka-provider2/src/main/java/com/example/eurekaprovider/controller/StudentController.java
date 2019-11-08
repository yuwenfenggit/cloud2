package com.example.eurekaprovider.controller;


import com.example.eurekaprovider.entity.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @RequestMapping("/getStudent")
    public Student getStudent(){
        Student student = new Student(101, "小王", "女", 18);
        return student;
    }
}
