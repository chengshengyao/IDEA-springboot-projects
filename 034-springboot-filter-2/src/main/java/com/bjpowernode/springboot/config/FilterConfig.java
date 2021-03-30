package com.bjpowernode.springboot.config;

import com.bjpowernode.springboot.filter.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

/**
 * @ProjectName: IDEA-springboot-projects
 * @Package: com.bjpowernode.springboot.config
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/2/25 8:57
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
@Configuration //声明此类为配置类
public class FilterConfig {
    @Bean
    public FilterRegistrationBean myFilterRegistrationBean() {
        //注册过滤器
        FilterRegistrationBean<Filter> filterRegistrationBean = new FilterRegistrationBean(new MyFilter());
        //添加过滤url模式
        filterRegistrationBean.addUrlPatterns("/user/*");
        return filterRegistrationBean;
    }

}
