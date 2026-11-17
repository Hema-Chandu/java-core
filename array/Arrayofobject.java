package array;

class Employee{
    int id;
    String name;

    Employee(int id, String name){
        this.id =id;
        this.name=name;
    }
    public String toString(){
        return "id "+ id + "\n" + "name "+name;
    }

}
public class Arrayofobject {
    public static void main(String[] args) {
        Employee arr[]={new Employee(1,"abd"), new Employee(2, "xyz")};
        System.out.println(arr[1]);
        System.out.println(arr[1].name);
    }

}
