package array;

import java.util.Arrays;

public class ChessBoard {
    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];
        //WRITE YOUR CODE HERE
        for(int i=0 ; i<=7 ; i++){
            char ch = 'a';
            for(int j=0 ; j<=7 ; j++){
                chessBoard[i][j] = i+1 + "" + ch++;
            }
        }



        //DO NOT CHANGE
        System.out.println(Arrays.deepToString(chessBoard));
    }
}
