/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydatabase;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author icc.caloocan
 */
public class MYDATABASE {
        Connection con=null;
        
        public static Connection connect()
        {
            try{
                Class.forName("org.sqlite.JDBC");
                Connection con=DriverManager.getConnection("jdbc:sqlite:MYDATABASE.sqlite");
                JOptionPane.showMessageDialog(null,"Success");
                return con;
            
                
                
                
                
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Failed");
                return null;
            }
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
