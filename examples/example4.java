package examples;

class vendingmachine{
    String itemname;
    double price;

    vendingmachine(String name, double price){
        itemname=name;
        this.price = price;
    }
    void purchase(int quantity){
        System.out.println("Total" +(price*quantity));
    }
    void purchase(double amount){
        System.out.println("Payment" + amount);
        if (amount >= price){
            System.out.println("Purchase successfull");
            System.out.println("Change:" +(amount-price));
        }else{
            System.out.println("Insufficient balance");
        }
    }
    void displayItem(){
        System.out.println(itemname + "--Rs" + price );
    }
}
class snackmachine extends vendingmachine{
    snackmachine(String name,double price){
        super(name, price);
    }
    void displayItem(){
        System.out.println("Item" + itemname);
        System.out.println("Price" + price);
    }
}class Drinkmachine extends vendingmachine{
    Drinkmachine(String name,double price){
        super(name, price);
    }
    void displayItem(){
        System.out.println("Item" + itemname);
        System.out.println("Price" + price);
    }
}
public class example4 {
    public static void main(String[] args){
        snackmachine s = new snackmachine("Chips", 20);
        Drinkmachine d = new Drinkmachine("Coke", 40);
        s.displayItem();
        s.purchase(2);
        d.displayItem();
        d.purchase(50.0);

    }
}
