package method;

import java.util.Scanner;

public class Method_Anagram {

    public static boolean isAnagram(String word1, String word2) {

        boolean b = true;
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();


        if(word1.length() == word2.length()){
            for(int i=0 ; i<word1.length() ; i++){
                char ch = word1.charAt(i);
                for(int j=0 ; j<word1.length() ; j++){
                    if(!word2.contains("" + ch))
                        b = false;
                }

            }
        }


        else
            b = false;

        return b;



    }

    // Do not touch below


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isAnagram(in.nextLine(), in.nextLine()));
    }
}
