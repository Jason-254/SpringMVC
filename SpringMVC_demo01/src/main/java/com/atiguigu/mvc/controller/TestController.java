package com.atiguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/")
    public String index() {
        return "test";
    }

    @RequestMapping("/target")
    public String toString() {
        return "target";
    }

//    @RequestMapping("/param")
//    public String param(){
//        return "test_param";
//    }

}
