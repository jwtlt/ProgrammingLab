package method;

import java.util.Scanner;

public class Method_NumberIsPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num){
        //WRITE YOUR CODE HERE
        int temp = num;
        int count = 0;

        while(temp>=10){
            temp = temp/10;
            count++;
        }

        temp = num;
        int reverse = 0;

        while(temp > 0){
            reverse += (temp % 10)*Math.pow(10,count--);
            temp /= 10;
        }
        System.out.println(reverse == num);
    }
}
