package constructorexamples;

public class Student {
    String name;
    int age;

    Student(){
        name="yashaswini";
        age=22;
    }

    Student(String n,int a){
        this.name=n;
        this.age=a;
    }

    void display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }

    public static void main(String[] args) {
        Student s1=new Student();
        s1.display();
        Student s2=new Student();
        s2.display();

    }
}

