package forLoops;

import java.util.Scanner;

public class WriteBackward {
    public static void main(String[] args) {

        Scanner scan =  new Scanner(System.in);

        String str = "";

        String text = scan.nextLine();

        for(int i=text.length()-1 ; i>=0 ; i--){

            str += text.charAt(i);

        }

        System.out.println(str);

    }
}
