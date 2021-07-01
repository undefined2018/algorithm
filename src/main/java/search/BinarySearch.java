package search;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BinarySearch {

    public int binarySearch(int[] q,
                            Function<Integer, Boolean> isBlue,
                            BiFunction<Integer, Integer, Integer> resultSupply) {
        int l = -1, r = q.length;
        while (l + 1 != r) {
            int m = (l + r) / 2;
            if (isBlue.apply(q[m])) l = m;
            else r = m;
        }
        return resultSupply.apply(l, r);
    }

}
