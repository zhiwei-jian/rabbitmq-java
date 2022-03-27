package com.hide.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/api/hello")
    public String hello(@RequestParam String name) {
        return "Hello " + name + "!";
    }
}
