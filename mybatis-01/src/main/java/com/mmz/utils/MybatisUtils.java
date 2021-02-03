package com.mmz.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Classname MybatisUtils
 * @Description TODO
 * @Date 2020/12/24 21:34
 * @Created by mmz
 */
/*sqlsessionfactory*/
public class MybatisUtils {

    private static SqlSessionFactory sqlSessionFactory;
    static {
        // 资源
        String resource = "mybatis-config.xml";
        try {
            // 输入流
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);



        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static SqlSession getSqlsession(){
        return  sqlSessionFactory.openSession();
    }

}
