package com.mmz.dao;

import com.mmz.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Classname UserMapper
 * @Description TODO
 * @Date 2021/2/2 18:28
 * @Created by mmz
 */
public interface UserMapper {
    List<User> queryUsers();

    User queryUserById(@Param("id") int id);

    int updateUser(User user);
}
