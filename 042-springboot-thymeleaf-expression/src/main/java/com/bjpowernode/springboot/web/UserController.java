package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ProjectName: IDEA-springboot-projects
 * @Package: com.bjpowernode.springboot.web
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/2/26 9:12
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
@Controller
public class UserController {
    @RequestMapping("/user/detail")
    public ModelAndView userDetail() {
        User user = new User();
        user.setId(1001);
        user.setUsername("zhangsan");
        user.setAge(20);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user", user);
        modelAndView.setViewName("userDetail");
        return modelAndView;
    }

    @RequestMapping("/user/detail1")
    public String userDetail1(Model model) {
        User user = new User();
        user.setId(1002);
        user.setUsername("lisi");
        user.setAge(23);
        model.addAttribute("user", user);
        return "userDetail";
    }

    @RequestMapping("/url")
    public String urlExpression(Model model) {
        model.addAttribute("id", 1001);
        model.addAttribute("username", "csy");
        model.addAttribute("age", 23);
        return "url";
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test(String username) {
        return "请求路径test，参数是" + username;
    }

    @RequestMapping("/test1")
    @ResponseBody
    public String test1(String username, String id, String age) {
        return "请求路径test1，参数是,用户姓名" + username + "\t 用户id" + id + "\t 用户年龄" + age;
    }

    @RequestMapping("/test2/{id}")
    @ResponseBody
    public String test2(@PathVariable("id") Integer id) {
        return "id=" + id;
    }

    @RequestMapping("/test3/{id}/{username}/{age}")
    @ResponseBody
    public String test3(@PathVariable("id") Integer id
            , @PathVariable("username") String username
            , @PathVariable("age") Integer age) {

        return "id=" + id + "\t username=" + username + "\t age=" + age;
    }

    @RequestMapping("/url2")
    public String url2() {
        return "url2";
    }

    @RequestMapping("/property")
    public String property() {
        return "property";
    }
}
