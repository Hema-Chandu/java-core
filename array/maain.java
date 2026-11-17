package array;

public class maain {
    public static void main(String[] args) {
        // 1.way to craete array
        int arr[]={1,2,3,'a','b'};
        System.out.println(arr[3]);
        // 2nd way to create an array
        int arr2[]=new int[4];
        arr2[0]=2;
        arr2[1]=3;
        arr2[2]=3;
        arr2[3]=4;
        for(int i=0; i<arr2.length;i++){
            System.out.println(arr2[i]);
        }

    }

}
