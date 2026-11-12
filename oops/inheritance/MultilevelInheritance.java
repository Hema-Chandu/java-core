package oops.inheritance;

class vehicle{
    void start(){
        System.out.println("Vehicle will start");
    }
    void stop(){
        System.out.println("Vehicle will stop");
    }
}
class Car extends vehicle{
    int doors=4;
    void fuelType(){
        System.out.println("Some power need to start");

    }
}
class EVCar extends Car{
    int batcap=600;

    @Override
    void fuelType() {
        super.fuelType();
        System.out.println("Need battery to start the car");
    }
    

}

public class MultilevelInheritance {
    public static void main(String[] args) {
        EVCar ev = new EVCar();
        ev.fuelType();
        ev.start();
        ev.stop();
        System.out.println(ev.doors);
        System.out.println(ev.batcap);
}
}
