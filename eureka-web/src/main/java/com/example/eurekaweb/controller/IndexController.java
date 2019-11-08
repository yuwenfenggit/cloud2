package com.example.eurekaweb.controller;


import com.example.eurekaweb.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class IndexController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/showStudent")
    @ResponseBody
    public Student showStudent(){
        Student student = restTemplate.getForObject("http://EUREKA-PROVIDER/getStudent", Student.class);
        return student;
    }
}
