package method;

import java.util.Scanner;

public class Method_MergeStrings {
    public static String mergeStrings(String one, String two) {
        String result = "";

        int max = (one.length()>two.length())? one.length() : two.length();

        for(int i=0 ; i<max ; i++){
            if(i<one.length())
                result += "" + one.charAt(i);

            if(i<two.length())
                result += "" + two.charAt(i);
        }
        return result;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(mergeStrings(in.next(), in.next()));
    }
}
