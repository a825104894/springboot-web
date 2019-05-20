package com.terry.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class FirstController {

    @RequestMapping("/hello")
    public String hello(Map<String,Object> maps){
        maps.put("hello","hello123");
        return "hello";
    }
}
