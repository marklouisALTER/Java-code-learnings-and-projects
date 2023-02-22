
package array2;
import java.util.Scanner;
public class Array2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,a,i,b,sum=0,ave;
        System.out.println("Enter number of elements : ");
        n=sc.nextInt();
        
        
        int arr[]= new int[n];
        System.out.print("Enter grades: ");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt(); 
            
            sum=sum+arr[i];
            
        }
        ave=sum / n;
        System.out.print(ave);

    }
    
}
