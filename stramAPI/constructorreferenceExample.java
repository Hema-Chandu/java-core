package stramAPI;
import java.util.*;

class Employee{
    int id;
    String name;
    Employee(){

    }
    Employee(String name){
        this.name = name;
    }
    public String toString(){
        return "Employee [id="+ id + ", name="+name+"]";
    }

}
public class constructorreferenceExample {
    public static void main(String[] args){
        List<Employee> emp_list=new ArrayList<>();
        List<String> names = Arrays.asList("raju","sanju","john","Karthik","Amit");
        for(String name:names){
            emp_list.add(new Employee(name));
        }
        System.out.println(emp_list);

        // using map function
        List<Employee> emp_list2=new ArrayList<>();
        System.out.println("Try with stream()");
        emp_list2 = names.stream().map(name->new Employee(name)).toList();
        System.out.println(emp_list2);

        // using constructor reference
        List<Employee> emp_list3=new ArrayList<>();
        System.out.println("Try with Constructor reference");
        emp_list3 = names.stream().map(Employee::new).toList();
        System.out.println(emp_list3);
    }

}
