package search;


import org.junit.jupiter.api.Test;

class BinarySearchTest {

    @Test
    void binarySearch() {
        int[] q = new int[]{1, 2, 3, 5, 5, 5, 8, 9};
        BinarySearch binarySearch = new BinarySearch();
        // first element that >=5
        assert binarySearch.binarySearch(q, i -> i < 5, (l, r) -> r) == 3;
        // last element that <5
        assert binarySearch.binarySearch(q, i -> i < 5, (l, r) -> l) == 2;
        // first element that >5
        assert binarySearch.binarySearch(q, i -> i <= 5, (l, r) -> r) == 6;
        // last element that <=5
        assert binarySearch.binarySearch(q, i -> i <= 5, (l, r) -> l) == 5;
    }
}