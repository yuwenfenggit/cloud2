package com.example.eurekaweb.error;

import com.example.eurekaweb.entity.Student;
import com.example.eurekaweb.service.FeignService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;


@Component
public class error implements FallbackFactory<FeignService> {
    @Override
    public FeignService create(Throwable throwable) {
        return ()->new Student(100, "王2", "男", 38);
    }
}
