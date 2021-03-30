package com.bjpowernode.springboot.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: IDEA-springboot-projects
 * @Package: com.bjpowernode.springboot.contoller
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/2/17 19:25
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
@Controller
public class IndexController {
    @RequestMapping("/say")
    @ResponseBody
    public String say() {
        return "hello,springboot!";
    }

    @RequestMapping("/mapValue")
    @ResponseBody
    public Map<String, Object> mapValue() {
        Map<String, Object> map = new HashMap<>();
        map.put("message", "springboot project");
        return map;
    }
}
