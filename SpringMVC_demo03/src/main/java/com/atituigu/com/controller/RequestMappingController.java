package com.atituigu.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping("/hello")
public class RequestMappingController {

    //此时请求映射所映射的请求的请求路径为：/test/testRequestMapping
//    @RequestMapping("/testRequestMapping")
    @RequestMapping(value = {"/testRequestMapping", "/test"},
            method = {RequestMethod.GET, RequestMethod.POST})//
    public String testRequestMapping() {

        return "success";
    }

    @GetMapping("/testGetMapping")
    public String testGetMapping() {

        return "success";
    }

    @RequestMapping("/a?a/testAnt")
    public String testAnt() {
        return "success";
    }

    @RequestMapping("/a*a/testAnt")
    public String testAnt1() {
        return "success";
    }

    @RequestMapping("/**/testAnt")
    public String testAnt2() {
        return "success";
    }

    @RequestMapping("/testRest/{id}/{username}")
    public String testRest(@PathVariable("id") String id, @PathVariable("username") String username) {
        System.out.println("id:" + id + ",username:" + username);
        return "success";
    }
//最终输出的内容为-->id:1,username:admin


}