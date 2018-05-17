package com.ebook.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class DBUtil {

    private static SqlSessionFactory sqlSessionFactory;

    static {
        String resources = "mybatis-config.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(resources);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static Object getMapperInstance(Class clazz) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession.getMapper(clazz);
    }
}
