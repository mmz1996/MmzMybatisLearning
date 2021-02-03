import com.mmz.dao.StudentMapper;
import com.mmz.dao.TeacherMapper;
import com.mmz.pojo.Student;
import com.mmz.pojo.Teacher;
import com.mmz.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Classname MyTest
 * @Description TODO
 * @Date 2021/1/11 15:06
 * @Created by mmz
 */
public class MyTest {

    @Test
    public void testFindTeacher(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        TeacherMapper mapper = sqlsession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        sqlsession.close();
    }

    @Test
    public void testFindStudent(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        StudentMapper mapper = sqlsession.getMapper(StudentMapper.class);
        List<Student> student = mapper.getStudent();
        for (Student student1 : student) {
            System.out.println(student1);
        }

        sqlsession.close();
    }
}
