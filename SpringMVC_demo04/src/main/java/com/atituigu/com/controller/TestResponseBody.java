package com.atituigu.com.controller;

import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class TestResponseBody {
    @RequestMapping("/testRequestBody")
    public String testResponseBody(@RequestBody String requestBody) {
        System.out.println("requestBody:" + requestBody);
        return "success";
    }

    @RequestMapping("/testRequestEntity")
    public String testRequestEntity(RequestEntity<String> requestEntity) {
        System.out.println("requestHeader:" + requestEntity.getHeaders());
        System.out.println("requestBody:" + requestEntity.getBody());
        return "success";
    }

    @RequestMapping("/testResponse")
    public void testResponseBody(HttpServletResponse response) throws IOException {
        response.getWriter().println("hello");
    }

    @RequestMapping("/testResponseBody")
    @ResponseBody
    public String testResponseBody() {
        return "success";
    }

    @RequestMapping("/testResponseUser")
    @ResponseBody
    public User testResponseUser() {
        return new User(1001, "admin", "123456", 23, "男");
    }

    @RequestMapping("/testAjax")
    @ResponseBody
    public String testAjax(String username, String password) {
        System.out.println("username:" + username + ",password:" + password);
        return "hello,ajax";
    }

}
