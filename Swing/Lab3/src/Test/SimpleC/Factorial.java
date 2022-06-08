
package Test.SimpleC;

import java.util.Scanner;


public class Factorial {
    public static void main(String[] args) {
        int i,N=5,Total=1;
        
        for(i=1;i<=N;i++)
        {
            Total*=i;
        }
        System.out.println(Total);
        
      /*  Scanner x= new Scanner(System.in);
        N=x.nextInt();
        for(i=N;i>0;i++)
        {
        Total=Total*i;
              */
    }
        
        
    }

