package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class ArrayListRemoveIf_All {
    public static ArrayList<String> removeAll(ArrayList<String> wordList, String targetWord){

        //wordList.removeAll(Arrays.asList(targetWord));
        wordList.removeIf(p -> p.equals(targetWord));

        return wordList;
    }
    
    // Do not touch below


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String target = in.next();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(removeAll(list, target));

    }

}
