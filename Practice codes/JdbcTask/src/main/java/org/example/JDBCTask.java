package org.example;
import java.sql.*;

public class JDBCTask {
    private static final String URL ="jdbc:postgresql://localhost:5432/postgres?currentSchema=jdbcwork";//replace localhost with your host name, 5432 with your ports, postgres with your database name, jdbcwork with your schema name
    private static final String USER = "";//enter your user name
    private static final String PASSWORD ="";//enter your password 
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    public static void createUser(String username, String password, String email){
        String sql = "INSERT INTO jdbcwork.user (username, password, email) VALUES (?,?,?)";
        try(Connection conn = getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1,username);
            pstmt.setString(2,password);
            pstmt.setString(3,email);

            int affectedRows = pstmt.executeUpdate();
            if(affectedRows > 0){
                System.out.println("A new user was inserted successfully.");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void updateUser(int id, String username, String password, String email){
        String sql = "UPDATE jdbcwork.user SET username = ?, password = ?, email = ? WHERE id = ?";
        try(Connection conn = getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1,username);
            pstmt.setString(2,password);
            pstmt.setString(3,email);
            pstmt.setInt(4,id);
            int affectedRows = pstmt.executeUpdate();
            if(affectedRows > 0){
                System.out.println("A user detail was updated successfully.");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }

    }
    public static void deleteUser(int id){
        String sql = "DELETE FROM jdbcwork.user WHERE id = ?";
        try(Connection conn = getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setInt(1,id);
            int affectedRows = pstmt.executeUpdate();
            if(affectedRows > 0){
                System.out.println("Deleted successfully.");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public static void getUser(int id){
        String sql = "SELECT * FROM jdbcwork.user WHERE id = ?";
        try(Connection conn = getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setInt(1,id);
            try(ResultSet resultSet = pstmt.executeQuery()){
                while(resultSet.next()){
                    System.out.println("ID: " + resultSet.getInt("id"));
                    System.out.println("Username: " + resultSet.getString("username"));
                    System.out.println("Email: " + resultSet.getString("email"));
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        //createUser("ALEX","alex@24","alex123@gmail.com");
        //updateUser(1, "Arjun", "arjun234", "arjun67@gmail.com");
        //getUser(1);
        deleteUser(1);
    }
}
