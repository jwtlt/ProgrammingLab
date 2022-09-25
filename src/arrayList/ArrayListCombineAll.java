package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListCombineAll {
    public static ArrayList<Integer> combineAL(ArrayList<Integer> list, ArrayList<Integer> list2) {
        ArrayList<Integer> combine = new ArrayList<>();

        list.forEach((each) -> combine.add(each));
        list2.forEach((each) -> combine.add(each));

        return combine;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int size2 = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }
        for(int i=0; i < size2; i++) {
            list2.add(in.nextInt());
        }

        System.out.println(combineAL(list, list2));

    }
}
