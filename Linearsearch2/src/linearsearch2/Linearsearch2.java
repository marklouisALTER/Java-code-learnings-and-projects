
package linearsearch2;

import java.util.Scanner;

public class Linearsearch2 {

    public static void main(String[] args) {
 
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n,temp,c,i,count;
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
        temp = a[i];
        break;
    }
}
    if(a[i]==c)
    {
     
        System.out.print("Element found");
    }
   
   
        else{
        System.out.print("not found");
       
    
}  
    
    System.out.print("element" +c +"found"+count+"times");
  
    }
    
}
