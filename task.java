package samplee2;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Samplee2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       
         char ch[]=new char[10];
      Scanner sc=new Scanner(System.in);
        System.out.println("enter the strings");
        
        
        for(int i=0;i<5;i++)
        
            
        {
             ch[i]=sc.next().charAt(0);
           
            if(ch[i]=='0'||ch[i]=='1'||ch[i]=='2'||ch[i]=='3'||ch[i]=='4'||ch[i]=='5'||ch[i]=='6'||ch[i]=='7'||ch[i]=='8'||ch[i]=='9')
          
             {
                  System.out.println("integers");
             }
            else
            {
                 System.out.println("strings");
            }
          
            
        }
        
        
       
    }
    
}