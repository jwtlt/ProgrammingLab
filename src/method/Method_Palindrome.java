package method;

import java.util.Scanner;

public class Method_Palindrome {
    public static boolean isPalindrome(String check) {

        // your code here
        boolean b = false;
        check = check.replace(" ","");
        String temp = "";

        for(int i=check.length()-1 ; i>=0 ; i--){
            temp += "" + check.charAt(i);
        }
        temp = temp.replace(" ","");

        if(temp.equalsIgnoreCase(check))
            b = true;

        return b;

    }
    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isPalindrome(in.nextLine()));
    }
}
