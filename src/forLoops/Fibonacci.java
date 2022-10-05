package forLoops;

public class Fibonacci {

    public static void main(String[] args) {

        int n1=1;
        int n2=1;
        int n=7;
        int fibonacci = 0;
        System.out.print(n1 + ", ");
        System.out.print(n2 + ", ");

        for (int i = 3 ; i<=n ; i++){

            fibonacci = n1+n2;
            System.out.print(fibonacci + ", ");
            n1=n2;
            n2=fibonacci;

        }
        System.out.println();
        System.out.println("fibonacci = " + fibonacci);
    }
}
