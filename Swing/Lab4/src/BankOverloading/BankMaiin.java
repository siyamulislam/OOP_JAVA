
package BankOverloading;


public class BankMaiin {
    public static void main(String[] args) {
        Bank b=new Bank();
        b.balance(1000);
        b.balance(1000, 404);
        System.out.println(b.balance(1000, 123, 100000));
    }
    
}
