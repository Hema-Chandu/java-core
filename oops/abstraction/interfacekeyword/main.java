package oops.abstraction.interfacekeyword;

interface a{
    public abstract void show();
    public static final int q=23;

}
class b implements a{
    public void show(){
        System.out.println("Hello");

    }
}

public class main {
    public static void main(String[] args){
        a b = new b();
        b.show();
        System.out.println(a.q);
    }
}
