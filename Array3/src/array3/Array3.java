
package array3;
import java.util.Scanner;
public class Array3 {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n,temp;
    System.out.print("Enter number of elements: ");
    n = sc.nextInt();
    int a[]=new int[n];
    System.out.print("Enter all the elements : ");
    for(int i =0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(a[i]<a[j])
            {
                temp = a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
    }
    System.out.print("The largest number:");
    for(int i=0;i==0;i++)
    {
        System.out.print(a[i]+" ");
    }

    System.out.print("\nThe Smallest number: ");
    for(int i=n-1;i<=0;i--)
    {
        System.out.print(a[i]+ " ");
    }
    System.out.print(a[n-1]);
    }
    
}
