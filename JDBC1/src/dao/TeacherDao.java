package dao;

import model.Teacher;
import util.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TeacherDao {

    public void create(Teacher teacher) throws Exception {
        String sql = "INSERT INTO teachers (first_name, last_name, subject_id, salary) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, teacher.getFirstName());
            stmt.setString(2, teacher.getLastName());
            stmt.setInt(3, teacher.getSubjectId());
            stmt.setDouble(4, teacher.getSalary());
            stmt.executeUpdate();
        }
    }

    public Teacher readById(int id) throws Exception {
        String sql = "SELECT * FROM teachers WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Teacher(
                        rs.getInt("id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getInt("subject_id"),
                        rs.getDouble("salary")
                );
            }
            return null;
        }
    }

    public List<Teacher> readAll() throws Exception {
        String sql = "SELECT * FROM teachers";
        List<Teacher> teachers = new ArrayList<>();
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                teachers.add(new Teacher(
                        rs.getInt("id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getInt("subject_id"),
                        rs.getDouble("salary")
                ));
            }
        }
        return teachers;
    }

    public void update(Teacher teacher) throws Exception {
        String sql = "UPDATE teachers SET first_name = ?, last_name = ?, subject_id = ?, salary = ? WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, teacher.getFirstName());
            stmt.setString(2, teacher.getLastName());
            stmt.setInt(3, teacher.getSubjectId());
            stmt.setDouble(4, teacher.getSalary());
            stmt.setInt(5, teacher.getId());
            stmt.executeUpdate();
        }
    }

    public void delete(int id) throws Exception {
        String sql = "DELETE FROM teachers WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}
