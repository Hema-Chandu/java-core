package games;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args){
        System.out.println("Random number game");
        System.out.println("Enter the number between 0 and 100 ");
        Random random = new Random();
        int sysInput = random.nextInt(11);
        int attempts=0;
        boolean isGameOver=false;
        Scanner sc = new Scanner(System.in);
        while(!isGameOver){
            System.out.println("Choose a number between 0 and 10");
            int userInput = sc.nextInt();
            if(sysInput==userInput){
                System.out.println("Game over");
                attempts++;
                isGameOver = true;
                System.out.println("User input="+userInput);
                System.out.println("System input="+sysInput);
                System.out.println("Attempts "+attempts);
            }
            else if(userInput>10 || userInput<0){
                System.out.println("Please enter a number between a and 10");
                attempts++;
                userInput = sc.nextInt();
            }
            else{
                attempts++;
                System.out.println("User number is not matched with the system input");
                System.out.println("User input="+userInput);
                System.out.println("System input="+sysInput);
            }
        }


    }

}
