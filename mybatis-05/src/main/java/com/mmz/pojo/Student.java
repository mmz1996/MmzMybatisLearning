package com.mmz.pojo;

import lombok.Data;

/**
 * @Classname Student
 * @Description TODO
 * @Date 2021/1/11 13:26
 * @Created by mmz
 */
@Data
public class Student {
    private int id;
    private String name;

    // 学生需要关联一个老师
    private Teacher teacher;


}
