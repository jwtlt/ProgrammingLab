package doWhile_While;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double totalPrice = 0;
        int count = 1;


        do {

            System.out.println("Enter Item" + count + " and its price:");
            item = scan.next();
            double price = scan.nextDouble();

            shoppingListReport += "Item" + count + ": " + item + " Price: " + price + ", ";  //shoppingListReport.length()-2 (", ")
            totalPrice += price;

            count += 1;

            System.out.println("Add one more item?");
            countinue = scan.next();

            if (countinue.equalsIgnoreCase("no")) {
                shoppingListReport = shoppingListReport.substring(0, shoppingListReport.length() - 2);
                count = 11;

            }
        }
        while (countinue.equalsIgnoreCase("yes") || count <= 10);

        System.out.println(shoppingListReport + "\nTotal price: " + totalPrice);

    }
}
