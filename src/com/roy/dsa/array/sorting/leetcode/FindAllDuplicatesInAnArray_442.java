package com.roy.dsa.array.sorting.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode Problems:
 * 442. Find All Duplicates in an Array
 * https://leetcode.com/problems/find-all-duplicates-in-an-array/
 *
 */
public class FindAllDuplicatesInAnArray_442
{
    public static void main(String[] args)
    {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }
    static List<Integer> findDuplicates(int[] nums)
    {
        List<Integer> list = new ArrayList<>();
        if(nums != null)
        {
            int i=0;
            int n = nums.length;
            while(i < n)
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
            // System.out.println(Arrays.toString(nums));
            for(int a=0; a<n; a++)
            {
                if(nums[a] != a+1)
                {
                    list.add(nums[a]);
                }
            }
        }
        return list;
    }
    static void swap(int[] nums, int a, int b )
    {
        int t = nums[a];
        nums[a] = nums[b];
        nums[b] = t;
    }
}
