package com.roy.dsa.array.sorting.leetcode;

/**
 * LeetCode Problem:
 * 41. First Missing Positive
 * https://leetcode.com/problems/first-missing-positive/
 *
 * Example 1:
 * Input: nums = [1,2,0]
 * Output: 3
 *
 * Example 2:
 * Input: nums = [3,4,-1,1]
 * Output: 2
 *
 * Example 3:
 * Input: nums = [7,8,9,11,12]
 * Output: 1
 */
public class FirstMissingPositiveNumber_41
{
    public static void main(String[] args)
    {
        int[] arr = {7,8,9,11,12};
        System.out.println(firstMissingPositive(arr));
    }
    static int firstMissingPositive(int[] nums)
    {
        if(nums != null)
        {
            int n = nums.length;
            int i=0;
            while(i < n)
            {
                if(nums[i] > 0  && nums[i] <= n && nums[i] != nums[nums[i]-1])
                {
                    swap(nums, i, nums[i]-1);
                }
                else
                {
                    i++;
                }
            }

            for(int a=0; a< n; a++)
            {
                if(nums[a] != a +1 )
                {
                    return a+1;
                }
            }
        }
        return nums.length;
    }

    static void swap(int[] arr, int a, int b)
    {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
}
