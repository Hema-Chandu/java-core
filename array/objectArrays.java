package array;

public class objectArrays {

    public static void sum2dArray(){
        int arr[][]={{11,22,33,44},{23,56,78,34}};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum=sum+arr[i][j];
            }
            System.out.println("Sum of array is " + sum);
        }
    }
    public static void sumArray(){
        int arr[]={12,23,456,67,78};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        System.out.println("Sum of array is " + sum);
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,},{4,5,6},{7,8,9},{10,11,12}};
        System.out.println(arr[2][2]);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
            
        }
        sumArray();
        sum2dArray();
    }


}
