package examples;


class smartDevice{
    String devicename;
    smartDevice(String name){
        devicename = name;
    }
    void turnon(){
        System.out.println("Device is ON");
    }
    void control(int setting){
        System.out.println("Setting: "+ setting);
    }
    void control(String setting){
        System.out.println("Modee: "+ setting);
    }
}
class smartlight extends smartDevice{
    smartlight(String name){
        super(name);
    }
    void turnon(){
        System.out.println("Light is ON");
    }
}
class smartfan extends smartDevice{
    smartfan(String name){
        super(name);
    }
    void turnon(){
        System.out.println("Fan is ON");
    }
}
class smartAC extends smartDevice{
    smartAC(String name){
        super(name);
    }
    void turnon(){
        System.out.println("AC is ON");
    }
}
public class example3 {
    public static void main(String []args){
        smartlight l = new smartlight("Hall");
        smartfan f = new smartfan("Hall");
        smartAC a = new smartAC("Living room");
        l.turnon();
        f.turnon();
        a.turnon();
        l.control(80);
        f.control(4);
        a.control("Cool mode");
    }
}
