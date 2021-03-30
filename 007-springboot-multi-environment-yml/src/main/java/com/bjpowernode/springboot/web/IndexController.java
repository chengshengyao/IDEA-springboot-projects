package com.bjpowernode.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ProjectName: IDEA-springboot-projects
 * @Package: com.bjpowernode.springboot.web
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/2/18 9:20
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
@Controller
public class IndexController {
    @RequestMapping("/say")
    @ResponseBody
    public String say(){
        return "helloSpringBoot";
    }
}
