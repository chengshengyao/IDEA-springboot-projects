package com.bjpowernode.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//开启springboot配置
@SpringBootApplication
//映射扫描,开启扫描映射文件接口的包以及子目录
@MapperScan(basePackages = "com.bjpowernode.springboot.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
