package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListBoolean {
    public static ArrayList<Boolean> repeatAll(ArrayList<Boolean> list){
        //list.addAll(list);
        list.addAll(Arrays.asList(list.toArray(new Boolean[0])));
        return list;
    }
    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Boolean> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextBoolean());
        }

        System.out.println(repeatAll(list));

    }

}
