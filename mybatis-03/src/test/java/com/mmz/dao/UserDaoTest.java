package com.mmz.dao;

import com.mmz.pojo.User;
import com.mmz.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;
import sun.rmi.runtime.Log;

import java.util.HashMap;
import java.util.List;

/**
 * @Classname UserDaoTest
 * @Description TODO
 * @Date 2020/12/26 16:47
 * @Created by mmz
 */
public class UserDaoTest {

    static Logger logger = Logger.getLogger(UserDaoTest.class);

    @Test
    public void getUserList(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();

        UserDao mapper = sqlsession.getMapper(UserDao.class);

        User userList = mapper.getUserById(1);

        System.out.println(userList);
        sqlsession.close();
    }

    @Test
    public void testLog4j(){
        logger.info("info 进入了test");
        logger.debug("info 进入了test");
        logger.error("info 进入了test");
    }

    @Test
    public void testLimit(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        UserDao mapper = sqlsession.getMapper(UserDao.class);
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("startIndex",0);
        hashMap.put("pageSize",2);
        List<User> userByLimit = mapper.getUserByLimit(hashMap);
        for (User user : userByLimit) {
            System.out.println(user);
        }

        sqlsession.close();
    }

}
