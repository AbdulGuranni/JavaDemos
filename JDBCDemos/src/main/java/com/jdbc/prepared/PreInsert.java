package com.jdbc.prepared;

import java.sql.*;
import java.util.Scanner;

public class PreInsert {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String username = "root";
        String password = "root";
        String sql = "insert into cab values(?,?,?,?,?,?)";

        try (
                Connection connection = DriverManager.getConnection(url, username, password);
                PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            Scanner sc = new Scanner(System.in);
            for(int i=0;i<5;i++){
                int cabNumber = sc.nextInt();
                String drop = sc.next();
                String pickup = sc.next();
                String time =sc.next();
                String date=sc.next(); //"2024-04-07"
                String driverName = sc.next();


                //Date date1 = Date.valueOf(date);
                statement.setInt(1,cabNumber);
                statement.setString(2,drop);
                statement.setString(3,pickup);
                statement.setTime(4, Time.valueOf("18:00:00"));
                statement.setDate(5,Date.valueOf(date));
                statement.setString(6,driverName);
                boolean result =statement.execute();
                System.out.println(result);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
