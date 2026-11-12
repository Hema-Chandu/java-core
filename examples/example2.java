package examples;

class MovieTicket{
    String moviename;
    double ticketprice;

    MovieTicket(String name, double price){
        moviename = name;
        ticketprice = price;
    }

    void bookticket(String type){
        System.out.println("Booking 1 ticket");
    }
    void bookticket(int n, String type){
        System.out.println("Booking " + n+ " " +type+" ticket");
    }
    double calculateprice(){
        return ticketprice;
    }
}
class Regularticket extends MovieTicket{
    Regularticket(String name, double price){
        super(name,price);
    }
    double calculateprice(){
        return ticketprice;
    }
}
class Premiumticket extends MovieTicket{
    Premiumticket(String name, double price){
        super(name,price);
    }
    double calculateprice(){
        return ticketprice+100;
    }
}
public class example2 {
    public static void main(String [] args){
        Regularticket r= new Regularticket("Avatar", 200);
        Premiumticket p= new Premiumticket("Avatar", 200);
        r.bookticket("Regular");
        p.bookticket("Premium");
        p.bookticket(3,"Regular");
        System.out.println(r.calculateprice());
        System.out.println(p.calculateprice());

    }

    
}
