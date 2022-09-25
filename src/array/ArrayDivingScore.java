package array;

import java.util.*;

public class ArrayDivingScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        float total = 0;
        //WRITE YOUR CODE HERE
        for(int i=0 ; i<8 ; i++){
            System.out.println("Enter score for judge " + ++i + ":");
            score[i] = input.nextFloat();
        }
        System.out.println("Enter difficulty:");
        float difficulty = input.nextFloat();

           float max = score[0];
           float min = score[0];

       for(int j=0 ; j<7 ; j++){
       if(score[j] > max)
        max=score[j];
       if(score[j]<min)
        min = score[j];
       }

        for (float each : score) {
            total += each;
        }

        total -= max + min ;

        total *= 0.6 * difficulty;

        // FINAL OUTPUT
        System.out.printf("Total: %.2f", total);
    }
}
