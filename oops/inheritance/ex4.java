package oops.inheritance;

class Employee{
    int employeeId = 123;
    String employeename = "Bhuvi";
    int salary = 10000;

    void displayemployeedetails(){
        System.out.println("Employee ID: "+ employeeId);
        System.out.println("Employee Name: "+ employeename);
        System.out.println("Salary: "+ salary);
    }
    void work(){
        System.out.println("Todo list will be displayed");
    }
}

class Developer extends Employee{
    String ProgrammingLanguage = "Java";
    void work(){
        System.out.println("Developers write code");
    }
}
class testing extends Employee{
    String testingtool = "Java sal";

    void work(){
        System.out.println("Tester test the application");
    }
}
class manager extends Employee{
    int teamsize = 4;

    void work(){
        System.out.println("Manager manages the team");
    }
    
}
public class ex4 {
    public static void works(Employee e){
        e.work();
    }
    public static void main(String[] args) {
        works(new Developer());
        works(new testing());
        works(new manager());
        
    }

}
