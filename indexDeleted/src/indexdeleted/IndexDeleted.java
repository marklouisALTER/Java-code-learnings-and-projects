
package indexdeleted;
import java.util.Scanner;
public class IndexDeleted {

    public static void main(String[] args) {

        Scanner rence= new Scanner(System.in);
        int i,n,pos;
        System.out.println("Enter number of elements :");
        n=rence.nextInt();
        int[] a = new int [n];
        System.out.println("Enter all the elements :");
        
        for (i=0; i<n; i++)
        {
            a[i] = rence.nextInt();
        }
        System.out.println("Enter position of the index to be deleted");
        pos=rence.nextInt();
        
        for(i=pos; i<n-1; i++)
        {
            a[i]=a[i+1];
        }
        n=n-1;
      
        System.out.println("Deleted Output : ");
        
        for (i=0; i<n; i++)
        {
           
            System.out.println("a["+i+"] = "+a[i] );
        }
        else
{
    System.out.println("Element not found");
}
        }
   }
    


    
    
