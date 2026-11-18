package exceptionhandling.creatingexception.BankSystem;

public class main {
    public static void main(String[] args){
        savingsAccount sv=new savingsAccount();
        sv.getbal();
        try{
            sv.withdraw(2000);
        }
        catch(BankException e){
            System.out.println(e.getMessage());
            sv.getbal();

        }
        sv.getbal();
    }

}
