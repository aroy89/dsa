package com.roy.dsa.array.search.binary;

/**
 * G4G Problem:
 * Find position of an element in a sorted array of infinite numbers
 * https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/?ref=gcse
 *
 * Suppose you have a sorted array of infinite numbers, how would you search an element in the array?
 * Source: Amazon Interview Experience.
 * Since array is sorted, the first thing clicks into mind is binary search, but the problem here is that we don’t know size of array.
 * If the array is infinite, that means we don’t have proper bounds to apply binary search. So in order to find position of key, first we find bounds and then apply binary search algorithm.
 * Let low be pointing to 1st element and high pointing to 2nd element of array, Now compare key with high index element,
 * ->if it is greater than high index element then copy high index in low index and double the high index.
 * ->if it is smaller, then apply binary search on high and low indices found.
 */

public class InfiniteArraySearch {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        int start = 0;
        int end = (start + 1) * 2;
        int result = infiniteSearch(arr, target);
        System.out.println("Result: "+ result);
    }

    static int infiniteSearch(int[] arr, int target)
    {
        // first find the range
        int start = 0;
        int end = 1;
        while( target > arr[end])
        {
            // go to next chunk
            int temp = end + 1; // newStart
            // en = prev end + size of the box * 2
            end = end + (end - start +1) * 2;
            start = temp;
        }

        return finiteSearch(arr, target, start , end);
    }

    static int finiteSearch(int[] arr, int target, int start, int end)
    {
        if(arr == null || arr.length <= 0) return -1;

        while( start <= end )
        {
            int mid = start + (end-start)/2;

            if( arr[mid] == target) return mid;
            else if( arr[mid] < target)
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }

        return -1;
    }
}
