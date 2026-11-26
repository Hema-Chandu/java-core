package stramAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.*;

public class Example1 {
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,8);
        System.out.println(list);
    //     List<Integer> Evennumber = new ArrayList<>();
    //     for(int i=0;i<list.size();i++){
    //         if(list.get(i) % 2==0){
    //             Evennumber.add(list.get(i));
    //         }
    //     }
    //     for(Integer integer:Evennumber){
    //         System.out.println(integer);
    //     }
        Stream<Integer> stream=list.stream();
        // annonymus 
        Predicate<Integer> predicate = new Predicate<Integer>(){
            public boolean test(Integer n){
                if(n%2==0){
                    return true;
                }
                return false;
            }
        };
        // lambda
        Predicate<Integer> predicate2 = (Integer n)->
        {
                if(n%2==0){
                    return true;
                }
                return false;
            };
        // using ternary operator
        Predicate<Integer> predicate3 = (Integer n)-> n%2==0?true:false;
        List<Integer> list2 = stream.filter(predicate3).toList();
        // for(Integer integer:list2){
        //     System.out.println(integer);
        // }
        System.out.println(list2);
    }
}
