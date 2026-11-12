package oops.encapsulation;

public class Main {
    public static void main(String[] args) {
        bank bank = new bank();
        System.out.println(bank.getbalance());
        bank.withdraw(1000);
        System.out.println(bank.getbalance());
        bank.deposit(500);
        System.out.println(bank.getbalance());
        
    }

}
