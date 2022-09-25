package array;

import java.util.Scanner;

public class ArrayLongestWord {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int size = 0;
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();

        }

        //write your code below
        for(String each : words){
            for(int i=0 ; i<5 ; i++){
                if(each.length()>=words[i].length())
                    System.out.println(each);
            }
        }



    }
}
