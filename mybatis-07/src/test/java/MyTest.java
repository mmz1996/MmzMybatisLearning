import com.mmz.dao.BlogMapper;
import com.mmz.pojo.Blog;
import com.mmz.utils.IDUtils;
import com.mmz.utils.MybatisUtils;
import org.apache.ibatis.cache.Cache;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @Classname MyTest
 * @Description TODO
 * @Date 2021/1/11 17:15
 * @Created by mmz
 */
public class MyTest {
//    @Test
//    public void test(){
//        SqlSession sqlsession = MybatisUtils.getSqlsession();
//        BlogMapper mapper = sqlsession.getMapper(BlogMapper.class);
//        Blog blog =  new Blog();
//        blog.setId(IDUtils.getId());
//        blog.setAuthor("mmz");
//        blog.setTitle("java yyds");
//        blog.setCreateTime(new Date());
//        blog.setViews(998);
//        mapper.addBlog(blog);
//
//        blog =  new Blog();
//        blog.setId(IDUtils.getId());
//        blog.setAuthor("mmz");
//        blog.setTitle("python yyds");
//        blog.setCreate_time(new Date());
//        blog.setViews(998);
//        mapper.addBlog(blog);
//
//        blog =  new Blog();
//        blog.setId(IDUtils.getId());
//        blog.setAuthor("mmz");
//        blog.setTitle("php yyds");
//        blog.setCreate_time(new Date());
//        blog.setViews(998);
//        mapper.addBlog(blog);
//
//        blog =  new Blog();
//        blog.setId(IDUtils.getId());
//        blog.setAuthor("mmz");
//        blog.setTitle("c++ yyds");
//        blog.setCreate_time(new Date());
//        blog.setViews(998);
//        mapper.addBlog(blog);
//
//        sqlsession.close();
//    }


    @Test
    public void testIf(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        BlogMapper mapper = sqlsession.getMapper(BlogMapper.class);

        HashMap hashMap = new HashMap();
        hashMap.put("title","java yyds");
        hashMap.put("author","mmz");
        List<Blog> blogs = mapper.queryBlogIF(hashMap);

        for (Blog blog : blogs) {
            System.out.println(blog);
        }

        sqlsession.close();
    }

    @Test
    public void testChoose(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        BlogMapper mapper = sqlsession.getMapper(BlogMapper.class);

        HashMap hashMap = new HashMap();
        hashMap.put("title","java yyds");
        hashMap.put("views",998);
        List<Blog> blogs = mapper.queryBlogChoose(hashMap);

        for (Blog blog : blogs) {
            System.out.println(blog);
        }

        sqlsession.close();
    }

    @Test
    public void testSet(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        BlogMapper mapper = sqlsession.getMapper(BlogMapper.class);

        HashMap hashMap = new HashMap();
        hashMap.put("title","java 123 yyds");
        hashMap.put("id","7c42f56f51a742e7bbd43fdb4d8ad5b6");
        mapper.updateBlog(hashMap);

        sqlsession.close();
    }

    @Test
    public void testForeach(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        BlogMapper mapper = sqlsession.getMapper(BlogMapper.class);

        HashMap hashMap = new HashMap();
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        hashMap.put("ids",list);
        List<Blog> blogs = mapper.queryBlogForeach(hashMap);

        for (Blog blog : blogs) {
            System.out.println(blog);
        }

        sqlsession.close();
    }
}
