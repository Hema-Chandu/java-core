package oops.inheritance;
class user{
    int userid = 123;
    String username = "chandu";
    String email = "hemach@gmail.com";
    void displayuserdetails(){
        System.out.println("UserId: "+userid);
        System.out.println("User Name: "+username);
        System.out.println("Email: "+email);
    }
}
class order extends user{
    int orderId = 1;
    String Productname = "Chips";
    double quantity = 2;
    double price = 50;
    void calculatetotalamt(){
        System.out.println("Total Amount :"+ (quantity*price));
    }
    void displayorderdetails(){
        System.out.println("OrederId: " +orderId);
        System.out.println("Product Name: " +Productname);
        System.out.println("quantity " +quantity);
        System.out.println("Price: " +price);
    }
}
class payment extends order{
    String paymentmode="Online";
    String TransactionId = "1245fvyh67";
    void makepayment(){
        System.out.println("Payment confirmed");
    }
    void displaypaymentdetails(){
        System.out.println("paymentmode: "+ paymentmode);
        System.out.println("Transaction ID: "+ TransactionId);
    }

}
public class ex2 {
    public static void main(String[] args) {
        payment p= new payment();
        p.displayuserdetails();
        p.calculatetotalamt();
        p.displayorderdetails();
        p.makepayment();
        p.displaypaymentdetails();

    }

}
