package exceptionhandling;

public class throwandthrowskeyword {
    public static void checkeven(int num){
        if(num%2==0){
            System.out.println("Even number");
        }
        else{
            throw new ArithmeticException("Not even number");
        }

    }
    public static void main(String[]args){
        System.out.println("hello");
        try{
            checkeven(5);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
