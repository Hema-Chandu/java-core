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
public class ex1 {
    public static void main(String[] args) {
        Developer d=new Developer();
        d.displayemployeedetails();
        d.calculatesalary();
        d.displaydeveloperdetails();
    }
}
