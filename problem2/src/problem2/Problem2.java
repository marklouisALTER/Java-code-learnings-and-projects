
package problem2;
import java.util.Scanner;
public class Problem2 {

    public static void main(String[] args) {
            Scanner mark = new Scanner(System.in);
        int a,b,r,c;
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
       
          System.out.println("Math   English   Programming");
          for(a=0;a<r;a++)
        {
            for(b=0;b<c;b++)
            {
                 
                System.out.print("  "+arr[a][b]+"      ");

               
            }
           
          System.out.println(" "); 
                   
        }
                         

        
        
       
    }
    
}
