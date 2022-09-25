package string;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();

        //your code here
        boolean con = a.contains("alejandro");

        if(con){
            System.out.println("read");
        }
        else{
            System.out.println("don't read");
        }



    }
}
