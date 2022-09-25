package method;

import java.util.Scanner;

public class Method_UniqueWord {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for (int i = 0; i < size; i++) {
            words[i] = scan.next();
        }
        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words) {
        //WRITE YOUR CODE HERE
        int count;
        for (String each : words) {
            count = 0;
            for (String eac : words) {
                if (each.equals(eac)) {
                    count += 1;
                }
            }
            if (count == 1) {
                System.out.println(each);
            }
        }


    }
}
