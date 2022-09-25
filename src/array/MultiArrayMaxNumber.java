package array;

import java.util.Scanner;

public class MultiArrayMaxNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i=0 ;i<=rows-1;i++)
        {
            for(int j=0 ;j<=cols-1;j++)
            {
                arr[i][j]=inp.nextInt();
            }//end for cols
        }//end for rows

        //TODO write your code below
        int max = arr[0][0];

        for(int[] eachLine : arr){
            for(int each : eachLine)
                if(each>max)
                    max = each;
        }
        System.out.println(max);






    }//end main
    
}
