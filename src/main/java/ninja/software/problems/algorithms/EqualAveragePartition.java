package ninja.software.problems.algorithms;

import java.util.ArrayList;
import java.util.Collections;

public class EqualAveragePartition {

    boolean[][][] dp;
    ArrayList<Integer> result = new ArrayList<>();
    int[] actualArray;
    int totalSize;

    public boolean isSubSetAvailable(int index, int currentAverage, int subsetSize) {

        if (subsetSize == 0)
            return (currentAverage == 0);
        if (index >= totalSize)
            return false;

        if (!dp[index][currentAverage][subsetSize])
            return false;

        if (currentAverage >= actualArray[index])
        {
            result.add(actualArray[index]);

            if (isSubSetAvailable(index + 1, currentAverage - actualArray[index],
                    subsetSize - 1))
                return true;

            result.remove(result.size() - 1);
        }

        if (isSubSetAvailable(index + 1, currentAverage, subsetSize))
            return true;

        // If no solution has been found
        return dp[index][currentAverage][subsetSize] = false;
    }

    public ArrayList<ArrayList<Integer>> avgset(ArrayList<Integer> A)
    {
        totalSize = A.size();
        actualArray = new int[totalSize];
        Collections.sort(A);
        for (int i = 0; i < A.size(); i++) {
            actualArray[i] = A.get(i);
        }

        int totalSum = 0;

        for (int i = 0; i < totalSize; ++i)
            totalSum += actualArray[i];

        dp = new boolean[totalSize][totalSum + 1][totalSize];

        for (int i = 0; i < totalSize; i++)
            for (int j = 0; j < totalSum + 1; j++)
                for (int k = 0; k < totalSize; k++)
                    dp[i][j][k] = true;

        for (int i = 1; i < totalSize; i++)
        {

            if ((totalSum * i) % totalSize != 0)
                continue;
            int Sum_of_Set1 = (totalSum * i) / totalSize;

            if (isSubSetAvailable(0, Sum_of_Set1, i))
            {

                int ptr1 = 0, ptr2 = 0;
                ArrayList<Integer> listA = result;
                ArrayList<Integer> listB = new ArrayList<>();
                while (ptr1 < actualArray.length || ptr2 < result.size())
                {
                    if (ptr2 < result.size() &&
                            result.get(ptr2) == actualArray[ptr1])
                    {
                        ptr1++;
                        ptr2++;
                        continue;
                    }
                    listB.add(actualArray[ptr1]);
                    ptr1++;
                }

                ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
                ans.add(listA);
                ans.add(listB);
                return ans;
            }
        }

        return new ArrayList<>();
    }
}
