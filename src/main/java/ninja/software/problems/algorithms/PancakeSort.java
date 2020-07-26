package ninja.software.problems.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PancakeSort {

	public List<Integer> pancakeSort(int[] A) {
		int currentSize = A.length;
		List<Integer> result = new ArrayList<>();
		if(isArraySorted(A)) {
			return result;
		}
		while(currentSize > 1 ) {
			int maxIndex = findMaxIndex(A, currentSize-1);
			result.add(maxIndex+1);
			result.add(currentSize);
			flip(A, maxIndex);
			flip(A, currentSize-1);
			currentSize -= 1;
			System.out.println("Array after sorting is"+Arrays.toString(A));
			if(isArraySorted(A)) {
				break;
			}
		}
		return result;
	}
	
	public int findMaxIndex(int[] A, int maxLength) {
		int maxValue = Integer.MIN_VALUE;
		int index = 0;
		for(int i = 0; i <= maxLength; i++) {
			if(A[i] > maxValue) {
				maxValue = A[i];
				index = i;
			}
		}
		return index;
	}
	
	public int findIndex(int[] A, int value) {
		for(int i = 0; i < A.length; i++) {
			if(A[i] == value) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean isArraySorted(int[] A) {
		boolean isArraySorted = true;
		int prevItem = A[0];
		for(int i = 1; i < A.length; i++) {
			if(A[i] < prevItem) {
				isArraySorted = false;
				break;
			}
			prevItem = A[i];
		}
		return isArraySorted;
	}
	
	public void flip(int[] A, int position) {
		int temp, start = 0;
		while(start < position) {
			temp = A[start];
			A[start] = A[position];
			A[position] = temp;
			start++;
			position--;
		}
	}

}
