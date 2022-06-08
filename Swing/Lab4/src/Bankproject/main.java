
package Bankproject;

import java.util.Scanner;

public class main {
    int CurrentBalance=0;
    int Balance; 
    public static void main(String[] args) {
        
        main m= new main();
//        m.Deposite();
//        m.Withdraw();
//        m.Display();
        System.out.println("Welcome to Our Bank");
        System.out.println("1.deposite");
        System.out.println("2.withdrow");
        System.out.println("3.Display\n4.Exit");
         while (true)
    {
        
        Scanner dt=new Scanner(System.in);
         int key;
        key=dt.nextInt();

        
        switch(key)
        {
            case 1:
                m.Deposite();
                break;
            case 2:
                m.Withdraw();
                break;
            case 3:
                m.Display();
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("Worng!!");
        }
    }
        
       
    }
    

   public void Deposite(){
   
    System.out.println("Enter Balance: ");
    Scanner d=new Scanner(System.in);
     Balance=d.nextInt();
    CurrentBalance=CurrentBalance+Balance;
    System.out.println("Succesfully Balance Deposited");
}
   
   public void Withdraw() {
    System.out.println("Enter Balance: ");
    Scanner d=new Scanner(System.in);
   Balance=d.nextInt();
    CurrentBalance=CurrentBalance-Balance;
    System.out.println("Succesfully Balance Withdrow");
    }
   public void Display()
    {
        System.out.println("Your Current balance= "+CurrentBalance);
    }
   
}
