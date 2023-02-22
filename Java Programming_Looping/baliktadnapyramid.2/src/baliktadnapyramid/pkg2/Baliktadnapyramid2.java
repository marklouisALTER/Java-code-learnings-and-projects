/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baliktadnapyramid.pkg2;

import java.util.Scanner;

/**
 *
 * @author icc.caloocan
 */
public class Baliktadnapyramid2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner btt = new Scanner(System.in);
        
        int row,col,a,b;
        
        System.out.print("Enter number of row:");
        a = btt.nextInt();
        
        
        System.out.print("Enter number of colum:");
        b = btt.nextInt();
        
        
        for(row = a; row >=1 ;row--)
        {
            
            for(col = 1;col<= row;col++)
            {
                System.out.print(row);
            }
            System.out.println();
        }
    }
    
}
