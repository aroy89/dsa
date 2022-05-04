package com.roy.dsa.array.sorting.leetcode;

import java.util.Arrays;

/**
 * LeetCode Problem:
 * 645. Set Mismatch
 * https://leetcode.com/problems/set-mismatch/
 *
 * Input: nums = [1,2,2,4]
 * Output: [2,3]
 *
 * Input: nums = [1,1]
 * Output: [1,2]
 */
public class SetMisMatch_645
{
    public static void main(String[] args)
    {
        int[] nums = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

    static int[] findErrorNums(int[] nums)
    {
        int[] ans = new int[]{-1, -1};
        if(nums != null)
        {
            int n = nums.length;
            int i =0;
            while( i < n)
            {
                if(nums[i] != nums[nums[i]-1])
                {
                    swap(nums, i, nums[i]-1);
                }
                else
                {
                    i++;
                }
            }

            int c=0;
            for(int j =0; j< n; j++)
            {
                if(nums[j] != j+1)
                {
                    ans[0] = nums[j];
                    ans[1] = j+1;
                }
            }
        }
        return ans;
    }
    static void swap(int[] arr, int a, int b)
    {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
}
