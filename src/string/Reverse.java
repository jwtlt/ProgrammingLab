package string;

public class Reverse {

    public static void main(String[] args) {

        String str = "I love programming";
        String reverse = "";

        for (int i=str.length()-1; i>=0; i--){
            reverse += str.charAt(i);
        }

        System.out.println("reverse = " + reverse);

    }
}
