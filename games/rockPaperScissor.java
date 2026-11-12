package games;

import java.util.Scanner;
import java.util.Random;


public class rockPaperScissor {
    public static void main(String[] args) {
        System.out.println("Please enter a option below ");
        System.out.println("0. for rock\n1. for paper\n2. for scissor");
        Scanner sc= new Scanner(System.in);
        int userInput = sc.nextInt();

        Random random = new Random();
        int sysInput = random.nextInt(3);
        if(userInput == sysInput){
            System.out.println("Draw");
        }
        else if((userInput==0 && sysInput ==2) || (userInput == 2 && sysInput==1) || (userInput == 1 && sysInput==0)){
            System.out.println("You win");
        }
        else{
            System.out.println("You will loose");
        }

        System.out.println("User Input :"+userInput );
        System.out.println("System Input :"+sysInput );


    }

}
