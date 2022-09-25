package doWhile_While;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class NestedOddOrEven {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = scan.nextInt();
        scan.nextLine();

        if(num%2 == 0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }

        System.out.println("Would you like to enter another number");
        String ans = scan.nextLine();

        while(ans.equalsIgnoreCase("yes")){

            System.out.println("Enter a number:");
            num = scan.nextInt();
            scan.nextLine();

            if(num%2 == 0){
                System.out.println("Even Number");
            }
            else{
                System.out.println("Odd Number");
            }

            System.out.println("Would you like to enter another number");
            ans = scan.nextLine();

        }
    }
}
