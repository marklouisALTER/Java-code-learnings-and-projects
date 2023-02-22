
package arraymerge;

import java.util.Scanner;

public class Arraymerge {

    public static void main(String[] args) {
       Scanner froi = new Scanner(System.in);
     int s1, s2, s, a,b,temp;
        int arr1[] = new int[15];
        int arr2[] = new int[15];
        int m[] = new int[30];
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First Array size : ");
        s1 = scan.nextInt(); System.out.print("Enter  First Array: ");

        for(a=0; a<s1; a++)
        {
            arr1[a] = scan.nextInt();
        }
    System.out.print("Enter Second Array Size : ");
    s2 = scan.nextInt();
    System.out.print("Enter Second Array  : ");
        for(a=0; a<s2; a++)
        {
            arr2[a] = scan.nextInt();
        }
     //merging process
        for(a=0; a<s1; a++)
        {
            m[a] = arr1[a];
        }
    s = s1 + s2;
        for(a = 0, b=s1; b<s && a<s2; a++, b++)
        {
            m[b] = arr2[a];
        }
    System.out.println("Array after merging is :");
        for (a=0; a<s; a++)
        {
            System.out.print(m[a] + " " );
            }
        System.out.println(" ");
        //sorting
        System.out.println("Sorting the Array in Descending order:");
         for (a=0; a<s; a++){
              for (b=a+1; b<s; b++){
                if(m[a]<m[b]){
                temp=m[a];
                m[a]=m[b];
                m[b]=temp;
                }
             }
        }
         for(a=0; a<s-1; a++){
         System.out.print(m[a]+ ",");
         }
         System.out.print(m[s-1]);
         System.out.println("");
         
         System.out.println("Sorting the Array in Ascending order:");
         for (a=0; a<s; a++){
              for (b=a+1; b<s; b++){
                if(m[a]>m[b]){
                temp=m[a];
                m[a]=m[b];
                m[b]=temp;
                }
             }
        }
         for(a=0; a<s-1; a++){
         System.out.print(m[a]+ ",");
         }
         System.out.print(m[s-1]);
         
}
}