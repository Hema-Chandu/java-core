package oops.encapsulation;

public class bank {
    private int balance = 2000;
    public int getbalance(){
        return balance;
    }
    public void withdraw(int amount){
        System.out.println(amount + " amount has been withdrawed successfully");
        balance=balance-amount;
    }
    public void deposit(int amount){
        System.out.println(amount + " amount has been deposited successfully");
        balance=balance+amount;
    }
}
