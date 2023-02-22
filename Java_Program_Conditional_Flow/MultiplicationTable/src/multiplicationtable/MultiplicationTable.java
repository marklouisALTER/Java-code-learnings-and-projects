/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicationtable;

import java.util.Scanner;

/**
 *
 * @author icc.caloocan
 */
public class MultiplicationTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        Scanner neneng = new Scanner(System.in);
        
        int t,r,f=0,s=0;
        
        System.out.print("Enter number of Table:");
        t = neneng.nextInt();
        
        
        System.out.print("Enter number of Row:");
        r = neneng.nextInt();
        
        
        for(f = 1; f <=t ;f++)
        {
            
            for(s = 1;s <= r;s++)
            {
                
                System.out.println(f+ "x" + s + " = "+(f*s));
            }
            System.out.println();
        }
    
    }

}
