package doWhile_While;

import java.util.Scanner;

public class WhileProposal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Will You Marry Me?");
        String ans = scan.nextLine();

        if(ans.equalsIgnoreCase("yes")){
            System.out.println("Congrats");
        }
        else if(ans.equalsIgnoreCase("no")){
            System.out.println("Goodbye");
        }

        while(!(ans.equalsIgnoreCase("yes") || ans.equalsIgnoreCase("no"))){
            System.out.println("Invalid answer, please re-enter");
            ans = scan.nextLine();

            if(ans.equalsIgnoreCase("yes")){
                System.out.println("Congrats");
            }
            else if(ans.equalsIgnoreCase("no")){
                System.out.println("Goodbye");
            }
        }
    }
}
