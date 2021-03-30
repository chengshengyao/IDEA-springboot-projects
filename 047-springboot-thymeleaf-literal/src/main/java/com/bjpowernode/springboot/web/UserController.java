package com.bjpowernode.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ProjectName: IDEA-springboot-projects
 * @Package: com.bjpowernode.springboot.web
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/2/27 10:59
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
@Controller
public class UserController {
    @RequestMapping("/literal")
    public String literal(Model model) {
        model.addAttribute("sex", 1);
        model.addAttribute("flag", true);
        model.addAttribute("data", "springboot");
        return "literal";
    }

    @RequestMapping("/splice")
    public String splice(Model model) {
        model.addAttribute("totalRows", 123);
        model.addAttribute("totalPage", 13);
        model.addAttribute("currentPage", 2);
        return "splice";
    }
}
