package service;

import java.sql.*;

public class UserService {
    private Connection conn;

    // Конструктор: подключение к базе данных
    public UserService() {
        try {
            // Замените "school_db", "postgres", "mypassword" на свои данные
            conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/SchoolManagmentSystem",
                    "postgres",
                    "#Ademokkaaa0327"
            );
            System.out.println("Connection successful!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Connection failed!");
        }
    }

    // CREATE: добавление нового пользователя
    public void addUser(String firstName, String lastName, String role,
                        String email, String password, String gender,
                        Date dateOfBirth, String phone, String address) {
        String sql = "INSERT INTO users (first_name, last_name, role, email, password, gender, date_of_birth, phone, address) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.setString(3, role);
            ps.setString(4, email);
            ps.setString(5, password);
            ps.setString(6, gender);
            ps.setDate(7, dateOfBirth);
            ps.setString(8, phone);
            ps.setString(9, address);

            ps.executeUpdate();
            System.out.println("User added successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // READ: вывод всех пользователей
    public void readUsers() {
        String sql = "SELECT * FROM users";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                int id = rs.getInt("user_id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String email = rs.getString("email");
                Date dob = rs.getDate("date_of_birth");
                String role = rs.getString("role");
                String address = rs.getString("address");

                System.out.println(id + ": " + firstName + " " + lastName +
                        " | " + email + " | " + role + " | DOB: " + dob +
                        " | Address: " + address);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // UPDATE: изменить email по user_id
    public void updateEmail(int userId, String newEmail) {
        String sql = "UPDATE users SET email = ? WHERE user_id = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, newEmail);
            ps.setInt(2, userId);

            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Email updated successfully!");
            } else {
                System.out.println("User not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE: удалить пользователя по user_id
    public void deleteUser(int userId) {
        String sql = "DELETE FROM users WHERE user_id = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, userId);

            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("User deleted successfully!");
            } else {
                System.out.println("User not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
