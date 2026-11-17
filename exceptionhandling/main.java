package exceptionhandling;

public class main {
    public static void main(String[] args){
        int arr[]={1,2,3,4};
        try{
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException  e){
            System.out.println("Hello from exception");
        }
        catch(Exception e){
            System.out.println("Handle");
        }
        finally{
            System.out.println("Hello from final block");

        }
    }

}
