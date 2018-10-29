/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import BEAN.Book;
import DB.Connector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chellong
 */
public class BookModel {

    public static List<Book> getAllBook() throws Exception {
        List<Book> listBook = new ArrayList<Book>();
        Connection conn = Connector.getConnection();
        String sql = "select * from Book";
        PreparedStatement statement = conn.prepareStatement(sql);
        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            int id = rs.getInt("id");
            String title = rs.getString("title");
            String author = rs.getString("author");
            double price = rs.getDouble("price");
            int quantity = rs.getInt("quantity");
            Book book = new Book(id, title, author, price, quantity);
            listBook.add(book);
        }
        return listBook;
    }

    public static int addNewBook(Book book) {
        try {
            Connection conn = Connector.getConnection();
            String sql = "INSERT INTO Book(title, author, price, quantity) VALUES(?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, book.getTitle());
            pstmt.setString(2, book.getAuthor());
            pstmt.setDouble(3, book.getPrice());
            pstmt.setInt(4, book.getQuantity());

            return pstmt.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    public static int deleteBook(String id) throws Exception {
        String query = "delete from Book\n"
                + "where id = ?";
        PreparedStatement statement = Connector.getConnection().prepareStatement(query);
        statement.setString(1, id);
        return statement.executeUpdate();
    }

    public static Book getBook(String id) throws Exception {
        Book book = new Book();
        String query = "select * from Book where Book.id=" + id + "";
        PreparedStatement statment = Connector.getConnection().prepareStatement(query);
        ResultSet rs = statment.executeQuery();
        while (rs.next()) {
            String title = rs.getString("title");
            String author = rs.getString("author");
            double price = rs.getDouble("price");
            int quantity = rs.getInt("quantity");
            book.setId(Integer.parseInt(id));
            book.setTitle(title);
            book.setAuthor(author);
            book.setPrice(price);
            book.setQuantity(quantity);
        }
        return book;
    }

    public static int updateBook(Book book) throws Exception {
        String query = "update Book \n"
                + "set title=?, author=?, price=?, quantity=?\n"
                + "where id=?";
        PreparedStatement statment = Connector.getConnection().prepareStatement(query);
        statment.setString(1, book.getTitle());
        statment.setString(2, book.getAuthor());
        statment.setDouble(3, book.getPrice());
        statment.setInt(4, book.getQuantity());
        statment.setInt(5, book.getId());

        int rs = statment.executeUpdate();

        return rs;
    }
}
