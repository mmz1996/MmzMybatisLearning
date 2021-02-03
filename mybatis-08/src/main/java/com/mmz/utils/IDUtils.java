package com.mmz.utils;

import org.junit.Test;

import java.util.UUID;

/**
 * @Classname IDUtils
 * @Description TODO
 * @Date 2021/1/11 16:41
 * @Created by mmz
 */
@SuppressWarnings("all") // 抑制警告
public class IDUtils {
    public static String getId(){
        return UUID.randomUUID().toString().replace("-","");
    }
    @Test
    public void test(){
        System.out.println(IDUtils.getId());
    }
}
