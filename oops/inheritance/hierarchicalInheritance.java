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
    void calculatesalary(){
        System.out.println("Annual Salary:" + (salary*12));
    }
}

class Developer extends Employee{
    String ProgrammingLanguage = "Java";
    void displaydeveloperdetails(){
        super.displayemployeedetails();
        System.out.println("Programming Language: "+ ProgrammingLanguage);
    }
}
class testing extends Employee{
    String lang = "Java sal";

    @Override
    void displayemployeedetails() {
        super.displayemployeedetails();
        System.out.println("Testing team");
    }

}
public class hierarchicalInheritance {
    public static void main(String[] args) {
        Developer d=new Developer();
        d.calculatesalary();
        d.displaydeveloperdetails();

        testing t=new testing();
        t.displayemployeedetails();
        t.calculatesalary();
        
    }
}
