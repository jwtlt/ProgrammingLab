package forLoops;

import java.util.*;

public class Factorial {

    public static void main(String[] args) {

        int factorial = 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number please: ");
        int n = scan.nextInt();

        if (n < 0) {
            System.out.println("Invalid Number");
            System.exit(0);
        }

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("factorial = " + factorial);

    }
}
