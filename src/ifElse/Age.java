package ifElse;

import java.util.Scanner;

public class Age {

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

        System.out.print("Please enter your age here:");

    int age = scan.nextInt();


        if (age > 0 && age < 3) {
        System.out.println("infant");
    } else if (age > 2 && age < 6) {
        System.out.println("Toddler");
    } else if (age > 5 && age < 10) {
        System.out.println("Kid");
    } else if (age > 9 && age < 13) {
        System.out.println("Pre-Teen");
    } else if (age > 13 && age < 18) {
        System.out.println("Teenager");
    } else if (age > 17 && age < 21) {
        System.out.println("Young Adult");
    } else if (age > 20 && age < 40) {
        System.out.println("Adult");
    } else if (age > 39 && age < 50) {
        System.out.println("Young Middle-Aged Adult");
    } else if (age > 49 && age < 55) {
        System.out.println("Middle-Aged Adult");
    } else if (age > 54 && age < 65) {
        System.out.println("Very Young Senior Citizen");
    } else if (age > 64 && age < 75) {
        System.out.println("Young Senior Citizen");
    } else if (age > 74 && age < 85) {
        System.out.println("Senior Citizen");
    } else if (age > 84) {
        System.out.println("Old Senior Citizen");
    } else {
            System.out.println("INVALID INPUT. TRY AGAIN");
        }
    }
}
