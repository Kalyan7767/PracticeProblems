package ninja.software.problems.algorithms;

import java.util.Collections;
import java.util.PriorityQueue;

public class RunningMedian {

    public int[] solve(int[] A) {
        if(A.length == 1) {
            return A;
        }
        PriorityQueue<Integer> leftHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> rightHeap = new PriorityQueue<>();
        int[] result = new int[A.length];
        result[0] = A[0];
        int runningMedian = A[0];
        rightHeap.add(A[0]);
        for(int i = 1; i < A.length; i++) {
            if(rightHeap.size() > leftHeap.size()) {
                if(A[i] > runningMedian) {
                    leftHeap.add(rightHeap.poll());
                    rightHeap.add(A[i]);
                } else {
                    leftHeap.add(A[i]);
                }
                runningMedian = leftHeap.peek() == null ? 0 : leftHeap.peek();
            }
            else if (rightHeap.size() == leftHeap.size()) {
                if(A[i] < runningMedian) {
                    leftHeap.add(A[i]);
                    runningMedian = leftHeap.peek() == null ? 0 : leftHeap.peek();
                } else {
                    rightHeap.add(A[i]);
                    runningMedian = rightHeap.peek() == null ? 0 : rightHeap.peek();
                }
            } else {
                if(A[i] < runningMedian) {
                    rightHeap.add(leftHeap.poll());
                    leftHeap.add(A[i]);
                } else {
                    rightHeap.add(A[i]);
                }
                runningMedian = leftHeap.peek() == null ? 0 : leftHeap.peek();
            }
            result[i] = runningMedian;
        }
        return result;
    }
}
