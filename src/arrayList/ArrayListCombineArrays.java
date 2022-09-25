package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListCombineArrays {
    public static ArrayList<String> combineRs(String[] r1, String[] r2){

        // your code here
        ArrayList<String> combineRs = new ArrayList<>();
        for(String each : r1){
            combineRs.add(each);
        }
        for(String each : r2){
            combineRs.add(each);
        }

        return combineRs;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];
        String [] strs2 = new String[in.nextInt()];
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }
        for(int i=0; i < strs2.length; i++) {
            strs2[i] = in.next();
        }

        System.out.println(combineRs(strs,strs2));

    }
}
