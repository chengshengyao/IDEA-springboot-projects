package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.model.Student;
import org.springframework.web.bind.annotation.*;

/**
 * @ProjectName: IDEA-springboot-projects
 * @Package: com.bjpowernode.springboot.web
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/2/21 21:54
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
//@Controller
@RestController //相当于控制层类 上方加 Controller 方法上加 ResponseBody 意味着当前控制层中所有方法都返回JSON对象
public class StudentController {
    @RequestMapping("/student")
    //@ResponseBody
    public Object student() {
        Student student = new Student();
        student.setId(101671);
        student.setName("帅哥");
        return student;
    }

    @RequestMapping(value = "/studentDetail", method = {RequestMethod.GET, RequestMethod.POST})
    //@ResponseBody
    //该方法请求方式支持GET和Post
    public Object queryStudentById(Integer id) {
        Student student = new Student();
        student.setId(id);
        return student;
    }

    //@RequestMapping(value = "/studentDetail1", method = RequestMethod.GET)

    @GetMapping("/studentDetail1") //相当于   ↑   ，只接受GET请求 若请求方式不对等 报405 error
    //此注解常在查询时使用
    public Object queryStudentById1() {
        return "Only get method";
    }

    //@RequestMapping(value = "/studentDetail2", method = RequestMethod.POST)
    @PostMapping("/studentDetail2") //相当于   ↑   ，只接受POST请求 若请求方式不对等 报405 error
    //此注解常在新增时使用
    public Object insertStudent() {
        return "Only post method";
    }

    @DeleteMapping("/studentDetail3") //相当于   ↑   ，只接受DELETE请求 若请求方式不对等 报405 error
    //此注解常在删除时使用
    public Object DeleteStudent() {
        return "Only delete method";
    }

    //@RequestMapping(value = "/studentDetail4",method = RequestMethod.PUT)
    @PutMapping("/studentDetail4")//相当于   ↑   ，只接受PUT请求 若请求方式不对等 报405 error
    //次注解常在更新时使用
    public Object updateStudent() {
        return "Only update method";
    }
}