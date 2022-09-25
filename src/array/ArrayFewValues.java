package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFewValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = {scan.next(),scan.next(),scan.next(),scan.next(),scan.next()};
        System.out.println(Arrays.toString(getWithE(arr)));

    }



    public static String[] getWithE(String[] arr) {

        //TODO : YOUR CODE GOES HERE ----------------------
int count = 0;
int i = 0;
        for(String each : arr){
            if(each.contains("e"))
                count += 1;
        }

        String[] fewValues = new String[count];
        for (String each : arr) {
            if(each.contains("e"))
                fewValues[i++] = each;

        }




        //YOUR CODE ENDS HERE -----------------------

        return fewValues;
    }
}
