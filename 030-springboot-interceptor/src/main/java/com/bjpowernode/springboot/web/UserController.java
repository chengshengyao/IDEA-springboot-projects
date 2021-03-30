package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @ProjectName: IDEA-springboot-projects
 * @Package: com.bjpowernode.springboot.web
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/2/24 18:13
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/login")
    @ResponseBody
    public Object login(HttpServletRequest request) {
        //将用户信息存放于 session中
        User user = new User();
        user.setId(1001);
        user.setUsername("zhangsan");
        request.getSession().setAttribute("user", user);
        return "Login Success!";
    }

    //该方法书写用户登陆后所能看到的信息
    @RequestMapping("/center")
    @ResponseBody
    public Object center() {
        return "This's User was login latter ,Can see  message";
    }

    //该方法书写用户不登录也能看到的信息
    @RequestMapping("/out")
    @ResponseBody
    public Object noLogin() {
        return "This's User no longin so can see";
    }

    //    该方法书写用户登录失败所跳转的界面,之后会跳转至登录页面
    @RequestMapping("/error")
    @ResponseBody
    public Object error() {
        return "error";
    }
}
