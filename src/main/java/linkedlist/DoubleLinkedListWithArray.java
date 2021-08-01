package linkedlist;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class DoubleLinkedListWithArray {

    static int N = 100010;
    static int[] e = new int[N];
    static int[] l = new int[N];
    static int[] r = new int[N];
    static int idx;

    static void init() {
        // e[0] 和 e[1] 作为头节点和尾节点(哨兵)
        r[0] = 1;
        l[1] = 0;
        idx = 2;
    }

    /**
     * 在下标为k的节点的右侧插入val
     */
    static void add(int k, int val) {
        e[idx] = val;
        r[idx] = r[k];
        l[idx] = k;
        r[k] = idx;
        l[r[idx]] = idx;
        idx++;
    }

    /**
     * 删除下标为k的节点
     */
    static void remove(int k) {
        l[r[k]] = l[k];
        r[l[k]] = r[k];
    }

    public static void main(String[] args) {
        init();
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        int m = Integer.parseInt(in.nextLine());
        while (m-- > 0) {
            String[] s = in.nextLine().split(" ");
            switch (s[0]) {
                case "L":
                    add(0, Integer.parseInt(s[1]));
                    break;
                case "R":
                    add(l[1], Integer.parseInt(s[1]));
                    break;
                case "D":
                    remove(Integer.parseInt(s[1]) + 1);
                    break;
                case "IL":
                    add(l[Integer.parseInt(s[1]) + 1], Integer.parseInt(s[2]));
                    break;
                case "IR":
                    add(Integer.parseInt(s[1]) + 1, Integer.parseInt(s[2]));
                    break;
            }
        }
        for (int i = r[0]; i != 1; i = r[i]){
            System.out.print(e[i] + " ");
        }

    }
}
