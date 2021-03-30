package com.bjpowernode.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.bjpowernode.springboot.mapper")
@EnableTransactionManagement //开启事务管理 可选项
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
