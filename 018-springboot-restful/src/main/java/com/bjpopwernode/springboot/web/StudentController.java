package com.bjpopwernode.springboot.web;

import com.bjpopwernode.springboot.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * @ProjectName: IDEA-springboot-projects
 * @Package: com.bjpopwernode.springboot.web
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/2/22 8:52
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
@RestController
public class StudentController {
    @RequestMapping("/student")
    public Object student(Integer id, Integer age) {
        Student student = new Student();
        student.setId(id);
        student.setAge(age);
        return student;
    }

    //@RequestMapping("/student/detail/{id}/{age}") //【具有代表性的传递情况  】
    @DeleteMapping("/student/detail/{id}/{age}")
    public Object student1(@PathVariable("id") Integer id,
                           @PathVariable("age") Integer age) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("id", id);
        hashMap.put("age", age);
        return hashMap;
    }
//    方法一和方法二 请求路径风格暧昧 出现非法请求异常  区分方式以方法具体功能 根据请求方式进行区分
//    @RequestMapping("/student/detail/{id}/{status}") //【具有代表性的传递情况  】
    @GetMapping("/student/detail/{id}/{status}")
    public Object student2(@PathVariable("id") Integer id,
                           @PathVariable("status") Integer status) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("id", id);
        hashMap.put("status", status);
        return hashMap;
    }

//    暧昧的请求方式以路径进行区分
    @DeleteMapping("/student/{id}/detail/{city}")
    public Object student3(@PathVariable("id") Integer id,
                           @PathVariable("city") Integer city) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("id", id);
        hashMap.put("city",city);
        return hashMap;
    }
    @PostMapping("/student/{id}")
    public Object student4(@PathVariable("id") Integer id ){


        return "add student id :"+id;
    }
    @PutMapping("/student/{id}")
    public Object student5(@PathVariable("id") Integer id ){


        return "update  student id :"+id;
    }

}
