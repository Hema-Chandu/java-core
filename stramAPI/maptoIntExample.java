package stramAPI;
import java.util.*;


public class maptoIntExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,4,5,35,24,54);
        int sum = list.stream().map(n->n*2).reduce(0,(a,b)->a+b);
        System.out.println(sum);

        int sum2 = list.stream().map(n->n*2).mapToInt(n->n).sum();
        System.out.println(sum2);

        double sum3 = list.stream().map(n->n*2).mapToDouble(n->n).sum();
        System.out.println(sum3);


    }

}
