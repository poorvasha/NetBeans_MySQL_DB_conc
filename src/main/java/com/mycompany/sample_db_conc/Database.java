
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
        }
        catch(Exception e){
           System.out.println(e);
        }
    }
        
}
