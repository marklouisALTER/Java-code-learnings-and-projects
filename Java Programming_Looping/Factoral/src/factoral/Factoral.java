/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoral;

import java.util.Scanner;

/**
 *
 * @author icc.caloocan
 */
public class Factoral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tita = new  Scanner(System.in);
        int x,y,product = 0;
        
        System.out.print("Enter a number:");
        y = tita.nextInt();
        
        for(x=1;x<=y;x++)
        {
            
            System.out.println(x);
            product = product + x;
            
        }
            System.out.print("The Factorial of "+y+" is "+product);
        
    }
    
}
