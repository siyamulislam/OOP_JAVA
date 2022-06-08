
package Test.SimpleC;


public class Fibonanci {
    public static void main(String[] args) {
        long  i,N=100, f0=0,f1=1,f2;
        for(i=0;i<N;i++){
        
             System.out.println(f0);
             
              f2=f0+f1;
              f0=f1;
              f1=f2;
        }
        
    }
   
    }
