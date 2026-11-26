package stramAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Example2 {
    public static void main(String[] args){
        int size=1000;
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for(int i=1;i<size;i++){
            list.add(random.nextInt(100));
        }
        // System.out.println(list);
        long startStream = System.currentTimeMillis();
        int sum = list.stream().filter(n->n%2==0).
        map(n->{
            try{
                Thread.sleep(10);
            }catch(Exception e){

            }
            return n*2;
        }).mapToInt(n->n).sum();
        System.out.println("Normal Stream"+sum);
        long endStream = System.currentTimeMillis();
        System.out.println("Time taken = "+ (endStream-startStream));


        long startPara = System.currentTimeMillis();
        int sum2 = list.parallelStream().filter(n->n%2==0).
        map(n->{
            try{
                Thread.sleep(10);
            }catch(Exception e){

            }
            return n*2;
        }).mapToInt(n->n).sum();
        System.out.println("Parallel Stream"+sum2);
        long endPara = System.currentTimeMillis();
        System.out.println("Time taken = "+ (endPara-startPara));


    }

}
