
package problem3;
import java.util.Scanner;
public class Problem3 {

    public static void main(String[] args) {
    Scanner mark = new Scanner(System.in);
        int b,r;
 System.out.print("Enter array: ");
        r= mark.nextInt();
        int arr[]= new int[r];
          for(b=0;b<r;b++)
            {
           arr[b]=mark.nextInt();
            }
        for(b=0;b<r;b++)
        {
          System.out.print(arr[b]+" ");
        }
    }
}
