package ninja.software.problems.algorithms;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class EqualAveragePartitionTest {

    EqualAveragePartition equalAveragePartition = new EqualAveragePartition();

    @Test
    public void avgset() {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(7);
        input.add(15);
        input.add(29);
        input.add(11);
        input.add(9);
        ArrayList<ArrayList<Integer>> result = equalAveragePartition.avgset(input);
        Assert.assertArrayEquals(new Integer[]{9, 15}, result.get(0).toArray());
        Assert.assertArrayEquals(new Integer[]{1,7, 11, 29}, result.get(1).toArray());
    }
}