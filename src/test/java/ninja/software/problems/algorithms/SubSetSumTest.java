package ninja.software.problems.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class SubSetSumTest {

    SubSetSum subSetSum = new SubSetSum();

    @Test
    public void isSubsetPresent() {
        boolean result = subSetSum.subsetSum(new int[]{1, 2, 3, 4, 5, 6}, 5, 22);
        Assert.assertFalse(result);

        result = subSetSum.subsetSum(new int[]{1, 2, 3, 4, 5, 6}, 5, 10);
        Assert.assertTrue(result);

        result = subSetSum.subsetSum(new int[]{1, 2, 3, 4, 5, 6}, 5, 6);
        Assert.assertTrue(result);
    }
}