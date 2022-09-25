package ifElse;

import java.util.Objects;
import java.util.Scanner;
// import java.util.* --> works instead both codes above

public class If_Else_VendingMachine {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        int giftCard=100;
        if (Objects.equals(input,"Blanket")){giftCard-=60;}
        else if(Objects.equals(input,"Charger")){giftCard-=25;}
        else if(Objects.equals(input,"Hat")){giftCard-=25;}
        else if(Objects.equals(input,"Headphones")){giftCard-=30;}
        else if(Objects.equals(input,"Laptop")){giftCard-=200;}
        else if(Objects.equals(input,"Pants")){giftCard-=50;}
        else if(Objects.equals(input,"Pillow")){giftCard-=40;}
        else if(Objects.equals(input,"Smartphone")){giftCard-=1000;}
        else if(Objects.equals(input,"Socks")){giftCard-=5;}
        else if(Objects.equals(input,"USB cable")){giftCard-=10;}
        else {giftCard=-1;}


        if (giftCard>=0){System.out.println("Thank you for your purchase! \nYour current balance is: "+giftCard+"$");}
        else if (giftCard<-1){System.out.println("Sorry, not enough funds on your gift card!");}

        else if (giftCard==-1) {System.out.println("Invalid item!");}




    }
}
