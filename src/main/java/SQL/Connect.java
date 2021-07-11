
package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect {
    
    public Connection con;
    public Statement stm;
    
    public Connect()
    {
        try 
        {
            
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendence", "root", ""); // if DB already exits
                
	} 
        catch (Exception e) 
        {
                            
                try
                {
                    
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "");    // if DB has to be created
                    stm = con.createStatement();
                
                    String query = "CREATE DATABASE attendence";
                    stm.executeUpdate(query);                
                    stm.close();
                    con.close();
                    
                    
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendence", "root", "");   // connect to the created DB
                    
                    stm = con.createStatement();
                    
                    query = "CREATE TABLE employee"
                            + "("
                            + "ID int(255) auto_increment,"
                            + "Name varchar(255),"
                            + "Em_Id varchar(255) Not Null,"
                            + "Gender int(5),"
                            + "Category int(5),"
                            + "Primary key (ID),"
                            + "Unique(Em_Id)"
                            + ")";
                    stm.executeUpdate(query);
                    
                    query = "CREATE TABLE attend"
                            + "("
                            + "AID int(255) auto_increment,"
                            + "Em_Id varchar(255),"
                            + "A_L int(5),"
                            + "DDate timestamp ,"
                            + "Attendence int(5),"
                            + "Primary key (AID),"
                            + "Foreign key (Em_Id) References employee (Em_Id) ON DELETE CASCADE"
                            + ")";
                    stm.executeUpdate(query);
                     
                    query = "CREATE TABLE salary"
                            + "("
                            + "SID int(255) auto_increment,"
                            + "Em_Id varchar(255),"
                            + "Total int(255),"
                            + "Primary key (SID),"
                            + "Foreign key (Em_Id) References employee (Em_Id) ON DELETE CASCADE"
                            + ")";
                    stm.executeUpdate(query);
                    
                    query = "CREATE TABLE advance"
                            + "("
                            + "ASID int(255) auto_increment,"
                            + "Em_Id varchar(255),"
                            + "Advance_salary int(255),"
                            + "DDate timestamp,"
                            + "Primary key (ASID),"
                            + "Foreign key (Em_Id) References employee (Em_Id) ON DELETE CASCADE"
                            + ")";
                    stm.executeUpdate(query);
                    
                    query = "CREATE TABLE deduct"
                            + "("
                            + "ASID int(255) auto_increment,"
                            + "Em_Id varchar(255),"
                            + "Deduct_amount int(255),"
                            + "DDate timestamp,"
                            + "Primary key (ASID),"
                            + "Foreign key (Em_Id) References employee (Em_Id) ON DELETE CASCADE"
                            + ")";
                    stm.executeUpdate(query);
                    
                }
                catch(ClassNotFoundException | SQLException ex)
                {
                    ex.printStackTrace();
                }
                             
	}
    }
    
}
