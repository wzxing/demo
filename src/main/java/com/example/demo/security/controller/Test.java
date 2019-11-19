package com.example.demo.security.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Test {

    @RequestMapping(value = "h1", method = RequestMethod.GET)
    public String test1() {
        return "h1";
    }

    @RequestMapping(value = "h2", method = RequestMethod.GET)
    public String test2() {
        return "h2";
    }

}
