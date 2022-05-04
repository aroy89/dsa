package com.roy.dsa.array.search.binary.twoD;
import java.util.Arrays;

public class SortedMatrix
{
    public static void main(String[] args)
    {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target = 6;
        System.out.println(Arrays.toString(search(matrix, target)));
    }
    static int[] binarySearch(int[][] arr, int row, int cStart, int cEnd, int target)
    {
        int[] ans = new int[] {-1,-1};
        while(cStart <= cEnd)
        {
            int mid = cStart + ( cEnd-cStart)/2;
            if(arr[row][mid] == target)
            {
                return new int[]{row, mid};
            }
            else if( arr[row][mid] < target)
            {
                cStart = mid+1 ;
            }
            else
            {
                cEnd = mid-1;
            }
        }
        return ans;
    }
    static int[] search(int[][] matrix, int target)
    {
        if(matrix != null || matrix.length > 0)
        {
            int rows = matrix.length;
            int cols = matrix[0].length;
            if( rows == 1)
            {
                binarySearch(matrix, 0, 0, cols-1, target );
            }

            int rStart = 0;
            int rEnd = rows -1;
            int cMid = cols/2;
            while( rStart < rEnd-1 )
            {
                int rMid = rStart + (rEnd - rStart)/2;
                if(matrix[rMid][cMid] == target )
                {
                    return new int[]{rMid, cMid};
                }

                if(matrix[rMid][cMid] < target )
                {
                      rStart = rMid;
                }
                else
                {
                    rEnd = rMid;
                }
            }
            // Now we have 2 rows
            // check whether the target element exist in the mid col
            if(matrix[rStart][cMid] == target)
            {
                return new int[]{rStart, cMid};
            }

            if(matrix[rStart+1][cMid] == target)
            {
                return new int[]{rStart+1, cMid};
            }
            // Case-1 - upper mid left
            if(matrix[rStart][cMid-1] >= target )
            {
                binarySearch(matrix, rStart, 0,cMid-1, target);
            }
            // case-2 - upper mid right
            if(matrix[rStart][cMid+1] <= target && target <= matrix[rStart][cols-1])
            {
                binarySearch(matrix, rStart,cMid+1, cols-1, target);
            }
            // case-3 - lower mid left
            if(matrix[rStart+1][cMid-1] >= target )
            {
                binarySearch(matrix, rStart+1, 0,cMid-1, target);
            }
            else
            // case-4 - lower mid right
            //if(matrix[rStart+1][cMid+1] >= target && target <= matrix[rStart+1][cols-1])
            {
                binarySearch(matrix, rStart+1, cMid+1, cols-1, target);
            }
        }
        return new int[]{-1,-1};
    }
}
