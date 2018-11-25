package com.java.spring.db;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args)  throws SQLException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DatabaseConfig.class);
        @SuppressWarnings("unused")
        DataSource mysql = context.getBean("mysql", DataSource.class);
            if(mysql.getConnection()!=null) System.out.println("OK");
            context.close();
    }
}
