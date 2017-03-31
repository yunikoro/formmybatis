package com.yunikoro.formmybatis;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws Exception {
        /*System.out.println("Hello World!");
        String resource = "com/yunikoro/formmybatis/config/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        System.out.println(inputStream);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);*/
        
    	Class c = "foo".getClass();
    	System.out.println(c.getSimpleName());
    }
}
