package com.actuatorinsights.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.actuatorinsights.helper.Student;

@RestController
public class HomeController {

    @Autowired
    private Student student;

    @GetMapping("/get-data")
    public Map<String,String> getData(){
        System.out.println(student);
        return Map.of("Name","Viresh");
    }
}
