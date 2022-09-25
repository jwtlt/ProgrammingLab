package string;

public class CombinationsOfLetters {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE
        String word = "zyxwv";
        String combinations = "";
        String w = "";
        String t = "";

        for(int i=0 ; i<=word.length()-1 ; i++){
            for(int j=0 ; j<=word.length()-1 ; j++){

                w = word.substring(i,i+1);
                t = word.substring(j,j+1);

                combinations += w + t + "\n";

            }

        }

        System.out.println(combinations.substring(0,combinations.length()-1));

    }
}
