package collectionframework.set;
import java.util.*;

public class HashsetTreeset {
    public static void main(String[] args) {
        Set<Integer> set= new HashSet<>();
        set.add(23);
        set.add(43);
        set.add(65);
        set.add(65);
        set.add(19);
        set.add(null);
        System.out.println(set);

        Set<Integer> set2= new TreeSet<>();
        set2.add(23);
        set2.add(43);
        set2.add(65);
        set2.add(65);
        set2.add(19);
        System.out.println(set2);


    }

}
