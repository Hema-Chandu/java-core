package stramAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class Optionalclass {
    public static void main(String[] args) {
        List<String> names=Arrays.asList("raju","sanju","john","Karthik","Amit");
        Optional<String> order_name = names.stream().filter(str->str.contains("Amith")).findFirst();
        System.out.println(order_name.orElse("No value present"));
        String name = names.stream().filter(str->str.contains("Amit")).findFirst().orElse("Name not found");
        System.out.println(name);
    }
}
