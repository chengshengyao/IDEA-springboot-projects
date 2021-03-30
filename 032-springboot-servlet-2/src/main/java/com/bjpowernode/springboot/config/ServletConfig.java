package com.bjpowernode.springboot.config;

import com.bjpowernode.springboot.servlet.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ProjectName: IDEA-springboot-projects
 * @Package: com.bjpowernode.springboot.config
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/2/24 23:05
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
@Configuration//此注解将此类声明为配置类等同于一个xml配置文件
public class ServletConfig {
    //此处bean标签用于声明配置类对象  相当于 bean标签的作用
    @Bean
    public ServletRegistrationBean myServletRegistration(){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new MyServlet(),"/myservlet");
        return servletRegistrationBean;
    }

}
