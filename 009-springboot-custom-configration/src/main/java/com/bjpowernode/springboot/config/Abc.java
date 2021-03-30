package com.bjpowernode.springboot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: IDEA-springboot-projects
 * @Package: com.bjpowernode.springboot.config
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/2/18 10:07
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
@Component
@ConfigurationProperties(prefix = "abc")
public class Abc {
    private String name;
    private String websit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsit() {
        return websit;
    }

    public void setWebsit(String websit) {
        this.websit = websit;
    }
}
