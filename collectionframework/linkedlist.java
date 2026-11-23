package collectionframework;

import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> p=new LinkedList<Integer>();
        p.add(3);
        p.add(2);
        p.add(1);

        // addFirst
        p.addFirst(9);
        // addlast
        p.addLast(4);
        // p.addLast("Hema") // u will get an compile time error

        p.addLast(23);
        p.addLast(56);
        System.out.println("Numbers "+p);

        System.out.println("After removing first "+ p.removeFirst());
        System.out.println(p);

    }

}
