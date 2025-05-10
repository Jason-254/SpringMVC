package com.atituigu.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Controller
public class ParamController {
    @RequestMapping("/test_param")
    //形参位置表示当前返回
    public String test() {
        return "test_param";
    }

    @RequestMapping("/testServletAPI")
    //形参位置表示当前返回
    public String testServletAPI(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username:" + username + ",password:" + password);
        return "success";
    }

    //    @RequestMapping("/testParam")
//    public String testParam(String username, String password) {
//        System.out.println("username:" + username + ",password:" + password);
//        return "success";
//    }
    @RequestMapping("/testParam")
    public String testParam1(@RequestParam(value = "user_name", required = false, defaultValue = "hehe") String user_name, String password, String[] hobby
            , @RequestHeader(value = "Host") String host,@CookieValue("JSESSIONID") String JSESSIONID
    ) {
        System.out.println("username:" + user_name + ",password:" + password + ",habby:" + Arrays.toString(hobby));

        System.out.println("host:" + host);
        System.out.println("JSESSIONID:" + JSESSIONID);
        return "success";
    }
    @RequestMapping("/testBean")
    public String testBean(User user) {
        System.out.println(user);
        return "success";
    }

}
