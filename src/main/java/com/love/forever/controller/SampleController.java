package com.love.forever.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("a")
public class SampleController {
    @RequestMapping("index")
    String index() {
        System.out.println(111);
        return "<font color='red'>Hello World!你好</font>";
    }
}