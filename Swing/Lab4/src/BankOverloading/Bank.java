
package BankOverloading;


public class Bank {
    int amount;
    public int balance (int amount){
        return amount;
        
    }
    public int balance(int amount, int acc){
        return amount+acc;
    }
    public int balance(int amount, int acc,int bc){
        return amount+acc+bc;
    }
}
