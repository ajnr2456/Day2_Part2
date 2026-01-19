package com.example.day2_part2.controller;

import com.example.day2_part2.model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Home {
    @GetMapping("/")
    public List<StudentModel> getStudent1(){
        List<StudentModel> l=new ArrayList<>();
        l.add(new StudentModel(1,"AJ","ajnr@gmail.com"));
        l.add(new StudentModel(2,"ARJUN","arjun@gmail.com"));
        l.add(new StudentModel(3,"AARAV","aarav@gmail.com"));
        l.add(new StudentModel(4,"ABHI","abhi@gmail.com"));
        l.add(new StudentModel(5,"AJAY","ajay@gmail.com"));
        return l;

    }
}

