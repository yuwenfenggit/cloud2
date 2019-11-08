package com.example.eurekaweb.service;


import com.example.eurekaweb.entity.Student;
import com.example.eurekaweb.error.error;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "EUREKA-PROVIDER",fallbackFactory = error.class)
public interface FeignService {

    @RequestMapping(value="/getStudent",produces = "application/json;charset=UTF-8")
    public Student getStudent();

}
