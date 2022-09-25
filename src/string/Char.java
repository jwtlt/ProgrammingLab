package string;

import java.util.Scanner;

public class Char {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //YOUR CODE HERE
        int word1Length = word1.length();
        int word2Length = word2.length();

        if(word1Length == 3 && word2Length == 3){
            char l1 = word1.charAt(0);
            char l2 = word2.charAt(0);
            char l3 = word1.charAt(1);
            char l4 = word2.charAt(1);
            char l5 = word1.charAt(2);
            char l6 = word2.charAt(2);
            String str = l1 + "" + l2 + "" + l3 + "" + l4 + "" + l5 + "" + l6;

            System.out.println(str);

        }
        else{
            System.out.println("cannot merge");
        }

        scan.close();

    }
}
