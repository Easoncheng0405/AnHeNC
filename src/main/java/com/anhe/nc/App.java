package com.anhe.nc;

/*
 * 作者：程杰
 * 创建时间：2018/7/15
 * 博客地址：www.chengjie-jlu.com
 */


import com.anhe.nc.codeGenerator.base.Access;
import com.anhe.nc.codeGenerator.base.Constant;
import com.anhe.nc.codeGenerator.base.Method;
import com.anhe.nc.codeGenerator.base.Properties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;


@SpringBootApplication
@Controller
public class App {

    public static void main(String[] args) {


        HashMap<String, String> arg = new HashMap<>();
        arg.put("a", Constant.INT);
        arg.put("b", Constant.INT);
        Method method = new Method("add", Access.PUBLIC, "int", arg);
        method.setContent("return a + b;");

        Properties a=new Properties("a",Access.PRIVATE,Constant.INT);

        Properties b=new Properties("b",Access.PRIVATE,Constant.INT);
        System.out.println(a);
        System.out.println(b);
        System.out.println(method);

        //SpringApplication.run(App.class,args);
    }


    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "hello world!";
    }

}
