package com.roy.dsa.array.sorting.leetcode;

import java.util.Arrays;

/**
 * // Asked in Amazon
 * LeetCode Problem:
 * 268. Missing Number
 * https://leetcode.com/problems/missing-number/
 *
 * Input: nums = [3,0,1]
 * Output: 2
 *
 * Input: nums = [0,1]
 * Output: 2
 *
 * Input: nums = [9,6,4,2,3,5,7,0,1]
 * Output: 8
 */
public class MissingNumber_268
{
    public static void main(String[] args) {
        int[] arr =  {3,0,1} ; // {0,1}; // {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr));
    }
    static int missingNumber(int[] nums)
    {
        int n = nums.length;
        if(nums != null || n > 0)
        {

            int i = 0;
            while( i < n)
            {
                if(nums[i] < n && nums[i] != nums[nums[i]])
                {
                    swap(nums, i, nums[i]);
                }
                else
                {
                    i++;
                }
            }
            for( int a =0; a<n; a++)
            {
                if( a != nums[a])
                {
                    return a;
                }
            }
        }

        return nums.length;
    }

    static void swap(int[] arr, int n1, int n2)
    {
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }
}
