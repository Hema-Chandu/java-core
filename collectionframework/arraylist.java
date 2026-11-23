package collectionframework;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> s= new ArrayList<String>();
        s.add("Hema");
        s.add("Chandu");
        s.add("Kiran");
        s.add("harsha");
        s.add("Arun");
        System.out.println("students: "+s);
        // get() - access element
        System.out.println(s.get(1));
        // set()- update
        s.set(3,"Rohan");
        System.out.println("After updating"+s);
        //remove
        s.remove("Chandu");
        System.out.println(s);
        // size()
        System.out.println(s.size());


        
    }

}
