package com.example.demo.swagger;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/swagger")
public class TestController {

    @ApiOperation(value = "this is test api", tags = "test swagger api")
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "this is swagger test";
    }

}
