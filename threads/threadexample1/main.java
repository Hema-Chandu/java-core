package threads.threadexample1;
class a extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
class b extends Thread{
    public void run(){
        for(int i=11;i<=20;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
class c extends Thread{
    public void run(){
        for(int i=21;i<=30;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
public class main {
    public static void main(String[]args) throws InterruptedException{
        a a =new a();
        a.setPriority(1);
        
        b b =new b();
        
        c c =new c();
        c.setPriority(10);
        c.start();
        c.join();
        a.start();
        b.start();


    }

}
