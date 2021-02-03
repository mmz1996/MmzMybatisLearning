package com.mmz.dao;

import com.mmz.pojo.Student;

import java.util.List;

/**
 * @Classname StudentMapper
 * @Description TODO
 * @Date 2021/1/11 14:57
 * @Created by mmz
 */
public interface StudentMapper {
    // 查询所有的学生的信息，以及对应的老师的信息

    public List<Student> getStudent();

}
