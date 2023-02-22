
package lineartimes;
import java.util.Scanner;
public class Lineartimes {

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n,temp=0,c,i;
    System.out.print("Enter number of element: ");
    n=sc.nextInt();
    int a[]=new int[n];
    System.out.print("Enter all elements: ");
    for( i =0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
       System.out.print("Enter number to search: ");
    c=sc.nextInt();
for(i=0;i<n;i++)
{
    if(a[i]==c)
    {
        temp = temp + 1 ;
    }
    else    
    {
        
    }
}
    System.out.println("Element found");
    System.out.print("it found"+temp+"times");
    }
    
}
