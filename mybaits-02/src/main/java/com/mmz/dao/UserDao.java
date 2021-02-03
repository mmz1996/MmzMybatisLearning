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
    // 获取全部用户
    List<User> getUserList();

    // 根据id查询用户
    User getUserById(int id);

    // 增加一个用户
    int addUser(User user);

    // 修改用户
    int updateUser(User user);

    // 删除一个用户
    int deleteUser(int id);

}
