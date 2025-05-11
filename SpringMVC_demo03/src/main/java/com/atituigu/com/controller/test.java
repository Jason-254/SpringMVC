package com.atituigu.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class test {
    @RequestMapping("/")
    public String test() {

        return "index";
    }
    @RequestMapping("/test_view")
    public String test1() {
        return "test_view";
    }
}
