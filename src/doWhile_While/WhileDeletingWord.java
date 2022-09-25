package doWhile_While;

import java.util.Scanner;

public class WhileDeletingWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Sentence:");
        String text = scan.nextLine();
        System.out.println("Enter a Word:");
        String word = scan.nextLine();

        while(text.contains(word)){
            text = text.replace(word,"");
        }

        System.out.println(text);
    }
}
