package com.bjpwoernode.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ProjectName: IDEA-springboot-projects
 * @Package: com.bjpwoernode.springboot.web
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/2/27 12:00
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
@Controller
public class UserController {
    @RequestMapping("/operation")
    public String operation(Model model) {
        model.addAttribute("sex",1);
        model.addAttribute("flag",true);
        return "operation";
    }
}
