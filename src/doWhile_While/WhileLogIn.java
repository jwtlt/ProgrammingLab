package doWhile_While;

import java.util.Scanner;

public class WhileLogIn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username:");
        String username = scan.nextLine();

        System.out.println("Enter your password:");
        String password = scan.nextLine();

        if(username.equals("Cydeo") && password.equals("Cydeo123")) {
            System.out.println("Logged In");
        }

        while (!(username.equals("Cydeo") && password.equals("Cydeo123"))){

            for(int i=3 ; i>=1 ; i--) {
                System.out.println("You have " + i + " attempts\nRe-enter your username and password");
                username = scan.nextLine();
                password = scan.nextLine();

                if(username.equals("Cydeo") && password.equals("Cydeo123")){
                    System.out.println("Logged In");
                    break;
                }

                else if(i==1){
                    System.out.println("Your account is locked!");
                }
            }
            break;
        }
    }
}
