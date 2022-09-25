package forLoops;

import java.util.Scanner;

public class RemovingDuplicates {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        String str = "";

        for(int i=0 ; i<=text.length()-1; i++) {
            if (str.contains(text.substring(i,i+1))) {
                continue;
            }
            else {
                str += text.charAt(i);
            }
        }
        System.out.println(str);
    }
}
