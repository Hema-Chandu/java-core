package oops.abstraction.abstractkeyword;

abstract class Employee{
    void disp(){
        System.out.println("Show details");
    }
    abstract void show();
}
class a extends Employee{
    void show(){
        System.out.println("Display details");
    }
}
public class main {
    public static void main(String[] args) {
        Employee emp = new a();
        emp.disp();
        emp.show();
    }


}
