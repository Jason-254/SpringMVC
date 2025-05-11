package com.atituigu.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
    @RequestMapping("/testThymeleafview")
    public String testThymeleafview() {
        return "success";
    }

    @RequestMapping("/testForward")
    public String testForward() {
        return "forward:/testThymeleafview";
    }

    @RequestMapping("/testRedirect")

    public String testRedirect() {
        return "redirect:/testHello";
    }

}
