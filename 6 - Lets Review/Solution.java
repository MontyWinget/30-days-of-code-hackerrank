import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for(int n = 1; n <= T; n++){
            String str = sc.nextLine();

            char[] chr = str.toCharArray();

            for(int i = 0; i < chr.length; i++){
                if(i % 2 == 0){
                    System.out.print(chr[i]);
                }
            }

            System.out.print(" ");

            for(int j = 0; j < chr.length; j++){
                if(j % 2 != 0){
                    System.out.print(chr[j]);
                }
            }
        System.out.println();
        }
        sc.close();
    }
}
