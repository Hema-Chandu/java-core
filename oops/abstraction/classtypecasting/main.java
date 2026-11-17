package oops.abstraction.classtypecasting;

class a {
    void disp(){
        System.out.println("hello");
    }
}
class b extends a  {
    void show(){
        System.out.println("bye");
    }
}
public class main {
    public static void main(String[] args) {
        b b=new b();
        a a = new b();
        a.disp();
        

        a a2 = new b();
        b b2 = (b) a2;
        b2.disp();
        b2.show();
    }

}
