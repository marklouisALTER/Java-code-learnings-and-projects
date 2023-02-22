/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmyk;

import java.util.Scanner;

/**
 *
 * @author icc.caloocan
 */
public class CMYK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        char letter;
       
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter Letter:");
        letter = scan.next().charAt(0);
        
        if (letter == 'c'||letter=='C');
        {
            System.out.print("Its Yan");
        }
        
        
        
    }
    
}
