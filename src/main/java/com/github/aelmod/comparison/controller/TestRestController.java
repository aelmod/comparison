package com.github.aelmod.comparison.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("api")
@RestController
public class TestRestController {
    @RequestMapping("test")
    public List test(){
        List<String> stringArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            stringArrayList.add(i+"");
        }
        return stringArrayList;
    }
}
