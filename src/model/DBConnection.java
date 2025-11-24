package model;
import java.sql.*;

public class DBConnection {
    static final String URL = "jdbc:mysql://localhost:3306/superio";
    static final String USER = "root";
    static final String PASS = "seventeen13";

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, PASS);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}

