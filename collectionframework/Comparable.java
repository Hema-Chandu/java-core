package collectionframework;

import java.util.ArrayList;
import java.util.Collections;

class Student implements java.lang.Comparable<Student>{
    int id;
    String name;
    int marks;

    public Student(int id, String name,int marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    } 
    // public int compareTo(Student o){
    //     return this.marks-o.marks;
    // }
    public int compareTo(Student o){
        return this.name.compareTo(o.name);
    }
    public String toString(){
        return "Student [id=" + id +", name= "+ name +", marks= "+ marks +"]";
    }
}

public class Comparable {
    public static void main(String[] args) {
        ArrayList<Student> s=new ArrayList<Student>();

        s.add(new Student(102, "sushma", 67));
        s.add(new Student(10, "hema", 78));
        s.add(new Student(42, "Harsha", 90));
        s.add(new Student(64, "Channdu", 97));

        Collections.sort(s);
        System.out.println("After sorting by marks:");
        for(Student g:s){
            System.out.println(g);
        }

    }


}
