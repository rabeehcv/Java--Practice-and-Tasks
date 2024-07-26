package org.example;

import java.sql.*;

//to establish connection with database
class DBConnection{
    private static final String URL = "jdbc:postgresql://localhost:5432/school_db?currentSchema=people";
    private static final String USER = "postgres";//provide correct username
    private static final String PASSWORD = "";//for the time being, the password is hidden for privacy. To run the code, we should provide the correct password for the database connection. 
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

}
//For fetching data from teacher table in people schema of school_db database
class TeacherFetcher extends Thread{
    public void run(){
        String sql = "SELECT * FROM people.teacher";
        try(Connection conn = DBConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            try(ResultSet resultSet = pstmt.executeQuery()){
                while(resultSet.next()){
                    System.out.println("ID: " + resultSet.getInt("id") + ", "+"First Name: " + resultSet.getString("first_name")+", "+"Last Name: " + resultSet.getString("last_name")+", "+"Designation: " + resultSet.getString("designation")+", "+"Email: " + resultSet.getString("email")+" ");
                    try{
                        Thread.sleep(5);
                    }catch(InterruptedException e){
                        throw new RuntimeException(e);
                    }
                }
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
//For fetching data from student table in people schema of school_db database
class StudentFetcher extends Thread{
    public void run(){
        String sql = "SELECT * FROM people.student";
        try(Connection conn = DBConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            try(ResultSet resultSet = pstmt.executeQuery()){
                while(resultSet.next()){
                    System.out.println("ID: " + resultSet.getInt("id") + ", "+"First Name: " + resultSet.getString("first_name")+", "+"Last Name: " + resultSet.getString("last_name")+", "+"Designation: " + resultSet.getString("designation")+", "+"Email: " + resultSet.getString("email")+" ");
                    try{
                        Thread.sleep(5);
                    }catch(InterruptedException e){
                        throw new RuntimeException(e);
                    }
                }
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
//For fetching data from cleaning_staff table in people schema of school_db database
class StaffFetcher extends Thread{
    public void run(){
        String sql = "SELECT * FROM people.cleaning_staff";
        try(Connection conn = DBConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            try(ResultSet resultSet = pstmt.executeQuery()){
                while(resultSet.next()){
                    System.out.println("ID: " + resultSet.getInt("id") + ", "+"First Name: " + resultSet.getString("first_name")+", "+"Last Name: " + resultSet.getString("last_name")+", "+"Designation: " + resultSet.getString("designation"));
                    try{
                        Thread.sleep(5);
                    }catch(InterruptedException e){
                        throw new RuntimeException(e);
                    }
                }
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }


}
public class DBTask {

    public static void main(String[] args) {
        //creating thread object
        TeacherFetcher teacherFetcher = new TeacherFetcher();
        StudentFetcher studentFetcher = new StudentFetcher();
        StaffFetcher staffFetcher = new StaffFetcher();
        //calling start() method for thread execution
        teacherFetcher.start();
        studentFetcher.start();
        staffFetcher.start();
    }
}
