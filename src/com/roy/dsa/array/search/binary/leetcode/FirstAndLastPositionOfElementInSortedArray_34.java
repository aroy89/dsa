package com.roy.dsa.array.search.binary.leetcode;

import java.util.Arrays;

/**
 * LeetCode Problem:
 * Find First and Last Position of Element in Sorted Array
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 *
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 *
 */
public class FirstAndLastPositionOfElementInSortedArray_34
{
    public static void main(String[] args)
    {
       int[] nums = {5,7,7,8,8,10};
        int target = 7;
        System.out.println(Arrays.toString(firstAndLastPositionOfElementInSortedArray(nums, target)));
    }

    public static int[] firstAndLastPositionOfElementInSortedArray(int[] nums, int target)
    {
        int[] res = new int[] {-1, -1};
        if( nums != null && nums.length > 0 )
        {
            // For the first Occurrence
            int firstOccurrence = binarySearch( nums, target, true);
            res[0] = firstOccurrence;
            // For the last Occurrence
            if( res[0] != -1 )
            {
                int lastOccurrence = binarySearch(nums, target, false);
                res[1] = lastOccurrence;
            }
        }
        return res;
    }

    static int binarySearch(int[] arr, int target, boolean isFirstOccurrence)
    {
        int res = -1;
        int start = 0;
        int end = arr.length -1;

        while( start <= end )
        {
            int mid = start + (end-start)/2;

            if( arr[mid] < target )
            {
                start = mid +1;
            }
            else if( arr[mid]> target)
            {
                end = mid -1;
            }
            else
            {
                // potential ans found
                res = mid;
                if( isFirstOccurrence )
                {
                    end = mid -1;
                }
                else
                {
                    start = mid +1;
                }
            }
        }
        return res;
    }
}
