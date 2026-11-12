package staticandnonstatic;

import javax.security.auth.Subject;

class student{
    int id =1;
    String name = "hema";
    int marks = 23;
    String subject = "Computer science";
    static String clgName = "TNS";
    public void showStudentDetails(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(marks);
        System.out.println(subject);
    }
    public static void showClgName(){
        System.out.println(clgName);
    }
}
public class example {
    public static void main(String[] args){
        student student = new student();
        student.showStudentDetails();
        student.showClgName();

        student student2 = new student();
        student2.id = 34;
        student2.name = "Chandu";
        student2.marks = 78;
        student2.subject="English";
        student2.showStudentDetails();
        student2.showClgName();
    }
}
