/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horoscope;

import java.util.Scanner;

/**
 *
 * @author icc.caloocan
 */
public class Horoscope {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner zodiac = new Scanner(System.in);
        
        int month,days;
        
        System.out.print("Enter Month:");
        month=zodiac.nextInt();
        
        System.out.print("Enter Day:");
        days=zodiac.nextInt();
        
        if(month == 1)
        {
         if (days <=18)
         {
             System.out.println("Your Capricorn");
             System.out.println("text");
         }
         else if (days >31)
         {
             System.out.println("Invalid Date!");
         }
         else
         {
             System.out.println("Your Aquarius");
         }
        }
        
        if(month == 2)
        {
         if (days <=17)
         {
             System.out.println("Your Aquarius ");
             System.out.println("text");
         }
         else if (days >31)
         {
             System.out.println("Invalid Date!");
         }
         else
         {
             System.out.println("Your Pisces ");
         }
        }
        
        if(month == 3)
        {
         if (days <=19)
         {
             System.out.println("Your Pisces");
             System.out.println("text");
         }
         else if (days >31)
         {
             System.out.println("Invalid Date!");
         }
         else
         {
             System.out.println("Your Aquarius");
         }
        }
        
        if(month == 4)
        {
         if (days <= 18)
         {
             System.out.println("Your Pisces");
             System.out.println("text");
         }
         else if (days >31)
         {
             System.out.println("Invalid Date!");
         }
         else
         {
             System.out.println("Your your Taurus ");
         }
        }
        
        if(month == 4)
        {
         if (days <=19)
         {
             System.out.println("Your Taurus");
             System.out.println("text");
         }
         else if (days >31)
         {
             System.out.println("Invalid Date!");
         }
         else
         {
             System.out.println("Your Gemini");
         }
        }
        
        if(month == 5)
        {
         if (days <=20)
         {
             System.out.println("Your Taurus");
             System.out.println("text");
         }
         else if (days >31)
         {
             System.out.println("Invalid Date!");
         }
         else
         {
             System.out.println("Your Gemini");
         }
        }
        
        if(month == 6)
        {
         if (days <=20)
         {
             System.out.println("Your Gimini ");
             System.out.println("text");
         }
         else if (days >31)
         {
             System.out.println("Invalid Date!");
         }
         else
         {
             System.out.println("Your Cancer");
         }
        }
        
        if(month == 7)
        {
         if (days <=22)
         {
             System.out.println("Your Cancer");
             System.out.println("");
         }
         else if (days >31)
         {
             System.out.println("Invalid Date!");
         }
         else
         {
             System.out.println("Your Leo");
         }
        }
        
        if(month == 8)
        {
         if (days <=22)
         {
             System.out.println("Your Leo");
             System.out.println("text");
         }
         else if (days >31)
         {
             System.out.println("Invalid Date!");
         }
         else
         {
             System.out.println("Your Virgo");
         }
        }
        
        if(month == 9)
        {
         if (days <=22)
         {
             System.out.println("Your Virgo");
             System.out.println("text");
         }
         else if (days >31)
         {
             System.out.println("Invalid Date!");
         }
         else
         {
             System.out.println("Your Libra");
         }
        }
        
        if(month == 10)
        {
         if (days <=22)
         {
             System.out.println("Your Libra");
             System.out.println("text");
         }
         else if (days >31)
         {
             System.out.println("Invalid Date!");
         }
         else
         {
             System.out.println("Your Scorpio ");
         }
        }
        
        if(month == 11)
        {
         if (days <=21)
         {
             System.out.println("Your Scorpio");
             System.out.println("text");
         }
         else if (days >31)
         {
             System.out.println("Invalid Date!");
         }
         else
         {
             System.out.println("Your Saguitarius");
         }
        }
        
        if(month == 12)
        {
         if (days <=21)
         {
             System.out.println("Your Saguitarius");
             System.out.println("text");
         }
         else if (days >31)
         {
             System.out.println("Invalid Date!");
         }
         else
         {
             System.out.println("Your Capricorn");
         }
        }
        
        
        
        
        
         
        
    }
    
}
