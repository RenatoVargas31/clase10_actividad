package com.example.clase10crud.daos;

import com.example.clase10crud.beans.Employees;

import java.sql.*;
import java.util.ArrayList;
public class EmployeesDao {
    public ArrayList<Employees> listar(){

        ArrayList<Employees> lista = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String url = "jdbc:mysql://localhost:3306/hr";
        String username = "root";
        String password = "123456";

        String sql = "select * from Employees";


        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Employees Employees = new Employees();
                Employees.setEmployeeId(rs.getInt(1));
                Employees.setHiredate(String.valueOf(rs.getDate(2)));
                Employees.setFirstname(rs.getString(3));
                Employees.setLastname(rs.getString(4));
                Employees.setEmail(rs.getString(5));
                Employees.setManagerid(rs.getInt(6));

                lista.add(Employees);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return lista;
    }
    public void crear(String EmployeeId, String HireDate, int Firstname, int maxSalary){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String url = "jdbc:mysql://localhost:3306/hr";
        String username = "root";
        String password = "123456";

        String sql = "insert into jobs (job_id, job_title, min_salary,max_salary) values (?,?,?,?)";

        try(Connection connection = DriverManager.getConnection(url,username,password);
            PreparedStatement pstmt = connection.prepareStatement(sql)){

            pstmt.setString(1,jobId);
            pstmt.setString(2,jobTitle);
            pstmt.setInt(3,minSalary);
            pstmt.setInt(4,maxSalary);

            pstmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
