package constructorexamples;

class Employee{
    int id=1;
    String name="yashaswini";


    Employee(){
        System.out.println("hello constructor");
    }

    Employee(int id,String name){
        this.name=name;
        System.out.println("hi constructor");
    }
}
public class Example1 {
    public static void main(String[] args) {
        Employee ref1=new Employee();
        System.out.println(ref1.name);

        Employee ref2=new Employee(12,"xyz");
        System.out.println(ref2.name);

        Employee ref3=new Employee();
        System.out.println(ref3.name);


        
    }

}