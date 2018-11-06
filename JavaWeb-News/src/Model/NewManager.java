package Model;

import BEAN.Author;
import BEAN.New;
import DB.Connector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class NewManager {

    public static List<New> getAllNew() throws Exception {
        List news = new ArrayList();
        Connection conn = Connector.getConnector();
        String sql = "SELECT * FROM Quan_Ly_Tin_Tuc.News join Quan_Ly_Tin_Tuc.Authors on News.author_id = Authors.id";
        PreparedStatement statement = conn.prepareStatement(sql);
        ResultSet rs = statement.executeQuery();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        while(rs.next()) {
            New n = new New(
                    rs.getInt("id"),
                    rs.getString("title"),
                    rs.getString("image"),
                    rs.getString("summary"),
                    rs.getString("content"),
                    sdf.parse(rs.getString("create_id")),
                    new Author(rs.getInt("author_id"), rs.getString("name"), rs.getString("email"))
            );

            news.add(n);
        }
        return news;
    }

    public static List<New> fetchList (int offset, int recordPerPage) throws Exception {
        List<New> news = new ArrayList<>();

        String sql = "select News.*, Authors.email, Authors.name from News join Authors on News.author_id = Authors.id limit ?,?";
        PreparedStatement statement = Connector.getConnector().prepareStatement(sql);
        statement.setInt(1, (offset*recordPerPage));
        statement.setInt(2, (recordPerPage));
        ResultSet rs = statement.executeQuery();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        while (rs.next()) {
            New n = new New(
                    rs.getInt("id"),
                    rs.getString("title"),
                    rs.getString("image"),
                    rs.getString("summary"),
                    rs.getString("content"),
                    sdf.parse(rs.getString("create_id")),
                    new Author(rs.getInt("author_id"), rs.getString("name"), rs.getString("email"))
            );
            news.add(n);
        }
        return news;
    }

    public static List<New> searchNew (String param) throws Exception {
        List<New> news = new ArrayList<>();
        String sql = "select News.*, Authors.name, authors.email "
                + "from News join Authors on News.author_id = Authors.id "
                + "where News.title like ?";
        PreparedStatement pstmt = Connector.getConnector().prepareStatement(sql);
        pstmt.setString(1, "%"+param+"%");
        ResultSet rs = pstmt.executeQuery();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        while (rs.next()) {
            New n = new New(
                    rs.getInt("id"),
                    rs.getString("title"),
                    rs.getString("image"),
                    rs.getString("summary"),
                    rs.getString("content"),
                    sdf.parse(rs.getString("create_id")),
                    new Author(rs.getInt("author_id"), rs.getString("name"), rs.getString("email"))
            );
            news.add(n);
        }
        return news;
    }

    /*
    * TODO: Test
    * */
    public static void main(String[] args) {
        try {
//            List<New> list = NewManager.getAllNew();
//            for (int i = 0; i < list.size(); i++) {
//                System.out.println("list " + i + list.get(i));
//            }
//            double result = (float)10/3;
//            System.out.println(Math.round(result)+"" + result);
//            int page = (int)Math.ceil(result);
//            System.out.println(page);
            List<New> lists = NewManager.fetchList(0, 3);
            for (New n:
                    lists) {
                System.out.println(n);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
