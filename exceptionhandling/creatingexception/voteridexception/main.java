package exceptionhandling.creatingexception.voteridexception;

public class main {
    public static void main(String[] args) {
        Person p=new Person(19, "xyz");
        p.disp();
        try {
            p.Checkeli(p.age);
        } 
        catch (VoterIDException e) {
            System.out.println(e.getMessage());
        }
        
    }

}
