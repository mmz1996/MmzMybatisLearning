package com.mmz.dao;

import com.mmz.pojo.User;
import com.mmz.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Classname UserDaoTest
 * @Description TODO
 * @Date 2020/12/26 16:47
 * @Created by mmz
 */
public class UserDaoTest {
    @Test
    public void getUserList(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();

        UserDao mapper = sqlsession.getMapper(UserDao.class);

        List<User> userList = mapper.getUserList();

        for (User user : userList) {
            System.out.println(user);
        }

        sqlsession.close();
    }
}
