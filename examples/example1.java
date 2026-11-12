package examples;
class Parking{
    String vehiclenumber;

    Parking(String vehiclenumber){
        this.vehiclenumber = vehiclenumber;

    }

    void calculateCharges(){
        System.out.println("Parking Charges");
    }
    void calculateCharges(int hours){
        System.out.println("Duration" + hours + "hours");
    }
}
class Carparking extends Parking{
    Carparking(String number){
        super(number);
    }
    void calculateCharges(){
        System.out.println("Car number" + vehiclenumber);
        System.out.println("Car charges: Rs100");
    }
}
class Bikeparking extends Parking{
    Bikeparking(String number){
        super(number);
    }
    void calculateCharges(){
        System.out.println("Bike number" + vehiclenumber);
        System.out.println("Bike charges: Rs50");
    }
}
class Truckparking extends Parking{
    Truckparking(String number){
        super(number);
    }
    void calculateCharges(){
        System.out.println("Truck number" + vehiclenumber);
        System.out.println("Truck charges: Rs200");
    }
}

public class example1 {
    public static void main(String[] args) {
        Carparking c = new Carparking("KA01AB1234");
        Bikeparking b = new Bikeparking("KA02CD4567");
        Truckparking t = new Truckparking("KA01AB3333");

        c.calculateCharges();
        b.calculateCharges();
        t.calculateCharges();
        c.calculateCharges(5);
    }
}
