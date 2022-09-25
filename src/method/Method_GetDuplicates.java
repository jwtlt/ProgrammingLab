package method;

import java.util.Scanner;

public class Method_GetDuplicates {
    public static int getDup(String[] r) {
        int total = 0;
        String str = "";

        for(int j=0 ; j<r.length ; j++){

            int count = 0;

            for(int i=0 ; i<r.length ; i++){
                if(r[j].equals(r[i]) && !str.contains(r[j])){
                    count += 1;
                }
            }
            if(count>1)
                total += count;
            str += r[j];
        }
        return total;


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }

        System.out.println(getDup(strs));

    }
}
