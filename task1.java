package samplee;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Samplee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int a=10,count=0;
         int arr[]=new int[a];
        int l;
        Scanner sc=new Scanner(System.in);
       
         System.out.println("enter the digits");
        for(int i=0;i<=5;i++)
        {
        arr[i]=sc.nextInt();
        count++;
        }
       
        System.out.println("no of digits in array is "+count);
        
        }
}
        
        
        
        
        
        
        
        
        
        
        