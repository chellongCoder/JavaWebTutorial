package com.java.spring.db;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@EnableWebMvc
@Configuration
@ComponentScan("com.java.spring.*")

public class DatabaseConfig {
    private static final String CONFIG_MYSQL = "/Users/chellong/Workspace/Java_JavaWeb/JavaWebTutorial/Test-Spring3/src/main/resources/mysql.json";
    private static final String CONFIG_POSTGRESQL = "/src/main/resources/postgresql.json";

    public static JSONObject configDatabase (String pathName) throws Exception {
        JSONParser parser = new JSONParser();
        String path = System.getProperty("user.dir");
        System.out.println(path);
        Object obj = parser.parse(new FileReader (pathName));
        JSONObject jsonObject = (JSONObject) obj;
        return jsonObject;
    }

    @Bean(name = "dataSource")
    public DriverManagerDataSource getDataSource() {
        try {
            JSONObject jsonObject = configDatabase(this.CONFIG_MYSQL);
            System.out.println((String) jsonObject.get("db.driver"));
            DriverManagerDataSource bds = new DriverManagerDataSource();
            bds.setDriverClassName((String) jsonObject.get("db.driver"));
            bds.setUrl((String) jsonObject.get("db.url"));
            bds.setUsername((String) jsonObject.get("db.username"));
            bds.setPassword((String) jsonObject.get("db.password"));
            System.out.println("MANAGER" + bds.toString());
            return bds;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


//    @Bean("postgresql")
//    public DriverManagerDataSource getPostgreSQLDataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName(env.getProperty("jdbc.driver"));
//        dataSource.setUrl(env.getProperty("jdbc.url"));
//        dataSource.setUsername(env.getProperty("jdbc.username"));
//        dataSource.setPassword(env.getProperty("jdbc.password"));
//        return dataSource;
//    }
//    @SuppressWarnings("unchecked")
//    public static void main(String[] args) {
//        JSONParser parser = new JSONParser();
//        String path = System.getProperty("user.dir");
//        System.out.println(path);
//        File file = new File(path + "/src/main/resources/mysql.json");
//
//        try {
//            if (!file.exists()) {
//                file.createNewFile();
//            }
//            Object obj = parser.parse(new FileReader(
//                    path+"/src/main/resources/mysql.json"));
//            JSONObject jsonObject = (JSONObject) obj;
//            String driver = (String) jsonObject.get("db.driver");
//            String url = (String) jsonObject.get("db.url");
//            String username = (String) jsonObject.get("db.username");
//            String password = (String) jsonObject.get("db.password");
//
//            System.out.println("driver " + driver + "url " + url + "username " + username + "password " + password);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}

