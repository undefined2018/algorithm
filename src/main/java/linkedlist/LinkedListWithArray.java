package linkedlist;

import java.util.Scanner;
import java.io.BufferedInputStream;


public class LinkedListWithArray {

    static int N = 100010;
    static int head, idx;
    static int[] e = new int[N];
    static int[] ne = new int[N];

    static void init() {
        head = -1;
        idx = 0;
    }

    static void addToHead(int val) {
        e[idx] = val;
        ne[idx] = head;
        head = idx++;
    }

    static void add(int k, int val) {
        e[idx] = val;
        ne[idx] = ne[k];
        ne[k] = idx++;
    }

    static void remove(int k) {
        ne[k] = ne[ne[k]];
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        int m = in.nextInt();
        init();
        while (m-- > 0) {
            String[] s = in.nextLine().split(" ");
            if ("H".equals(s[0])) {
                addToHead(Integer.parseInt(s[1]));
            } else if ("D".equals(s[0])) {
                int k = Integer.parseInt(s[1]);
                if (k == 0) {
                    head = ne[head];
                } else {
                    remove(k - 1);
                }
            } else {
                int k = Integer.parseInt(s[1]);
                int v = Integer.parseInt(s[2]);
                add(k - 1, v);
            }
        }
        for (int i = head;i != -1;i = ne[i]) {
            System.out.print(e[i] + " ");
        }
    }
}