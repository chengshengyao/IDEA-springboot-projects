package com.bjpowernode.springboot.entity;

import java.io.Serializable;

/**
 * (TStudent)实体类
 *
 * @author makejava
 * @since 2021-02-18 20:40:21
 */
public class TStudent implements Serializable {
    private static final long serialVersionUID = 675529295173136165L;

    private Integer id;

    private String name;

    private Integer age;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
