package sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    void quickSort() {
        int[] q = new int[]{3, 1, 2, 4, 5};
        int[] sorted = new int[]{1, 2, 3, 4, 5};
        new QuickSort().quickSort(q, 0, q.length - 1);
        assert Arrays.equals(q, sorted);
    }
}