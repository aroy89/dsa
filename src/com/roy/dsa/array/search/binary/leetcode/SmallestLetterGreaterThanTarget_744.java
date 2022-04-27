package com.roy.dsa.array.search.binary.leetcode;

/**
 * LeetCode Problem:
 * https://leetcode.com/problems/find-smallest-letter-greater-than-target/
 * 744. Find Smallest Letter Greater Than Target
 *
 * Input: letters = ["c","f","j"], target = "a"
 * Output: "c"
 */
public class SmallestLetterGreaterThanTarget_744
{
    public static void main(String[] args)
    {
        char[] arr = {'c', 'f', 'g'};
        char target = 'g';
        System.out.println( smallestLetterGreaterThanTarget(arr, target));
    }
    static char smallestLetterGreaterThanTarget(char[] arr, char target)
    {
        int start = 0;
        int end = arr.length -1;
        while( start <= end )
        {
            int mid = start + (end-start)/2;

            if( arr[mid] > target )
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        return arr[start % arr.length];
    }
}
