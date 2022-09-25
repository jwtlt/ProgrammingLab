package forLoops;

import java.util.Scanner;

public class ShoppingList {public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String shoppingListReport = "";
    String item = "";
    String countinue = "";
    double totalPrice = 0;


    for (int i = 1; i <= 10; i++) {

        System.out.println("Enter Item" + i + " and its price:");
        item = scan.next();
        double price = scan.nextDouble();

        shoppingListReport += "Item" + i + ": " + item + " Price: " + price + ", ";  //shoppingListReport.length()-2 (", ")
        totalPrice += price;

        System.out.println("Add one more item?");
        countinue = scan.next();

        if (countinue.equalsIgnoreCase("no")) {
            shoppingListReport = shoppingListReport.substring(0,shoppingListReport.length()-2);
            i=11;

        }
    }

    System.out.println(shoppingListReport + "\nTotal price: " + totalPrice);

}
}
