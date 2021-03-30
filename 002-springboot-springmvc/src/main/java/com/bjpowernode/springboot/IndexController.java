package com.bjpowernode.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ProjectName: IDEA-springboot-projects
 * @Package: com.bjpowernode.springboot
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/2/16 23:51
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
//控制器类
@Controller
public class IndexController {
    @RequestMapping("/springboot/say")
    @ResponseBody//说明返回的是一个String 而不是 view
    public String say(){
        return "Hello,springboot!";
    }
}
