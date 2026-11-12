package constructorexamples;

class Person{
    int balance;
    String name;



    Person(int bal,String n){
        this.balance=bal;
        this.name=n;
    }

    Person(){
        balance=1000;
        name="yashaswini";
        
    }

    void display(){
        System.out.println("Name:"+name);
        System.out.println("Balance:"+balance);
    }
}



public class BankAccount {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.display();

        Person p2=new Person();
        p2.display();
        
    }

}
