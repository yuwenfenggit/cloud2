package com.example.eurekaweb.controller;


import com.example.eurekaweb.entity.Student;
import com.example.eurekaweb.service.FeignService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class IndexController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private FeignService feignService;



    @HystrixCommand(fallbackMethod = "error")
    @RequestMapping("/showStudent")
    @ResponseBody
    public Student showStudent(){
        Student student = restTemplate.getForObject("http://EUREKA-PROVIDER/getStudent", Student.class);
        return student;
    }

    public Student error(){
        System.out.println("ribbon实现断路器");
        return new Student(100, "王", "男", 38);
    }



    @RequestMapping("/showStudentFeign")
    @ResponseBody
    public Student showStudentFeign(){
        return feignService.getStudent();
    }
}
