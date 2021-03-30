package com.bjpowernode.springboot.service;

/**
 * @ProjectName: IDEA-springboot-projects
 * @Package: com.bjpowernode.springboot.service
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/2/22 10:57
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
public interface StudentService {
    void put(String key, String value);

    String get(String key);
}
