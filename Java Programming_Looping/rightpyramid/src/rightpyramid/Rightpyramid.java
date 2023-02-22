/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rightpyramid;

import java.util.Scanner;

/**
 *
 * @author icc.caloocan
 */
public class Rightpyramid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner chf = new Scanner(System.in);
        
        int row,space,j,a,b = 1;
        
        System.out.print("Enter number of row:");
        row = chf.nextInt();
        
        
        
        
        
       for(j=1; j <=row ;j++)
        {
            
            
             
              for(a=1 ;a<= j;a++)
            {
       
                System.out.print((b++)+" ");
            }
              
           
             
            
             
             
             System.out.println();
        }
    }
    
}

