package com.mmz.usermapper;

import com.mmz.dao.UserMapper;
import com.mmz.pojo.User;
import com.mmz.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Classname testUserMapper
 * @Description TODO
 * @Date 2021/1/2 7:13
 * @Created by mmz
 */
public class testUserMapper {
    @Test
    public void test(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);

        List<User> users = mapper.getUsers();
        for (User user : users) {
            System.out.println(user);
        }
        sqlsession.close();
    }

    @Test
    public void testById(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);

        User user = mapper.getUserById(1);
        System.out.println(user);
        sqlsession.close();
    }

    @Test
    public void testAddUser(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);

        User user = new User(6,"hello","231231");
        int i = mapper.addUser(user);
        System.out.println(i);
        sqlsession.close();
    }

    @Test
    public void testUpdateUser(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);

        User user = new User(6,"xixi","231231");
        mapper.updateUser(user);
        sqlsession.close();
    }

    @Test
    public void testDeleteUser(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);

        int i = mapper.deleteUser(5);
        sqlsession.close();
    }
}
