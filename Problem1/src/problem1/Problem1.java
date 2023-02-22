
package problem1;
import java.util.Scanner;
public class Problem1 {

    public static void main(String[] args) {
        Scanner mark = new Scanner(System.in);
        int a,b,r,c,sum = 0;
        
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
        System.out.println("The output: ");
        for(a=0;a<r;a++)
        {
            for(b=0;b<c;b++)
            {
                System.out.println(arr[a][b]+" ");
                 sum = sum + arr[a][b];
            }
                
             System.out.println("="+ sum);
                sum=0;       
        }     
                System.out.print(" "); 
    }
    
}
