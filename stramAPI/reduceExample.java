package stramAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class reduceExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,5);
        Stream<Integer> stream = list.stream();
        // BiFunction<Integer,Integer,Integer> bifunction = new BiFunction<Integer,Integer,Integer>() {
        //     public Integer apply(Integer a, Integer b){
        //         return a+b;
        //     }
        // };
        // BinaryOperator<Integer> operator =new BinaryOperator<Integer>() {
        //         public Integer apply(Integer a, Integer b) {
        //             return a + b;
        //         }
        //     };
        // BinaryOperator<Integer> operator2 = (a,b)-> a+b;  

        // int sums = stream.reduce(0, operator2);
        // System.out.println(sums);

        // int sumss = stream.reduce(0,bifunction,Integer::sum);
        // System.out.println(sumss);
        //int sum = stream.reduce(0,(a,b)-> a+b);
        Consumer<Integer> consumer = new Consumer<Integer>() {
            public void accept(Integer a){
                System.out.println(a);
            }
        };
        list.forEach(consumer);
        Consumer<Integer> consumer1 = a->System.out.println(a);
        list.forEach(consumer1);

        int sum2 = list.stream().filter(n->n%2==0).map(n->n+2).reduce(0,(a,b)->a+b);
        System.out.println(sum2);
    }
}
