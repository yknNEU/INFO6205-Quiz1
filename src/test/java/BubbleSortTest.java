import org.junit.Test;
import static org.junit.Assert.*;

public class BubbleSortTest {

    @Test
    public void testSortWithIntegers() {
        BubbleSort sorter = new BubbleSort();
        Integer[] array = {5, 3, 8, 4, 6};
        Integer[] expected = {3, 4, 5, 6, 8};
        sorter.sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSortWithStrings() {
        BubbleSort sorter = new BubbleSort();
        String[] array = {"banana", "apple", "cherry", "date"};
        String[] expected = {"apple", "banana", "cherry", "date"};
        sorter.sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSortWithAlreadySortedArray() {
        BubbleSort sorter = new BubbleSort();
        Integer[] array = {1, 2, 3, 4, 5};
        Integer[] expected = {1, 2, 3, 4, 5};
        sorter.sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSortWithReverseSortedArray() {
        BubbleSort sorter = new BubbleSort();
        Integer[] array = {5, 4, 3, 2, 1};
        Integer[] expected = {1, 2, 3, 4, 5};
        sorter.sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSortWithSingleElementArray() {
        BubbleSort sorter = new BubbleSort();
        Integer[] array = {42};
        Integer[] expected = {42};
        sorter.sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSortWithEmptyArray() {
        BubbleSort sorter = new BubbleSort();
        Integer[] array = {};
        Integer[] expected = {};
        sorter.sort(array);
        assertArrayEquals(expected, array);
    }
}