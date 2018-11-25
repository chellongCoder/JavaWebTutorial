package com.boraji.tutorial.spring;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author imssbora
 *
 */
public class MainApp {
   public static void main(String[] args) throws SQLException {
      AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);

      @SuppressWarnings("unused")
      DataSource mysql = context.getBean("mysql", DataSource.class);
      
      @SuppressWarnings("unused")
      DataSource postgresql = context.getBean("postgresql", DataSource.class);
      context.close();
   }
}
