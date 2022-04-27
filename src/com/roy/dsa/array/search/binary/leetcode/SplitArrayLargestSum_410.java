package com.roy.dsa.array.search.binary.leetcode;

/**
 * LeetCode Problem
 *
 *
 * Input: nums = [7,2,5,10,8], m = 2
 * Output: 18
 * Explanation:  There are four ways to split nums into two sub-arrays.  The best way is to split it into [7,2,5] and [10,8],
 * where the largest sum among the two subarrays is only 18.
 *
 * Example 2:
 * Input: nums = [1,2,3,4,5], m = 2
 * Output: 9
 * Example 3:
 * Input: nums = [1,4,4], m = 3
 * Output: 4
 *
 */
public class SplitArrayLargestSum_410
{
    public static void main(String[] args)
    {
        int[] nums = {7,2,5,10,8};
        int m = 2;
        System.out.println("Answer: "+splitArray(nums, m));
    }
    static int splitArray(int[] nums, int m)
    {
        if(nums == null || nums.length ==0) return -1;

        int start = 0;
        int end = 0;

        for( int i=0; i< nums.length; i++)
        {
            start = Math.max(nums[i], start);
            end += nums[i];
        }
        while( start < end)
        {
            int mid = start + (end-start)/2;
            int pieces = 1;
            int sum = 0;

            for( int num : nums)
            {
                if( sum + num > mid )
                {
                    sum = num;
                    pieces++;

                }
                else
                {
                    sum += num;
                }
            }
            if( pieces > m)
            {
                start = mid +1 ;
            }
            else // pieces <= m
            {
                end = mid;
            }
        }
        return start; // here start = end
    }


}
