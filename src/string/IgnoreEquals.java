package string;

import java.util.Scanner;

public class IgnoreEquals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE
        System.out.println("Enter full name:");
        String fullName = scan.nextLine();

        if(fullName.equalsIgnoreCase("Max Payne") || fullName.equalsIgnoreCase("Alan Wake")){
            System.out.println("User found!");
        }
        else{
            System.out.println("User not found!");
        }


        System.out.println("-------------------------------------------------------");



        String word = scan.next();

        String ch1 = word.substring(0,1);
        String ch2 = word.substring(word.length()-1);

        if(ch1.equalsIgnoreCase("x") || ch2.equalsIgnoreCase("x")){
            word.replace("x", "");
            System.out.println(word);
        }
        else{
            System.out.println(word);
        }


    }
}
