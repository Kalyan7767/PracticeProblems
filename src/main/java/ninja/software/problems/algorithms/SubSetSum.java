package ninja.software.problems.algorithms;

public class SubSetSum {

    public boolean subsetSum(int[] A, int n, int sum) {
        if(sum == 0) {
            return true;
        }

        if(n<0 || sum <0) {
            return false;
        }

        boolean include = subsetSum(A, n-1, sum - A[n]);

        boolean exclude = subsetSum(A, n-1, sum);

        return include || exclude;
    }
}
