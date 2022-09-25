package forLoops;

import java.util.Scanner;

public class NestedFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number:");
        int square = scan.nextInt();

        for(int i=1 ; i<=square ; i++){
            for(int j=1 ; j<=square ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
