package com.bjpowernode.springboot.model;

/**
 * @ProjectName: IDEA-springboot-projects
 * @Package: com.bjpowernode.springboot.model
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/2/24 17:51
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
public class User {

    private Integer id;
    private String username;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
