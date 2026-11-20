package threads.BankSystem;

public class Main {
    public static void main(String[] args){
        Bank bank=new Bank();
        PhonePay pay=new PhonePay(bank,"withdraw",500);
        
        ATM atm=new ATM(bank,"withdraw",1000);
        PhonePay pay2 = new PhonePay(bank, "deposite", 5000);
        atm.start();
        pay.start();
        pay2.start();
    }
}
