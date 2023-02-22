package array4;
import java.util.Scanner;
public class Array4 {
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
    System.out.print("Even number:");
    for(int i=0;i<n;i++)
    {
    if (a[i]%2==0)
    {
        System.out.print(a[i]+" ");
    }
    }
    System.out.print("\n Odd number: ");
    for(int i=0;i<n;i++)
    {
        if (a[i]%2==1)
        {
      System.out.print(a[i]+" ");
        }
            
            }
    
    }
    
}
