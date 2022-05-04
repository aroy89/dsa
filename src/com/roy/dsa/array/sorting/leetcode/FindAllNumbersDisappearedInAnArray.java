package com.roy.dsa.array.sorting.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * // Asked in Google
 * LeetCode Problems
 * 448. Find All Numbers Disappeared in an Array
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 *
 */
class FindAllNumbersDisappearedInAnArray
{
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
                    //{1,2,2,3,3,4,7,8}
        System.out.println(findDisappearedNumbers(nums));
    }
    static List<Integer> findDisappearedNumbers(int[] nums)
    {
        List<Integer> list = new ArrayList<>();
        if(nums != null)
        {
            int n = nums.length;
            int i=0;
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
            for(int a=0; a<n; a++)
            {
                if(nums[a] != a+1)
                {
                    list.add(a+1);
                }
            }
        }
        return list;
    }
    
    static void swap(int[] arr, int a, int b)
    {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
}