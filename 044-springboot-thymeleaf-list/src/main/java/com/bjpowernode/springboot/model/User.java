package com.bjpowernode.springboot.model;

import lombok.Data;

/**
 * @ProjectName: IDEA-springboot-projects
 * @Package: com.bjpowernode.springboot.model
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/2/26 21:06
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
@Data
public class User {
    private Integer id;
    private String nick;//昵称 【nickName】
    private String phone;
    private String address;
}
