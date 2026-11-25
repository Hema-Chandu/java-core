package stramAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class reduceExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,535,64,66,6,65);
        Stream<Integer> stream = list.stream();
        BiFunction<Integer,Integer,Integer> bifunction = new BiFunction<Integer,Integer,Integer>() {
            public Integer apply(Integer a, Integer b){
                return a+b;
            }
        };
        BinaryOperator<Integer> operator =new BinaryOperator<Integer>() {
                public Integer apply(Integer a, Integer b) {
                    return a + b;
                }
            };
        BinaryOperator<Integer> operator2 = (a,b)-> a+b;  

        int sums = stream.reduce(0, operator2);
        System.out.println(sums);

        // int sumss = stream.reduce(0,bifunction,Integer::sum);
        // System.out.println(sumss);
        //int sum = stream.reduce(0,(a,b)-> a+b);


    }

}
