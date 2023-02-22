/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedloop1;

import java.util.Scanner;

/**
 *
 * @author icc.caloocan
 */
public class Nestedloop1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner tito = new Scanner(System.in);
        
        int row,col,y,c;
        
        System.out.print("Enter number of row:");
        y = tito.nextInt();
        
        
        System.out.print("Enter number of colum:");
        c = tito.nextInt();
        
        
        for(row = 1; row <=y ;row++)
        {
            
            for(col = 1;col <= c;col++)
            {
                System.out.print(col);
            }
            System.out.println();
        }
        
       
    }
    
}
