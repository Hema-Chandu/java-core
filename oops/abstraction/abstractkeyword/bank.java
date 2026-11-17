package oops.abstraction.abstractkeyword;

abstract class Bank {

    abstract void rateOfInterest();

    void display() {
        System.out.println("Welcome to Bank");
    }
}

class SBI extends Bank {

    void rateOfInterest() {
        System.out.println("SBI interest rate is 7%");
    }
}

class HDFC extends Bank {

    void rateOfInterest() {
        System.out.println("HDFC interest rate is 8%");
    }
}

public class bank {

    public static void main(String[] args) {

        Bank b = new SBI();
        b.display();
        b.rateOfInterest();

        Bank b1 = new HDFC();
        b1.rateOfInterest();
    }
}
