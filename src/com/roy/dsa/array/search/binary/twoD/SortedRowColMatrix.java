package com.roy.dsa.array.search.binary.twoD;

import java.util.Arrays;

public class SortedRowColMatrix
{
    public static void main(String[] args)
    {
        int matrix[][] = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int target = 37;
        System.out.println(Arrays.toString(search(matrix, target)));
    }

    static int[] search(int[][] matrix, int target)
    {
        int[] ans = new int[]{-1,-1};
        for( int r = 0; r < matrix.length; r++)
        {
            for( int c=0; c < matrix[r].length; c++)
            {
                if( matrix[r][c] == target )
                {
                    ans[0] = r;
                    ans[1] = c;
                    return ans;
                }
                else if(matrix[r][c] > target )
                {
                    // reduce the column search
                    c--;
                }
                else
                {
                    r++;
                }
            }
        }
        return ans;
    }
}
