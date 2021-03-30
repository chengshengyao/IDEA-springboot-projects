package com.bjpowernode.springboot.interceptor;

import com.bjpowernode.springboot.model.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ProjectName: IDEA-springboot-projects
 * @Package: com.bjpowernode.springboot.interceptor
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/2/24 17:49
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */

public class UserInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //预处理
        //从session中获取用户的信息
        System.out.println("---------------------进入拦截器--------------------------------------");
        User user = (User) request.getSession().getAttribute("user");
        //判断用户是否登录
        if (null == user) {
            //未登录，返回登录/注册页面
            response.sendRedirect(request.getContextPath()+"/user/error");
            return false;
        }
        //已登录 or 已注册
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
