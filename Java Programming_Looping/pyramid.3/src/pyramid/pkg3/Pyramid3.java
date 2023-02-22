/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramid.pkg3;

import java.util.Scanner;

/**
 *
 * @author icc.caloocan
 */
public class Pyramid3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner hakdog = new Scanner(System.in);
        
        int row,col,a,b;
        
        System.out.print("Enter number of row:");
        a = hakdog.nextInt();
        
        
        System.out.print("Enter number of colum:");
        b = hakdog.nextInt();
        
        
         for(row = 1; row <= a ;row++)
        {
            
            for(col = 1;col<= row;col++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    
}
