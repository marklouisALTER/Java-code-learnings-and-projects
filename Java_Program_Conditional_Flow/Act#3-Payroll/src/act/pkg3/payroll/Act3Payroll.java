/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act.pkg3.payroll;

import java.util.Scanner;

/**
 *
 * @author icc.caloocan
 */
public class Act3Payroll {

    public static void main(String[] args) {
        
      
        
      Scanner jojo =new Scanner(System.in); 
      String fn,pos;
      int age,all,rd,rh,sss,pb,phi,gp,td,np,st;
      
        System.out.print("Enter Your Name:");
          fn=jojo.next();
        
         System.out.print("Enter Your Age:");
          age=jojo.nextInt();
        
         System.out.print("Enter Your Position:");
          pos=jojo.next();
          
         System.out.print("Add Allowance:");
          all=jojo.nextInt();
        
         System.out.print("Earnings:");
          
          
          System.out.print("Rate per Day:");
          rd=jojo.nextInt();
          
          System.out.print("Rate per Hour:");
          rh=jojo.nextInt();
          
          System.out.print("Deduction:");
         
          
          System.out.print("SSS:");
          sss=jojo.nextInt();
          
          System.out.print("Pag-ibig:");
          pb=jojo.nextInt();
          
          System.out.print("PhilHealth:");
          phi=jojo.nextInt();
          
          st = rh*rd;
          gp = st + all;
          td = pb + phi + sss;
          np = gp - td;
          
          System.out.println("Name:"+fn);
          System.out.println("Age:"+age);
          System.out.println("Position:"+pos);
          System.out.println("Sub-Totat:"+st);
          System.out.println("Grosspay:"+gp);
          System.out.println("Total Deduction:"+td);
          System.out.println("Netpay:"+np);
          System.out.println(" Thank You !");
          
          
          
        
      
  
      
    }
    
}
