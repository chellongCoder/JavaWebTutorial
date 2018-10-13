/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chellong
 */
public class DatabaseConnection {

    public static Connection conn;
    public static PreparedStatement statement;

    public DatabaseConnection() {
        conn = null;
    }

    public static Connection connectDatabase() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String connect = "jdbc:mysql://localhost:3306/QuanLySinhVien";
            conn = DriverManager.getConnection(connect, "root", "");
            return conn;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static void select() {
        try {
            System.out.println("danh sach sinh vien: ");
            statement = conn.prepareStatement("select * from SinhVien");
            ResultSet result = statement.executeQuery();
            SimpleDateFormat sdfDate = new SimpleDateFormat("dd-MM-yyyy");
            SimpleDateFormat sdfSql = new SimpleDateFormat("yyyy-MM-dd");
            while (result.next()) {
                System.out.println(result.getString(4));
                SinhVien sv = new SinhVien();
                sv.setId(result.getString("id"));
                sv.setName(result.getString("name"));
                sv.setLop(result.getString("class"));
                sv.setDob(sdfDate.parse(sdfDate.format(
                        sdfSql.parse(result.getString("dob")))));
                System.out.println(sv);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void insert() {
        try {
            SinhVien sv = new SinhVien();
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap id : ");
            sv.setId(sc.nextLine());
            System.out.println("nhap name: ");
            sv.setName(sc.nextLine());
            System.out.println("nhap lop: ");
            sv.setLop(sc.nextLine());
            System.out.println("nhap ngay sinh : ");
            String dobstr = sc.nextLine();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date dob = sdf.parse(dobstr);
            sv.setDob(dob);
            System.out.println("dob : " + dob);
            statement = conn.prepareStatement(
                    "insert into SinhVien(id, name, class, dob)\n"
                    + "values \n"
                    + "(?, ?, ?, ?)");
            String format = new SimpleDateFormat("yyyy/MM/dd").format(dob);
            System.out.println("dob " + format);
            statement.setString(1, sv.getId());
            statement.setString(2, sv.getName());
            statement.setString(3, sv.getLop());
            statement.setString(4, format + "");

            int exec = statement.executeUpdate();
            if (exec != 0) {
                System.out.println("insert thanh cong");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("nhap ngay thang sai!");
        }
    }

    public static void delete() {
        System.out.println("nhap ten sinh vien can xoa: ");
        String name = new Scanner(System.in).nextLine();
        try {
            statement = conn.prepareStatement("delete from SinhVien\n" + "where SinhVien.name like '%" + name + "%'");
            int exec = statement.executeUpdate();
            if (exec != 0) {
                System.out.println("delete thanh cong");
            } else {
                System.out.println("delete failure");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void update() {
        System.out.println("nhap id sinh vien can update: ");
        int id = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("=====ban muon update caai gi?======");
        System.out.println("1. ten");
        System.out.println("2. class");
        System.out.println("3. ngay sinh");
        System.out.println("chon> ");
        int choice = Integer.parseInt(new Scanner(System.in).nextLine());
        switch (choice) {
            case 1:
                updateName(id);
                break;
            case 2:
                updateClass(id);
                break;
            case 3:
                updateDob(id);
            default:
                break;
        }

    }

    public static void updateName(int id) {
        try {
            System.out.println("nhap ten moi> ");
            String name = new Scanner(System.in).nextLine();
            statement = conn.prepareStatement("update SinhVien\n"
                    + "set name='" + name + "'\n"
                    + "where id=" + id + "");
            int exec = statement.executeUpdate();
            if (exec == 1) {
                System.out.println("update suscess");
            } else {
                System.out.println("update that bai");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void updateClass(int id) {
        try {
            System.out.println("nhap lop moi> ");
            String lop = new Scanner(System.in).nextLine();
            statement = conn.prepareStatement("update SinhVien\n"
                    + "set class='" + lop + "'\n"
                    + "where id=" + id + "");
            int exec = statement.executeUpdate();
            if (exec == 1) {
                System.out.println("update suscess");
            } else {
                System.out.println("update that bai");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void updateDob(int id) {
        try {
            System.out.println("nhap ngay sinh moi> ");

            SimpleDateFormat sdfDate = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat sdfSql = new SimpleDateFormat("yyyy/MM/dd");
            Date dob = sdfDate.parse(new Scanner(System.in).nextLine());
            statement = conn.prepareStatement("update SinhVien\n"
                    + "set dob='" + sdfSql.format(dob) + "'\n"
                    + "where id=" + id + "");
            int exec = statement.executeUpdate();
            if (exec == 1) {
                System.out.println("update suscess");
            } else {
                System.out.println("update that bai");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
