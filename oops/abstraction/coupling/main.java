package oops.abstraction.coupling;

class Vehicle{
    void run(){
        System.out.println("Runs on petrol");
    }
}
class car{
    void run(){
        Vehicle vh = new Vehicle();
        vh.run();
    }
}
public class main {
    public static void main(String[] args) {
        car car = new car();
        car.run();
    }
    
}
