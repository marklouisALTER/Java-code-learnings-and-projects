/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringtest;

import java.util.Scanner;



/**
 *
 * @author icc.caloocan
 */
public class StringTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name,age,status;
        Scanner ki =new Scanner(System.in); 
      System.out.print("Name:");
      name = ki.next();
      
      System.out.print("Age:");
      age = ki.next();
      
      System.out.print("Your Crush:");
      status = ki.next();
      
      
      System.out.println("Your name is:"+name);
      System.out.println("Your Age is  :"+age);
      System.out.println(status+" "+"Is Going to marry your Father!!!");
      
      
      
      
      
      
      
    }
   
   
    
    
       
            
        
        
    
}
