package com.mmz.dao;

import com.mmz.pojo.User;
import com.mmz.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Classname UserDaoTest
 * @Description TODO
 * @Date 2020/12/24 22:18
 * @Created by mmz
 */
public class UserDaoTest {
    @Test
    public void test(){
        // 创建sqlsession对象
        SqlSession sqlsession = MybatisUtils.getSqlsession();

        // 得到mapper 方式一
        UserDao mapper = sqlsession.getMapper(UserDao.class);

        // 方式二

        List<User> userList = mapper.getUserList();
        for (User user : userList){
            System.out.println(user);
        }

        // 关闭sqlsession
        sqlsession.close();
    }

    @Test
    public void testFindUserById(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();

        // 得到mapper 方式一
        UserDao mapper = sqlsession.getMapper(UserDao.class);

        User userById = mapper.getUserById(1);

        System.out.println(userById);

        // 关闭sqlsession
        sqlsession.close();
    }

    // 增删改需要提交事务
    @Test
    public void testAddUser(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();

        UserDao mapper = sqlsession.getMapper(UserDao.class);

        User user = new User(4,"duoduo","123");
        int i = mapper.addUser(user);

        System.out.println(i);

        sqlsession.commit();
        sqlsession.close();
    }
    // 增删改需要提交事务
    @Test
    public void testAddUser2(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();

        UserDao mapper = sqlsession.getMapper(UserDao.class);

        Map<String,Object> map = new HashMap<String, Object>();

        map.put("userid",5);
        map.put("username","xiaoqi");
        map.put("userpwd","jinmao");
        int i = mapper.addUser2(map);

        System.out.println(i);

        sqlsession.commit();
        sqlsession.close();
    }


    // 修改更新User
    @Test
    public void testUpdateUser(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();

        UserDao mapper = sqlsession.getMapper(UserDao.class);

        User user = new User(4,"duoduo123","123");
        int i = mapper.updateUser(user);

        System.out.println(i);

        sqlsession.commit();
        sqlsession.close();
    }

    // 删除修改User
    @Test
    public void testDeleteUser(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();

        UserDao mapper = sqlsession.getMapper(UserDao.class);

        int i = mapper.deleteUser(4);

        System.out.println(i);

        sqlsession.commit();
        sqlsession.close();
    }

    @Test
    public void testFindUserLike(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        UserDao mapper = sqlsession.getMapper(UserDao.class);

        List<User> m = mapper.getUserLike("%m%");

        for (User user : m) {
            System.out.println(user);
        }

        sqlsession.close();
    }
}
