package inputOutput;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("Age is "+ age);

        System.out.println("Enter two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("The sum of two number is : " + (num1+num2));
    }
}
