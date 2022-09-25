package ifElse;

import java.util.*;

public class Ternaries {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your score:");

        int score = scan.nextInt();
        String Success = "";


        if(score > 0 && score < 100){

           Success = (score>=90)? "Excellent"
                   : (score>=80)? "Great"
                   : (score>=70)? "Good"
                   : (score>=60)? "Passed"
                   : "Failed" ;

            System.out.println(Success);

        }
        else

            System.out.println("Invalid Score");

    }
}
