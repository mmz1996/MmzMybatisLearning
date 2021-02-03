package com.mmz.dao;

import com.mmz.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * @Classname BlogMapper
 * @Description TODO
 * @Date 2021/1/11 16:38
 * @Created by mmz
 */
public interface BlogMapper {

    int addBlog(Blog blog);

    // 查询博客
    List<Blog> queryBlogIF(Map map);

    // 查询
    List<Blog> queryBlogChoose(Map map);

    // 更新博客
    int updateBlog(Map map);

    // 查询第1-2-3，为了测试方便更改一下数据库的id
    List<Blog> queryBlogForeach(Map map);

}
