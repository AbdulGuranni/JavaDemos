package com.jdbc.prepared;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class PreSelect {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String username = "root";
        String password = "root";
        String sql = "Select * from cab";
        try (
                Connection connection = DriverManager.getConnection(url, username, password);
                PreparedStatement statement = connection.prepareStatement(sql);
                ResultSet resultSet= statement.executeQuery();
                Scanner sc = new Scanner(System.in);
        ) {

            while(resultSet.next()){
                int cabNumber = resultSet.getInt("cab_number");
                String driverName = resultSet.getString("driver_name");
                String pickLoc = resultSet.getString("pickup_loc");
                String dropLoc = resultSet.getString("drop_loc");
                Time time = resultSet.getTime("pickup_time");
                LocalTime pickupTime = LocalTime.parse(time.toString());
                LocalDate pickupDate = LocalDate.parse(resultSet.getDate("pickup_date").toString());
                System.out.println(cabNumber+"\t"+pickLoc+"\t"+pickupTime+"\t"+pickupDate+"\t"+dropLoc+"\t"+driverName);
            }
            boolean result = statement.execute(sql);
            System.out.println("Table shown"+!result);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
