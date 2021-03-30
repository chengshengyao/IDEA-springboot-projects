package com.bjpowernode.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ProjectName: IDEA-springboot-projects
 * @Package: com.bjpowernode.springboot.web
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/2/25 9:03
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
@Controller
public class UserController {
    @RequestMapping("/user/filter")
    @ResponseBody
    public Object thisFilter(){
        return "你看不到";
    }
    @RequestMapping("/center")
    @ResponseBody
    public Object thisCenter(){
        return "你看到";
    }
}
