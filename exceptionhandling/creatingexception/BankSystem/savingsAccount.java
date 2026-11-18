package exceptionhandling.creatingexception.BankSystem;

public class savingsAccount {
    int balance=3000;

    void withdraw(int amount) throws BankException{
        if(amount>balance){
            throw new BankException("Insufficient Balance");
        }
        System.out.println(amount +" debited from your account");
        balance-=amount;
    }
    void deposite(int amount){
        System.out.println(amount + " credited to your account");
        balance+=amount;
    }
    void getbal(){
        System.out.println(balance);
    }

}
