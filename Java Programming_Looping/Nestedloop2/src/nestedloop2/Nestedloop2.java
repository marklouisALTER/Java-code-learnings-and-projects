/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedloop2;

import java.util.Scanner;

/**
 *
 * @author icc.caloocan
 */
public class Nestedloop2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner dudong = new Scanner(System.in);
        
        int row,col,r,c;
        
        System.out.print("Enter number of row:");
        r = dudong.nextInt();
        
        
        System.out.print("Enter number of colum:");
        c = dudong.nextInt();
        
        
        for(row =r;row >=1;row--)
        {
            
            for(col =c;col >=1;col--)
            {
                
                System.out.print(row);
            }
            System.out.println();
        }
    }
    
}

