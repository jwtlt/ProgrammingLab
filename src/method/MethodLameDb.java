package method;

import java.util.Arrays;
import java.util.Scanner;

public class MethodLameDb {
    public static String lameDb(String db, String op, String id, String data) {
        String[] arr = db.split("#");
        String result="";
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].substring(1);
        }
        int num=Integer.valueOf(id);
        if (op.equals("add")) {
            arr = Arrays.copyOfRange(arr,0,arr.length+1);
            if(num<arr.length){
                for (int i = arr.length-1; i >num-1; i--) {
                    arr[i]=arr[i-1];
                }
            }
            arr[num-1]=data;
        }
        if (op.equals("edit")) {
            arr[num-1]=data;
        }
        if (op.equals("delete")) {
            arr[num-1]=null;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==null)
                continue;
            result+=(i+1)+arr[i]+"#";
        }
        return result.substring(0,result.length()-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(lameDb(in.next(), in.next(), in.next(), in.next()));
    }
}
