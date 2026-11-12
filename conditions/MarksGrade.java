package conditions;
import java.util.*;
public class MarksGrade {
    public static void main(String[] args) {
        int score=0;
        String grade="A+";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the score");
        score=sc.nextInt();
        if (score>=90){
            grade="A+";
        }
        else if(score>=80 && score<90){
            grade="A";
        
        }
        else if(score>=70 && score<80){
            grade="B+";
        }
        else if(score>=35 && score<70){
            grade="B";
        }
        else{
            System.out.println("fail");

        }
        System.out.println(grade);


    }
}

