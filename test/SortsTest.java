import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class SortsTest 
{

    @Test
    public void testBubbleSort() 
    {
        int[] actual = {2, 4, 3, 2, 6, 5, 1};
        int[] expected = {1, 2, 2, 3, 4, 5, 6}; 
        Sorts.bubbleSort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSelectionSort() 
    {
        int[] actual = {2, 4, 3, 2, 6, 5, 1};
        int[] expected = {1, 2, 2, 3, 4, 5, 6};
        Sorts.selectionSort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testInsertionSort() 
    {
        int[] actual = {2, 4, 3, 2, 6, 5, 1};
        int[] expected = {1, 2, 2, 3, 4, 5, 6};
        Sorts.insertionSort(actual);
        assertArrayEquals(expected, actual);
    }
}
