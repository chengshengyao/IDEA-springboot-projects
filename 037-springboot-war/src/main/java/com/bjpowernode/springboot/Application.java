package com.bjpowernode.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
//继承springbootServlet初始化 类
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override //重写 springbootServlet初始化 类 的 配置方法
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        //参数为当前springb启动类
        //构造新资源
        return builder.sources(Application.class);
    }
}
