class payment{
    public void phonepe(){
        System.out.println("Paid through phonepe");
    }
    public void paytm(){
        System.out.println("Paid through paytm");
    }
    public void googlepay(){
        System.out.println("Paid through google pay");
    }
}
class payment2 extends payment{
    public void phonepe(){
        System.out.println("Paid amt and the amt is send through phonephe. Thank u for using phonepe");
    }
}

public class overridingmethod {
    public static void main(String[] args) {
        payment2 payment =new payment2();
        payment.phonepe();
        payment.paytm();
    }
}
