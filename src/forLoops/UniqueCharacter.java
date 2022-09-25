package forLoops;

import java.util.Scanner;

public class UniqueCharacter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        String str = "";

        for(int i=0 ; i<=text.length()-1; i++){
            char ch = text.charAt(i);
            if(text.indexOf(ch) == text.lastIndexOf(ch)){
                str += ch;
            }
        }
        System.out.println(str);
    }
}
