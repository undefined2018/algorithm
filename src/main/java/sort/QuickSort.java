package sort;

/**
 * @author lijie
 * @version 1.0
 * @see QuickSort
 * @since
 */
public class QuickSort {

    void quickSort(int[] q, int l, int r) {
        if (l >= r)
            return;
        int pivot = q[(l + r) / 2], i = l - 1, j = r + 1;
        while (i < j) {
            do i++; while (q[i] < pivot);
            do j--; while (q[j] > pivot);
            if (i < j) {
                int tmp = q[i];
                q[i] = q[j];
                q[j] = tmp;
            }
        }
        quickSort(q, l, j);
        quickSort(q, j + 1, r);
    }

}
