
package problem1b;

import java.util.Scanner;

public class Problem1b {

    public static void main(String[] args) {
        
        Scanner mark = new Scanner(System.in);
        int a,b,r,c,sum = 0,sum1=0;
        
        System.out.print("Enter row: ");
        r= mark.nextInt();
        System.out.print("Enter col: ");
        c = mark.nextInt();
        
  int arr[][]= new int[r][c];
        
        for(a=0;a<r;a++)
             {
              for(b=0;b<c;b++)
                 {
            arr[a][b]=mark.nextInt();
                 }
             }
        
        
        
    for(a=0;a<r;a++)
        {
        for(b=0;b<c;b++)
           {
           System.out.print(arr[a][b]+" ");
           sum = sum + arr[a][b];
           }  
        System.out.println( );
        
        }
   
   
   
         for(a=0;a<r;a++)
           {
           for(b=0;b<c;b++)
              {
              sum1 = sum1 + arr[b][a];
              }
           System.out.print(sum1+" ");
           sum1=0;         
           }            

    }
    
}
