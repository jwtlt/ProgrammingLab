package switchPractices;

import java.util.*;

public class Switch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("what is the farthest planet in the solar system:" );
        System.out.println("a)venus" );
        System.out.println("b)pluto" );
        System.out.println("c)neptune" );

        String ans = s.nextLine();
        //your code here
        String result = "";

        switch(ans){
            case "a":   case "c":
                result = ans + " is wrong";
                break;

            case "b":
                result = ans + " is correct";
                break;

            default:
                result = ans + " is not a valid answer";
        }
        System.out.println(result);

    }
}