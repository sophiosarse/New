package dao;

import model.Subject;
import util.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SubjectDao {
    public void create(Subject subject) throws Exception {
        String sql = "INSERT INTO subjects (subject_name) VALUES (?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, subject.getSubjectName());
            stmt.executeUpdate();
        }
    }

    public Subject readById(int id) throws Exception {
        String sql = "SELECT * FROM subjects WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Subject(rs.getInt("id"), rs.getString("subject_name"));
            }
            return null;
        }
    }

    public List<Subject> readAll() throws Exception {
        String sql = "SELECT * FROM subjects";
        List<Subject> subjects = new ArrayList<>();
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                subjects.add(new Subject(rs.getInt("id"), rs.getString("subject_name")));
            }
        }
        return subjects;
    }

    public void update(Subject subject) throws Exception {
        String sql = "UPDATE subjects SET subject_name = ? WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, subject.getSubjectName());
            stmt.setInt(2, subject.getId());
            stmt.executeUpdate();
        }
    }

    public void delete(int id) throws Exception {
        String sql = "DELETE FROM subjects WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}
