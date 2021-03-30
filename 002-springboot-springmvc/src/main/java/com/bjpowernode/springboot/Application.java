package com.bjpowernode.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//springboot项目启动入口类
//springboot开启配置的核心注解
@SpringBootApplication
public class Application {
    //springboot项目代码必须放在application同级目录或下级目录
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
