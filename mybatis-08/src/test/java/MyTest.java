import com.mmz.dao.UserMapper;
import com.mmz.pojo.User;
import com.mmz.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Classname MyTest
 * @Description TODO
 * @Date 2021/2/2 18:31
 * @Created by mmz
 */
public class MyTest {
    @Test
    public void testUser(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);

        List<User> users = mapper.queryUsers();

        for (User user : users) {
            System.out.println(user);
        }

        sqlsession.close();
    }

    @Test
    public void testUserById(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);
        User user = mapper.queryUserById(1);

        sqlsession.clearCache();
        User user1 = mapper.queryUserById(1);

        System.out.println(user);
        System.out.println(user1);
        System.out.println(user == user1);

        sqlsession.close();
    }


    @Test
    public void testUserUpdateAndSelect(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);

        User user = mapper.queryUserById(1);
        System.out.println(user);

        User user1 = new User();
        user1.setId(1);
        user1.setName("zxg");
        user1.setPwd("xixi");
        mapper.updateUser(user1);

        User user2 = mapper.queryUserById(1);
        System.out.println(user2);
        System.out.println(user == user2);

        sqlsession.close();
    }
}
