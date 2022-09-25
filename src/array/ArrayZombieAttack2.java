package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayZombieAttack2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO. Write you code below this line.
        int[] arr = {0,0,0,0,0,0,0,0};
        int j = 0;

        System.out.println("Day " + j++ + " " + Arrays.toString(inhabitants));

        while(true){

            int[] temp = Arrays.copyOf(inhabitants,8);  /* we check temp's elements and we change inhabitant's elements.
            this way we have the same temp elements and that's wrong.so we need to recreate temp array every single step. */


            if(!(temp[0] == 0) && temp[1] == 0){
                inhabitants[0] /= 2;
            }

            for(int i=1 ; i<7 ; i++){

                if(temp[i-1] == 0 || temp[i+1] == 0){
                    inhabitants[i] /=2;
                }
            }

            if(!(temp[7] == 0) && temp[6] == 0){
                inhabitants[7] /= 2;
            }


            System.out.println("Day " + j++ + " " + Arrays.toString(inhabitants));

            if(Arrays.equals(arr,inhabitants)){
                System.out.println("---- EXTINCT ----");
                break;
            }
        }


    }
}
