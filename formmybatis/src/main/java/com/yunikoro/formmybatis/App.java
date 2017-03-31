package com.yunikoro.formmybatis;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import junit.framework.Test;

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
    	Class d = Double.class;
    	Class e = Class.forName("[I");
    	Class f = int[].class;
    	Class g = Double.TYPE;
    	Class h = Integer.TYPE;
    	
    	//System.out.println(Object.class.getClasses());
    	Class[] clses = Character.class.getClasses();
    	List<Class> lstCls = new ArrayList<Class>();
    	List<Integer> lstInt = new ArrayList<Integer>();
    	Integer[] testary = {1, 2, 3};
    	lstInt.toArray(testary);
    	System.out.println(lstCls);
    	lstCls.forEach(cls -> {
    		//String c = cls.getName();
    		System.out.println(cls.getName());
    	});
    	
    	lstInt.forEach(cls -> {
    		//String c = cls.getName();
    		System.out.println(cls);
    	});
    }
}
