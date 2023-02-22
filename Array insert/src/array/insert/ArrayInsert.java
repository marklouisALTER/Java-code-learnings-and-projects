
package array.insert;

import java.util.Scanner;

public class ArrayInsert {

    public static void main(String[] args) {   
        int n, x,d = 1,l=0;
Scanner wow = new Scanner(System.in);
    System.out.print("Enter no. of elements:");
n = wow.nextInt();
int a [] = new int[n];
    System.out.println("Enter all the Elements:");
for(int i = 0; i < n; i++)
{
a[i] = wow.nextInt();
}
    System.out.print("Enter the element you want to delete:");
x = wow.nextInt();

    for (int i = 0; i < n; i++)
        {
            if(a[i] == x)
            { 
    
                d = 1;
          break;
            }
        else
    {
  d= 0;
}
}
    if(d == 1)
    {
        for (int i = l+1; i < n; i++)
        {
            a[i-1] = a[i];
        }
        for (int i = 0; i < n-1; i++)
            {
    System.out.print(a[i]+",");
}

}
else
{
    System.out.println("Element not found");
}
}
}

        
    
    

