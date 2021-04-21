package com.company;
import java.sql.*;
public class conn{
    // interfaces connection and statement.

    //to connect with MySQL
    public Connection c;

    //for MySQL queries exec through this interface
    public Statement s;
    public conn(){
        try{
            //MySQL drivers
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql:///project3", "root", "#yogzz");
            s=c.createStatement();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
