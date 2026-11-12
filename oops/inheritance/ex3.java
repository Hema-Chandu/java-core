package oops.inheritance;
class animal{
    void sound(){
        System.out.println("Animal will make some sort of noise");
    }
}
class dog extends  animal{
    void sound(){
        System.out.println("bow bow");
    }
}
class cat extends animal{
    void sound(){
        System.out.println("meow meow");
    }
}
class cow extends animal{
    void sound(){
        System.out.println("bo0");
    }
}
class Monkey{
    void sound(){
        System.out.println("Some sound");
    }
}
public class ex3 {
    public static void sounds(animal a){
        a.sound();
    }
    public static void main(String[] args) {
        sounds(new dog());
        sounds(new cat());
        sounds(new cow());
        
    }

}
