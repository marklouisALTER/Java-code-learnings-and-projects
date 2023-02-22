
package arraysindex;

import java.util.Scanner;

public class ArraysIndex {

    public static void main(String[] args) {

        
        int n, x;
Scanner mark = new Scanner(System.in);
    System.out.print("Enter no. of elements:");
n = mark.nextInt();
int a [] = new int[n];
    System.out.println("Enter all the Elements:");
for(int i = 0; i < n; i++)
{
a[i] = mark.nextInt();
}
    System.out.print("Enter the index you want to delete:");
x = mark.nextInt();
    if(x>n+1)
    {
        System.out.print("Not allowed to delete;");
    }
    else{
    for(int z = x-1;z < n-1; z++)
    {
        a[z]=a[z+1];
    } 
    

    for(int z=0;z<n-1;z++)
    {
       
        System.out.print(a[z]);
    }
    }
}
}

    
    
    
   