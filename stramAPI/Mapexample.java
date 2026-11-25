package stramAPI;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class Mapexample {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,5,3,4,5,6);
        Stream<Integer> square = list.stream();
        // anno
        Function<Integer,Integer> function =new Function<>() {
            public Integer apply(Integer a){
                return a*a;

            }
        };
        // Lambda
        Function<Integer,Integer> function2 =a-> a*a;
        //square.map(a-> a+2).forEach(n->System.out.println(n));
        square.map(function2).forEach(n->System.out.println(n));










    }

}
