package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.config.Abc;
import com.bjpowernode.springboot.config.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ProjectName: IDEA-springboot-projects
 * @Package: com.bjpowernode.springboot.web
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/2/18 10:02
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
@Controller
public class IndexController {

    @Value("${city}")
    private String city;
    @Value("${country}")
    private String country;
    @Value("${province}")
    private String province;
    @Autowired
    private School school;
    @Autowired
    private Abc abc;

    @RequestMapping("/say")
    @ResponseBody
    public String say() {
        return "helloSpringBoot" + "---" + school.getName() + "---" + school.getWebsit()
                + "///" + abc.getName() + "///" + abc.getWebsit() + "***" + city + "***" + country
                +"***"+province;
    }
}

