package com.qy28.sm.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//这里使用@Controller，进行重定向，如果使用@RestController，会把返回的字符串变成json返回给前端
@Controller
public class PageJumpController {

    //使用原因：springboot在不输入请求路径，默认展示index.html（首页），所以应该让他默认展示登录页面
    //方式一：
     @GetMapping("/")
     public String index(){
          return "redirect:/login.html";
      }
}
