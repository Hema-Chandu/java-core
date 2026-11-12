class Employee2{
    int id;
    String name ;
    static String comName="TNS";   
}

class Bank{
    int bal = 2000;
    static int empId=2;
    void showBal(){
        System.out.println("balance = "+bal);
    }
    static void showId(){
        System.out.println("ID = "+empId);
    }
}
public class nonstaticexample {
    public static void main(String[] args) {
        Bank bank=new Bank();
        bank.showBal();
        bank.showId();

        Bank bank2=new Bank();
        bank2.bal=4000;
        bank2.empId=4;

        bank2.showBal();
        bank2.showId();

        Bank bank3=new Bank();
        bank3.bal=3000;
        bank3.empId=3;
        bank3.showBal();
        bank3.showId();

        Bank bank4=new Bank();
        bank4.showBal();
        bank4.showId();

        Employee2 employee=new Employee2();
        System.out.println(employee.id); // 
        System.out.println(employee.name);
        System.out.println(employee.comName);
        
    }

}
