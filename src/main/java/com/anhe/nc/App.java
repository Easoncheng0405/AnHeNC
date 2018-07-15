package com.anhe.nc;

/*
 * 作者：程杰
 * 创建时间：2018/7/15
 * 博客地址：www.chengjie-jlu.com
 */


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }


    @GetMapping("/")
    @ResponseBody
    public String index(){
        return "hello world!";
    }

}
