package array;
import java.util.Scanner;
public class Array {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i;
        System.out.println("Enter number of elements : ");
        n=sc.nextInt();
        
        
        int arr[]= new int[n];
        System.out.print("Enter all elements: ");
        
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt(); 
        }
        
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
