package exceptionhandling.creatingexception.BankSystem;

public class BankException extends Exception {
    BankException(){

    }
    BankException(String msg){
        super(msg);
    }

}
