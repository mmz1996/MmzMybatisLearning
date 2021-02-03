package com.mmz.dao;

import com.mmz.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @Classname UserDao
 * @Description TODO
 * @Date 2020/12/24 22:01
 * @Created by mmz
 */
public interface UserDao {

    // 根据id查询用户
    User getUserById(int id);

    // 分页
    List<User> getUserByLimit(Map<String,Integer> map);

}
