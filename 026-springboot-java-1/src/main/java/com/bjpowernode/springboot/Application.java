package com.bjpowernode.springboot;

import com.bjpowernode.springboot.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
    //    springboot程序启动后，返回configurableApplicationContext
    //     此返回值对象也是一个spring容器
    //      相当于spring容器中的启动容器ClassPathXmlApplicationContext
    public static void main(String[] args) {
        //springboot框架启动容器
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(Application.class, args);
        //获取容器中的对象
        StudentService studentService = (StudentService) configurableApplicationContext.getBean("studentServiceImpl");
        //调用接口中方法并输出
        System.out.println(studentService.sayHello());

    }

}
