package com.example.demo.security.controller;

import com.example.demo.security.enums.WeekEnum;
import com.example.demo.security.req.TestReq;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class Hello {

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String test(@RequestBody TestReq testReq) {
        WeekEnum weekEnum = testReq.getWeek();
        return "hello test";
    }

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    public String test1() {
        System.out.println("123423");
        return "hello test";
    }


}
