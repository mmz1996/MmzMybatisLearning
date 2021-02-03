package com.mmz.dao;

import com.mmz.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Classname TeacherMapper
 * @Description TODO
 * @Date 2021/1/11 14:58
 * @Created by mmz
 */
public interface TeacherMapper {

    List<Teacher> getTeachers();

    Teacher getTeacher(@Param("tid") int id);
}
