package com.mmz.pojo;

import lombok.Data;

import java.util.List;

/**
 * @Classname Teacher
 * @Description TODO
 * @Date 2021/1/11 13:27
 * @Created by mmz
 */
@Data
public class Teacher {
    private int id;
    private String name;

    private List<Student> students;
}
