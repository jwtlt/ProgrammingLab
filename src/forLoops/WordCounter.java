package forLoops;

import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int countOfCats = 0;
        int countOfDogs = 0;

        String word = scan.next();
        String str1 = "cat";
        String str2 = "dog";

        for(int i=0 ; i<=word.length()-3 ; i++){      // word.length()-3 because of word.substring(i,i+3)(we can't get any words after the last letter)

            if(str1.equals(word.substring(i,i+3))){
                countOfCats += 1;
            }
            else if(str2.equals(word.substring(i,i+3))){
                countOfDogs +=1;
            }

        }

        System.out.println("countOfCats = " + countOfCats);
        System.out.println("countOfDogs = " + countOfDogs);

        if(countOfCats == countOfDogs){
            System.out.println("true");
        }
        else{
            System.out.println("false");

        }

    }
}
