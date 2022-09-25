package array;

import java.util.Scanner;

public class ArrayReversed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "";
        //TODO: start your code here
        String[] str = sentence.split(" ");
        String[] temp = new String[str.length];


        for(int i=0 ; i<str.length ; i++){
            temp[i] = str[str.length-1-i];
        }

        for(String each : temp){
            reversed += each + " ";
        }



        //End your code here. do not modify below statement
        System.out.println(reversed.substring(0,reversed.length()-1));

    }
}
