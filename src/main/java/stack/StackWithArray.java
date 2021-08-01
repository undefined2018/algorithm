package stack;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class StackWithArray {

    static int N = 100010;
    static int[] stk = new int[N];
    static int tt;

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        int m = Integer.parseInt(in.nextLine());
        while (m-- > 0) {
            String[] s = in.nextLine().split(" ");
            String op = s[0];
            switch (op) {
                case "push":
                    int x = Integer.parseInt(s[1]);
                    stk[++tt] = x;
                    break;
                case "pop":
                    tt--;
                    break;
                case "empty":
                    System.out.println(tt > 0 ? "NO" : "YES");
                    break;
                case "query":
                    System.out.println(stk[tt]);
                    break;
            }
        }
    }
}
