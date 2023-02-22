/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act.pkg4.discount;

import java.util.Scanner;

/**
 *
 * @author icc.caloocan
 */
public class Act4Discount {

   
    public static void main(String[] args) {
        
        Scanner jeje=new Scanner(System.in);
        
        int pr,prr,tp;
        double dis,tdp;
        
        
        
        
        System.out.print("Price 1:");
                pr=jeje.nextInt();
                
               
                
                        
         System.out.print("Price 2:");
                prr=jeje.nextInt();
                    tp = pr+prr;
         System.out.println("Total Price:"+tp);
                if (tp <= 500) 
                {
                  dis =  tp *0.05;
                  System.out.println("Discount :"+dis);
              
                   tdp = tp - dis;
       
                  System.out.println("Total Discount:"+tdp);
                 
                  
                }
                  else if ((tp > 500) || (pr < 1000))
                {
                  dis = tp *0.10;
                  System.out.println("Discount :"+dis);
                  
                   tdp = tp - dis;
                  
                  System.out.println("Total Discount:"+tdp);
           
                }
                
                  else if (tp >=1000)
                {
                  dis = tp *0.15;
                  System.out.println("Discount :"+dis);
              
                   tdp = tp - dis;
                  
               
                  System.out.println("Total Discount Price:"+tdp);
                  
                }
            
                
                
         
               
                
                    
        
                
             
                
                
                
               
                
                
  
                
               
                 
              
              
                
                
        
       
        
        
        
        
        
            
           
                   
        
        
        
        
                
        
      
        
    }
    
}
