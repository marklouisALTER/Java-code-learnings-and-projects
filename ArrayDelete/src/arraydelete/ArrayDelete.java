
package arraydelete;
import java.util.Scanner;
public class ArrayDelete {
 public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
    int n,b,y,i,c;
    System.out.print("Enter number of elements: ");
    n = sc.nextInt();
    int a[]=new int[n];
    System.out.print("Enter all the elements : ");
    for(i =0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
 
    System.out.print("Enter number to delete: ");
    b=sc.nextInt();
for(i=0;i<n;i++)
{
    if(a[i]==b)
    {


    }
    else{
    System.out.print(a[i]+ " " );
    }
     
}

        
    
 
    }
    
}
 