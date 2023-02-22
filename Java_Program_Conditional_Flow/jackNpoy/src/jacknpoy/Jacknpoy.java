/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act.pkg5.jack.n.poy;

import java.util.Scanner;

/**
 *
 * @author icc.caloocan
 */
public class Jacknpoy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner jiji=new Scanner(System.in);
       
       char r,p,s,R,P,S,p1,p2;
       
       System.out.println("Welcome to the Jack 'n' Poy Game!");
       System.out.println("This game is created by: Jericho Conel");
       System.out.println("Kindly choose between 'Rock','Paper','Scissor'");
       
       
       System.out.print("Player 1:");
       p1 = jiji.next().charAt(0);
       
       System.out.print("Player 2:");
       p2 = jiji.next().charAt(0);
       
       if ((p1 == 'R' || p1 == 'r') && (p2 == 'P' || p2 == 'p'))
         {
           System.out.println("Player 2 WINS!!!");
           System.out.println("Rock Never Wins in Paper!");
         }
       else if ((p1 == 'R' || p1 == 'r') && (p2 == 'S' || p2 == 's'))
         {
           System.out.println("Player 1 WINS!!!");
           System.out.println("Scissor can't cut Rock!");
         }
       else if ((p1 == 'R' || p1 == 'r') && (p2 == 'R' || p2 == 'r'))
         {
           
           System.out.println("Its a tie!");
         }

       else if ((p1 == 'S') || (p1 == 's') && (p2 == 'P') || (p2 == 'P'))
         {
           System.out.println("Player 1 WINS!!!");
           System.out.println("Scissor can cut paper!");
         }
       else if ((p1 == 'S') || (p1 == 's') && (p2 == 'R') || (p2 == 'r'))
         {
           System.out.println("Player 2 WINS!!!");
           System.out.println("Scissor can't cut Rock!!");
         }
       
 
       else if ((p2 == 'S') || (p2 == 's') && (p1 == 'S') || (p1 == 's'))
         {
           System.out.println("It's a Tieeeee!!!");
           
         }
       else if ((p1 == 'P' || p1 == 'p') && (p2 == 'R' || p2 == 'r'))
         {
           System.out.println("Player 1 WINS!!!");
           System.out.println("Rock can't win againts Paper!");
         }
       else if ((p1 == 'P' || p1 == 'p') && (p2 == 'S' || p2 == 's'))
         {
           System.out.println("Player 2 WINS!!!");
           System.out.println("Scissor can cut paper!");
         }
         else if ((p1 == 'P' || p1 == 'p') && (p2 == 'P' || p2 == 's'))
         {
           
           System.out.println("Its a tie!");
         }
         else
         {
          
         }
     
       
       
      
       
       
       
        
        
    }
    
}