/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import BEAN.Authors;
import BEAN.News;
import DB.Connector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chellong
 */
public class NewsManager {
    public static List<News> getAllNew() throws Exception {
        List news = new ArrayList<News>();
        Connection conn = Connector.getConnector();
        String sql = "SELECT * FROM Quan_Ly_Tin_Tuc.News join Quan_Ly_Tin_Tuc.Authors on News.author_id = Authors.id";
        PreparedStatement statement = conn.prepareStatement(sql);
        ResultSet rs = statement.executeQuery();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        while(rs.next()) {
            News n = new News(
                    rs.getInt("id"), 
                    rs.getString("title"), 
                    rs.getString("image"),
                    rs.getString("summary"), 
                    rs.getString("content"), sdf.parse(rs.getString("create_id")),
                    new Authors(rs.getInt("author_id"), rs.getString("name"), rs.getString("email"))
            );
            news.add(n);
        }
        return news;
    }
    public static void main(String[] args) {
        try {
            List<News> list = NewsManager.getAllNew();
            for (int i = 0; i < list.size(); i++) {
                System.out.println("list " + i + list.get(i));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}


