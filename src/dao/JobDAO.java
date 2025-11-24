package dao;
import java.sql.*;
import java.util.*;
import model.*;

public class JobDAO {

    public static boolean addJob(Job job) {
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO jobs(title, company, location, description) VALUES (?, ?, ?, ?)"
            );
            ps.setString(1, job.getTitle());
            ps.setString(2, job.getCompany());
            ps.setString(3, job.getLocation());
            ps.setString(4, job.getDescription());
            return ps.executeUpdate() > 0;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static List<Job> getAllJobs() {
        List<Job> list = new ArrayList<>();
        try {
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM jobs");

            while(rs.next()) {
                Job job = new Job(
                    rs.getString("title"),
                    rs.getString("company"),
                    rs.getString("location"),
                    rs.getString("description")
                );
                list.add(job);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
