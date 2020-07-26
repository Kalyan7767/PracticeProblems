package ninja.software.problems.algorithms;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RunningMedianTest {

    RunningMedian runningMedian = new RunningMedian();

    @Test
    public void solve() {
        int[] input = {59, 64, 10, 39};
        int[] actualResult = runningMedian.solve(input);
        int[] expectedResult = {59,59,59,39};
        Assert.assertArrayEquals(expectedResult, actualResult);
    }
}