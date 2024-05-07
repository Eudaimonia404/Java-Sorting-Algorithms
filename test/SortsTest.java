import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class SortsTest 
{

    @Test
    public void testBubbleSort() 
    {
        int[] actual = {5, 1, 4, 2, 8};
        int[] expected = {1, 2, 4, 5, 8};
        Sorts.bubbleSort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSelectionSort() 
    {
        int[] actual = {64, 25, 12, 22, 11};
        int[] expected = {11, 12, 22, 25, 64};
        Sorts.selectionSort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testInsertionSort() 
    {
        int[] actual = {3, 6, 1, 8, 4, 5};
        int[] expected = {1, 3, 4, 5, 6, 8};
        Sorts.insertionSort(actual);
        assertArrayEquals(expected, actual);
    }
}
