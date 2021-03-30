package com.bjpowernode.springboot.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

/**
 * @ProjectName: IDEA-springboot-projects
 * @Package: com.bjpowernode.springboot.config
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/2/25 9:30
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
@Configuration //声明配置类
public class SystemConfig {
    @Bean
    public FilterRegistrationBean characterFilterRegistrationBean(){
        //创建字符编码过滤器
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        //设置目标编码为真 强制使用指定的字符编码
        characterEncodingFilter.setForceEncoding(true);
        //设置字符编码过滤器
        characterEncodingFilter.setEncoding("UTF-8");
        //注册过滤器
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        //设置字符编码过滤器
        filterRegistrationBean.setFilter(characterEncodingFilter);
        //设置字符编码过滤器 过滤路径
        filterRegistrationBean.addUrlPatterns("/*");

        return filterRegistrationBean;
    }
}
