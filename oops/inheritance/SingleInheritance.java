package oops.inheritance;

class vehicle{
    void start(){
        System.out.println("Vehicle will start");
    }
    void show(){
        System.out.println("show the details of car");
    }
    void stop(){
        System.out.println("Vehicle will stop");
    }
}
class BMWcar extends vehicle{

    @Override
    void start() {
        super.start();
        System.out.println("Car starts with a music and opened roof");
    }
    
}
    
public class SingleInheritance {
    public static void main(String[] args) {
        BMWcar v= new BMWcar();
        v.start();
        v.show();
        v.stop();
    }
}
