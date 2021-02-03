import com.mmz.dao.TeacherMapper;
import com.mmz.pojo.Teacher;
import com.mmz.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Classname MyTest
 * @Description TODO
 * @Date 2021/1/11 15:53
 * @Created by mmz
 */
public class MyTest {
    @Test
    public void test(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        TeacherMapper mapper = sqlsession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        sqlsession.close();
    }

    @Test
    public void test1(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        TeacherMapper mapper = sqlsession.getMapper(TeacherMapper.class);
        List<Teacher> teachers = mapper.getTeachers();
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
        sqlsession.close();
    }
}
