
package Test.SimpleC;

import java.util.Scanner;


public class Pindrome {
    public static void main(String[] args) {
       
        
        int i,rem,num, rev=0;
         Scanner x=new Scanner(System.in);
         System.out.print("Enter value:");
        num=x.nextInt();
        while(num!=0)
        {
            rem=num%10;
            rev = rev*10+rem;
           num=num/10;
        }
        System.out.println("reverse = "+rev);
    }
    
}
