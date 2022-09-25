package doWhile_While;

import java.util.Scanner;

public class WhileWordCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Sentence:");
        String text = scan.nextLine();

        System.out.println("Enter a Word:");
        String word = scan.nextLine();

        int i = 0 ;
        int count = 0;

        while(i <= text.length()-4){
            if(word.equals(text.substring(i,i+4))){
                count += 1;
            }
            i++;
        }
        System.out.println(count);
    }
}
