/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import BEAN.SinhVien;
import DB.Connector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chellong
 */
public class StudentModel {

    public static List<SinhVien> getAll() {
        try {
            List<SinhVien> list = new ArrayList<>();
            Connection conn = Connector.getConnection();
            String sql = "Select * from SinhVien";
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                SinhVien sv = new SinhVien();
                sv.setId(rs.getInt("id"));
                sv.setName(rs.getString("name"));
                sv.setKhoa(rs.getString("khoa"));
                sv.setLop(rs.getString("lop"));
                list.add(sv);
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }
    public static int addNew (SinhVien sv) {
        try {
            Connection conn = Connector.getConnection();
            String sql = "INSERT INTO SinhVien(name, khoa, lop) VALUES(?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, sv.getName());
            pstmt.setString(2, sv.getKhoa());
            pstmt.setString(3, sv.getLop());
            return pstmt.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }
    
    public static SinhVien getStudent (String id) throws Exception {
        SinhVien sv = new SinhVien();
        String query = "select * from SinhVien where SinhVien.id="+id+"";
        PreparedStatement statment = Connector.getConnection().prepareStatement(query);
        ResultSet rs = statment.executeQuery();
        while(rs.next()) {
            String name = rs.getString("name");
            String khoa = rs.getString("khoa");
            String lop = rs.getString("lop");
            sv.setId(Integer.parseInt(id));
            sv.setName(name);
            sv.setKhoa(khoa);
            sv.setLop(lop);
        }
        return sv;
    }
    
    public static int updateStudent(SinhVien sv) throws Exception {
        String query = "update SinhVien \n" +
                    "set name=?, khoa=?, lop=?\n" +
                    "where id=?";
        PreparedStatement statment = Connector.getConnection().prepareStatement(query);  
        statment.setString(1, sv.getName());
        statment.setString(2, sv.getKhoa());
        statment.setString(3, sv.getLop());
        statment.setInt(4, sv.getId());
        int rs = statment.executeUpdate();

        return rs;
    }
    
    public static int deleteStudent (String id) throws Exception {
        String query = "delete from SinhVien\n" +
"where id = ?";
        PreparedStatement statement = Connector.getConnection().prepareStatement(query);
        statement.setString(1, id);
        return statement.executeUpdate();
    }
     public static void main(String[] args) {
        try {
            List<SinhVien> list = getAll();
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
