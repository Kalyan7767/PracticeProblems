package ninja.software.problems.algorithms;

import java.util.Arrays;

public class BiggestNumberArraySort {

    public void sort(Integer[] array) {
        Arrays.sort(array, (x,y) -> {
            String xy = x+""+y;
            String yx = y+""+x;
            int xyValue = Integer.parseInt(xy);
            int yxValue = Integer.parseInt(yx);
            return Integer.compare(yxValue, xyValue);
        });
        System.out.println(Arrays.toString(array));
    }
}
