package ninja.software.problems.algorithms;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberDivisibleBy7Test {

    NumberDivisibleBy7 validator = new NumberDivisibleBy7();

    @Test
    public void check() {
        Assert.assertTrue(validator.check(371));
        Assert.assertTrue(validator.check(7));
        Assert.assertFalse(validator.check(23));
        Assert.assertTrue(validator.check(0));
        Assert.assertTrue(validator.check(616));
    }
}