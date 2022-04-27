package com.roy.dsa.array.search.binary;

/**
 * LeetCode Problem
 * https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/
 * 744. Find Smallest Letter Greater Than Target
 *
 * Ceiling value: means greater or equal to target element | Smallest number greater than equal to target value
 * Sol: if the target is not available, the answer would be start of arr after exiting the while loop
 * Logic: ( start <= end ) => will exit when start is crossed the end. => start = end +1
 */

public class CeilingBinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,14,16,18};
        int targetKey = 34; // not preset in array but range is in between the array elements
        int result = ceilingSearch(arr, targetKey);
        System.out.println("Ceiling element Index "+ result);
    }

    static int ceilingSearch(int[] arr, int target)
    {
        if( target > arr[arr.length-1]) return -1;
        if( arr == null || arr.length ==0 ) return -1;

        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        while( start <= end )
        {
            mid = start + (end -start)/2;
            if(arr[mid] == target) return mid;
            else if( arr[mid] < target ) { // go to right
                start = mid +1;
            }
            else
            {
                end = mid -1;
            }
        }
        // System.out.println("start: " +start);
        return start; // -1;  // only start instead of -1 except all binary search code
        // return end; // For floor value
    }
}
