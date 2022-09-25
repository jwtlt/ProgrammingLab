package doWhile_While;

import java.util.Scanner;

public class DoWhileGuestList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String guestList = ""; //define these variables out of the code bloks
        String answer = "";    //otherwise it doesn't work


        // your code
        // ------------------------------------------
        do{
            System.out.println("Please enter guest name:");
            String name = input.nextLine();

            guestList += name + ", ";

            System.out.println("Do you want to enter new guest name:");
            answer = input.nextLine();

            if(answer.equalsIgnoreCase("no")){
                System.out.println("Guest's list: " + guestList.substring(0,guestList.length()-2));

            }

        }

        while(answer.equalsIgnoreCase("yes"));


    }
}
