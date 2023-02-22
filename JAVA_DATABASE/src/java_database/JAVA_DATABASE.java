/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_database;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author icc.caloocan
 */
public class JAVA_DATABASE {
 Connection con=null;
        
        public static Connection connect()
        {
            try{
                Class.forName("org.sqlite.JDBC");
                  Connection con=DriverManager.getConnection("jdbc:sqlite:INFO.sqlite");
                  
              
  
                return con;      
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Failed");
                return null;
            }
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
