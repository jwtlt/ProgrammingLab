package forLoops;

import java.util.*;

public class ForLoop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        scan.nextLine();  // scanner's memory has an enter interestingly.

        String sentence = scan.nextLine();

            int c1 = 0;
            int c2 = 0;

            String str1 = "java";
            String str2 = "python";

            for (int i = 0; i <= sentence.length()-4; i++) {

                if (str1.equals(sentence.substring(i , i+4))) {
                    c1 += 1;
                }

            }

        for (int j = 0; j <= sentence.length()-6; j++) {

            if(str2.equals(sentence.substring(j , j+6))){
                c2 += 1;

            }
        }

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);

            if (c1 == c2) {
                System.out.println("true");
            } else {
                System.out.println("false");

            }
        }
    }

