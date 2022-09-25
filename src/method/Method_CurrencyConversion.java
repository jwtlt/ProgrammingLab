package method;

import java.util.Scanner;

public class Method_CurrencyConversion {
    public static double convertC(String[][] money,String[][] convertionRate) {
        // write your code here
        double total = 0.0;

        total += Double.parseDouble(money[0][1]) * Double.parseDouble(convertionRate[0][1]);
        total += Double.parseDouble(money[1][1]) * Double.parseDouble(convertionRate[1][1]);

        return total;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println();

        String[][] test_money ={{"mark","5"},{"shekel","30.5"}};

        String[][] test_convert={{"mark","1"},{"shekel","0.5"}};

        double res = convertC(test_money,test_convert);
        System.out.print(res);

    }


}
