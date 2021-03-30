package com.bjpowernode.springboot;

import com.bjpowernode.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//springboot框架非web项目 实现 命令行运行器接口
public class Application implements CommandLineRunner {
     @Autowired
    private StudentService studentService;
    //springboot启动程序，初始化spring容器
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    //重写CommandLineRunner接口中的run方法
    @Override
    public void run(String... args) throws Exception {
        System.out.println(    studentService.sayHello("hahaha"));
    }
}
