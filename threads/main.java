package threads;



class A{
    void disp(){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
    }
}

public class main {
    void show(){
        System.out.println(Thread.currentThread().getName());
    }


    public static void main(String[] args){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getId());
        A a=new A();
        a.disp();
        main main = new main();
        main.show();
    }

}
