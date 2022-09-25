package array;

import java.util.Arrays;
import java.util.Scanner;

public class ZombieAttack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO. Write you code below this line.
        System.out.println("Day 0 " + Arrays.toString(inhabitants));

        int [] copy = {0,0,0,0,0,0,0,0};
        int j=1;

        while(!Arrays.equals(copy,inhabitants)){


            for(int i=0 ; i<8 ; i++){
                inhabitants[i] /= 2;
            }

            System.out.println("Day " + j++ + " " + Arrays.toString(inhabitants));

        }
        System.out.println("---- EXTINCT ----");

    }
}
