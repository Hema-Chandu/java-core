// class Calculator{
//     public static void add(int a,int b){
//         System.out.println("sum of ="+ a+b);
//     }
//     public static void add(int a,int b, int c){
//         System.out.println("sum of ="+ a+b+c);
//     }
//     public static void add(int a,float b){
//         System.out.println("sum of ="+ a+b);
//     }

// }

class Mark_Calculator{
    public static void add(int sub1){
        System.out.println("Marks of one subject is " + sub1);
    }
    public static void add(int sub1, int sub2){
        System.out.println("Marks of two subject is " + (sub1+sub2));
    }
    public static void add(int sub1, int sub2, int sub3){
        System.out.println("Marks of three subject is " + (sub1+sub2+sub3));
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Mark_Calculator.add(23);
        Mark_Calculator.add(23, 45);
        Mark_Calculator.add(23, 45, 67);
    }
}