
package com.mycompany.attendence;

import SQL.Connect;
import System.Login;
import System.Splash;
import java.io.IOException;

public class Main {
    
    public static void main(String ar[]) throws InterruptedException
    {
        
        Splash s = new Splash();      // splash screen started
        s.setVisible(true);
        try 
        {
         
         Process process = Runtime.getRuntime().exec("C:\\xampp\\xampp_start.exe");  //XAMPPP started          
         s.dispose();
         
         new Login().setVisible(true);
        } 
        catch(Exception e) 
        {
         e.printStackTrace();
        }
    }
}