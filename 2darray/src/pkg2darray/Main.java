package pkg2darray;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
    Scanner mark= new Scanner(System.in);
        
    int a,row,b,col;
    
    System.out.print("Enter number of row: ");
    row=mark.nextInt();
    
    System.out.print("Enter number of column: ");
    col = mark.nextInt();

    
    int arr[][] =new int[row][col];
    

    System.out.print("Enter all elements");
    
    for(a=0;a<row;a++)
        {
            for(b=0;b<col;b++)
                {
                    arr[a][b]=mark.nextInt();
        }
        }
    
    
    for(a =0; a<row; a++)
        {
            for(b=0; b<col; b++)
                {
                    System.out.println("Element ["+a+"]" + "["+b+"] = " + arr[a][b]);
        }
        }

 
    }
    
    
}
