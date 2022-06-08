
package LAB1;

import java.util.Scanner;

public class LOOP {
    
    public static void main(String[] args) {
        int i,n,sum=0;
        Scanner in=new Scanner(System.in);
        
      System.out.println("Enter Num");
      n=in.nextInt();
      for(i=0;i<n;i++){
          if(i%2!=0){
          System.out.println(i);
          sum=sum+i;
          }
      }
        System.out.println("Total Sum="+sum); 
    }  
}
