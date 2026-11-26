package stramAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class methodreferenceExample {
    public static void main(String[] args) {
        List<String> names=Arrays.asList("raju","sanju","john","Karthik","Amit");
        // Optional<String> order_name = names.stream().filter(str->str.contains("Amith")).findFirst();
        // System.out.println(order_name.orElse("No value present"));
        
        
        List<String> name = names.stream().map(str->str.toUpperCase()).toList();
        System.out.println(name);
        List<String> name3 = names.stream().map(String::toLowerCase).toList();
        System.out.println(name3);
    }

}
