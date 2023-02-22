/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sum;

import java.util.Scanner;

/**
 *
 * @author icc.caloocan
 */
public class Sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner juju =new Scanner(System.in);
        
                int sum=0,x,z;
        
        System.out.print("Enter a number:");
        z = juju.nextInt();
        
        for(x=1;x<=z;x++)
                {
                    System.out.println(x);
                     sum = sum + x;
                }
                     
                    System.out.print("The Sum is:"+sum);
        
    }
    
}
