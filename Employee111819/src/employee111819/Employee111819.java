/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee111819;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author icc.caloocan
 */
public class Employee111819 {

 Connection con=null;
        
        public static Connection connect()
        {
            try{
                Class.forName("org.sqlite.JDBC");
                  Connection con=DriverManager.getConnection("jdbc:sqlite:DATABASE.sqlite");
                  
              
  
                return con;      
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Failed");
                return null;
            }
    }
        public static String userM;
        public static String usertype;
    
}
