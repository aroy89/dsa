package com.roy.dsa.array.search.binary.leetcode;

/**
 * LeetCode Problem:
 * 852. Peak Index in a Mountain Array | Bi-tonic Array
 * https://leetcode.com/problems/peak-index-in-a-mountain-array/
 *
 * Mid:
 * 162. Find Peak Element
 * https://leetcode.com/problems/find-peak-element/
 *
 * HARD:
 * 1095. Find in Mountain Array
 * https://leetcode.com/problems/find-in-mountain-array/
 */
public class PeakIndexInMountainArray_852
{
    /* Let's call an array arr a mountain if the following properties hold:
    *
    * arr.length >= 3
    * There exists some i with 0 < i < arr.length - 1 such that:
    * arr[0] < arr[1] < ... arr[i-1] < arr[i]
    * arr[i] > arr[i+1] > ... > arr[arr.length - 1]
    * Given an integer array arr that is guaranteed to be a mountain, return any i such that arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].
    */
    public static void main(String[] args)
    {
        int[] arr = {5,1, 3}; // { 0,10,5,2};
        System.out.println("Mountain Array: "+peakIndexInMountainArray(arr));
        Object obj;
    }

    static int peakIndexInMountainArray(int[] arr)
    {
        int start =0;
        int end = arr.length -1;
        while( start < end)
        {
            int mid = start + (end-start)/2;
            if( arr[mid] > arr[mid+1]) // traverse left
            {
                // desc part of the array
                // this may the ans but look at left
                // that's why end != mid-1
                end = mid;
            }
            else
            {
                // Asc part of the array
                start = mid + 1;
            }
        }
        // at the end, start = end and pointing to the largest number
        return start; // return end; // both are fins as both are pointing to same index
    }
}
