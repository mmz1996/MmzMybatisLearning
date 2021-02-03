package com.mmz.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @Classname Blog
 * @Description TODO
 * @Date 2021/1/11 16:34
 * @Created by mmz
 */
@Data
public class Blog {
    private String id ;
    private String title;
    private String author;
    private Date createTime;
    private int views;

}
