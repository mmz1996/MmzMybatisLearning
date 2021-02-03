package com.mmz.dao;

import com.mmz.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @Classname TeacherMapper
 * @Description TODO
 * @Date 2021/1/11 14:58
 * @Created by mmz
 */
public interface TeacherMapper {

    @Select("select * from teacher where id = #{tid}")
    Teacher getTeacher(@Param("tid")int id);
}
