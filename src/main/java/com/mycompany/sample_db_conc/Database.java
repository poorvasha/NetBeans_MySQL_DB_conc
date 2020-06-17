
package com.mycompany.sample_db_conc;

import java.sql.*;

public class Database 
{
   

    public static void main(String args[]){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testDemo","root","");
            System.out.println("success");
            
            String sql = "INSERT INTO student (ID, Name, Phn_no) VALUES (?, ?, ?)";
 
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, "0");
            statement.setString(2, "Yuva");
            statement.setString(3, "9090909090");
 
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new user was inserted successfully!");
}
        }
        catch(Exception e){
           System.out.println(e);
        }
    }
    
        
}
