package practices;

public class HelloWorld {


    public static void main(String[] args) {

        System.out.println("Hello World");

        String text = "i have a great plan.first,we'll go picnic then cinema.";

        String str = text.substring(0, 20);
        if (text.contains(".")) {
            System.out.println(str);
        }
        else if(text.contains("g")) {
            System.out.println(text);
        }

        System.out.println("-----------------------------------------------------");

        String s = "12.234dsfasdgasd";
        System.out.println(Integer.valueOf(s.substring(0,2)) + 2);


    }
}
