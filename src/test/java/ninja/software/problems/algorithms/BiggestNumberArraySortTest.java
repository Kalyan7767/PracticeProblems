package ninja.software.problems.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class BiggestNumberArraySortTest {

    BiggestNumberArraySort sort = new BiggestNumberArraySort();

    @Test
    public void sort() {
        Integer[] array = new Integer[]{54, 546, 548, 60};
        sort.sort(array);
        Assert.assertArrayEquals(new Integer[]{60, 548, 546, 54}, array);
    }

    @Test
    public void sortAgain() {
        Integer[] array = new Integer[]{1, 34, 3, 98, 9, 76, 45, 4};
        sort.sort(array);
        Assert.assertArrayEquals(new Integer[]{9, 98, 76, 45, 4, 34, 3, 1}, array);
    }
}