package examples;

class cab{
    String drivername;
    String vehiclenumber;
    cab(String name, String number){
        drivername = name;
        vehiclenumber = number;
    }
    void bookcab(String pickup, String destination){
        System.out.println("Pickup "+ pickup);
        System.out.println("Destiation "+ destination);
    }
    void bookcab(String pickup, String destination, int passengers){
        System.out.println("Pickup "+ pickup);
        System.out.println("Destiation "+ destination);
        System.out.println("Number of passengers "+ passengers);
    }
    double calculateFare(){
        return 100;
    }
}
class minicab extends cab{
    minicab(String name, String number){
        super(name, number);
    }
    double calculateFare(){
        return 200;
    }
}
class sedancab extends cab{
    sedancab(String name, String number){
        super(name, number);
    }
    double calculateFare(){
        return 300;
    }
}
class SUVcab extends cab{
    SUVcab(String name, String number){
        super(name, number);
    }
    double calculateFare(){
        return 400;
    }
}
public class example5 {
    public static void main(String[] args){
        minicab m=new minicab("Kiran", "KA02AB1234");
        sedancab s=new sedancab("Tharun", "KA01DC3456");
        SUVcab suv = new SUVcab("Govind", "KA94DF5678");
        m.bookcab("hassan","bangalore");
        s.bookcab("hassan","bangalore",3);
        System.out.println("Mini cab Fare " +m.calculateFare());
        System.out.println("Sedan cab Fare " +s.calculateFare());
        System.out.println("SUV cab Fare " +suv.calculateFare());
    }
}

