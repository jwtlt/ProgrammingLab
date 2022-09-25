package method;

import java.util.Scanner;

public class Method_LameDB {
    public static String lameDb(String db, String op, String id, String data) {
        String[] arr = db.split("#");
        String result = "";
        int index = Integer.parseInt(id)-1;

        switch (op) {
            case "add":
                String[] str = new String[arr.length+1];
                str[index] = data;

                for (int i = 0 ; i<index ; i++) {
                    str[i] = arr[i].substring(1);
                }

                for (int i = index + 1 ; i<str.length ; i++) {
                    str[i] = arr[i-1].substring(1);
                }

                int j = 1;

                for (String each : str) {
                    result += j + each + "#";
                    j++;
                }
                break;

            case "edit":
                arr[index] = arr[index].replace(arr[index].substring(1),data);
                for (String each : arr) {
                    result += each + "#";
                }
                break;

            case "delete":
                arr[index] = null;
                for(String each : arr) {
                    if(each!=null)result += each + "#";
                }
                break;
        }

        return result.substring(0,result.length()-1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(lameDb(in.next(), in.next(), in.next(), in.next()));
    }
}
