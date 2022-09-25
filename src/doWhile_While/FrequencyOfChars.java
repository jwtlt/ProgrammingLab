package doWhile_While;

import java.util.Scanner;

public class FrequencyOfChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = 0;
        int i = 0;

        String text = scan.nextLine();

        System.out.println("Choose a Char:");
        char ch = scan.next().charAt(0);

        while(i <= text.length()-1){
            if(ch == text.charAt(i)){
                count += 1;
            }
            i++;
        }

        System.out.println(count);

    }
}
