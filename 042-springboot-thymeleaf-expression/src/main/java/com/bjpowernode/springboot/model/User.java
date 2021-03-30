package com.bjpowernode.springboot.model;

import lombok.Data;

/**
 * @ProjectName: IDEA-springboot-projects
 * @Package: com.bjpowernode.springboot.model
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/2/26 9:16
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
@Data
public class User {
    private Integer id;
    private String username;
    private  Integer age;
}
