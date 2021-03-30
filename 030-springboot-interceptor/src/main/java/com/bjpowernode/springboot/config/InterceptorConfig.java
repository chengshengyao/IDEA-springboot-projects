package com.bjpowernode.springboot.config;

import com.bjpowernode.springboot.interceptor.UserInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ProjectName: IDEA-springboot-projects
 * @Package: com.bjpowernode.springboot.config
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/2/24 17:57
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */

// 拦截器 配置类
@Configuration  //定义此类为配置类  = 之前的xml配置文件
public class InterceptorConfig implements WebMvcConfigurer {
//重写AddInterceptor() 添加拦截器


    @Override
    //重写添加拦截器注册类方法
    public void addInterceptors(InterceptorRegistry registry) {
        UserInterceptor userInterceptor = new UserInterceptor();
        InterceptorRegistration interceptor = registry.addInterceptor(userInterceptor);
        //拦截user路径下的所有请求,应放行以登录的请求路径！
        InterceptorRegistration pathPatterns = interceptor.addPathPatterns("/user/error");
        //所放行请求, 相当于首页门面，无需登录也可访问的页面
        InterceptorRegistration excludePathPatterns = interceptor.excludePathPatterns("/user/out", "/user/center", "/user/login ");
    }
}
