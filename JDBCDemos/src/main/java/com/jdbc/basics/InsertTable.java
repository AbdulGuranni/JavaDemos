package com.jdbc.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertTable {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/voyatraining";
        String username="root";
        String password="root";
        //get the connection object
        try(Connection connection=DriverManager.getConnection(url,username,password);
        //create a statement object
        Statement statement = connection.createStatement();) {
            //pass the sql query to be executed
            String sql = "insert into employee values('Hitaishi',4,'Mysore')";
            boolean result = statement.execute(sql);
            System.out.println("Data inserted" + !result);
        }catch (Exception  e){
            System.out.println(e.getMessage());
            e.getMessage();
        }
    }
}
