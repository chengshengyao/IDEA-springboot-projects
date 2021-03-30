package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName: IDEA-springboot-projects
 * @Package: com.bjpowernode.springboot.web
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/2/26 21:03
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
@Controller
public class UserController {

    @RequestMapping("/each/list")
    public String eachlist(Model model) {
        List<User> list = new ArrayList<User>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(1001);
            user.setNick("pig");
            user.setPhone("19512472707");
            user.setAddress("松江大嘴唇");
            list.add(user);
        }
        model.addAttribute("list", list);
        return "eachList";
    }

    @RequestMapping("/each/map")
    public String eachMap(Model model) {
        Map userMap = new HashMap<Integer, Object>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(i);
            user.setNick("panda" + i);
            user.setPhone("15293759510" + i);
            user.setAddress("大唐宫" + i);
            userMap.put(i, user);
        }
        model.addAttribute("userMaps", userMap);
        return "eachMap";
    }

    @RequestMapping("/each/array")
    public String eachArray(Model model) {
        User[] users = new User[10];
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(i);
            user.setNick("xixi" + i);
            user.setPhone("15293759500" + i);
            user.setAddress("老唐宫" + i);
            users[i] = user;
        }
        model.addAttribute("userArray", users);
        return "eachArray";
    }

    @RequestMapping(value = "/each/all")
    public String eachAll(Model model) {
        //list -> Map -> List -> User
        List<Map<Integer, List<User>>> myList = new ArrayList<Map<Integer, List<User>>>();

        for (int i = 0; i < 2; i++) {

            Map<Integer, List<User>> myMap = new HashMap<Integer, List<User>>();
            for (int j = 0; j < 2; j++) {
                List<User> myUserList = new ArrayList<User>();
                for (int k = 0; k < 3; k++) {
                    User user = new User();
                    user.setId(k);
                    user.setNick("张三" + k);
                    user.setPhone("1350000000" + k);
                    user.setAddress("广州市" + i);
                    myUserList.add(user);
                }
                myMap.put(j, myUserList);
            }
            myList.add(myMap);

        }
        model.addAttribute("myList", myList);
        return "eachAll";
    }
}
