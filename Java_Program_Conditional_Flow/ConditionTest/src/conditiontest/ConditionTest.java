/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditiontest;

import java.util.Scanner;

/**
 *
 * @author icc.caloocan
 */
public class ConditionTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int x = 0;
        
        
        Scanner Tuss = new Scanner(System.in);
        
        System.out.print("Enter Number:");
        x= Tuss.nextInt();
        
        if (x == 1)
        {
            System.out.println("Its Sunday");
            
        }
        else if (x == 2)
                {
                System.out.println("Its Monday");
                }
        else if (x == 3)
                {
                System.out.println("Its Tuesday");
                }
        else if (x == 4)
                {
                System.out.println("Its Wednesday");
                }
        else if (x == 5)
                {
                System.out.println("Its Thursday");
                }
        else if (x == 6)
                {
                System.out.println("Its Friday");
                }
        else
        {
            System.out.println("Invalid Input");
        }
        
            
        
        
        
    }
    
}
