package collectionframework;

import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<Integer>();
        v.add(2);
        v.add(45);
        v.add(46);
        v.add(78);
        v.add(58);
        v.add(98);
        System.out.println(v);
        v.capacity();
        System.out.println(v);
        v.contains(2);
        System.out.println(v);
        v.removeFirst();
        System.out.println(v);
        for(int h:v){
            System.out.println(h);
        }
        v.clear();
        System.out.println(v);

    }

}
