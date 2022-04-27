package com.roy.dsa.array.search.binary.leetcode;

/**
 * LeetCode Problem:
 * https://leetcode.com/problems/search-in-rotated-sorted-array/
 * 33. Search in Rotated Sorted Array
 *
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 *
 * Solutions:
 * 1. find the pivot element
 * 2. If pivot not found, the array is not rotated - do simple binary search
 * 3. If pivot exist
 *      a. pivot = target => return pivot
 *      b. target >= start element => binarySearch => start =0 & end =pivot-1 // If the target element is greater than start element, take the first half
 *      c. else => binarySearch => start =pivot+1 & end =length-1 // else - go for second half
 */
public class SearchInRotatedSortedArray_33
{
    public static void main(String[] args)
    {
        int[] nums = {4,5,6,7,0,1,2};

        int target = 0;
        System.out.println("Answer: "+search(nums, target));
    }
    static int search(int[] nums, int target)
    {
        if( nums == null || nums.length == 0) return -1;
        // find the pivot element
        int pivot =  getPivotWithDuplicates(nums); // getPivot(nums);
        System.out.println("Pivot: "+pivot);
        // case-1
        // If pivot is -1 means array is not rotated
        if( pivot == -1) // do normal binary search
        {
            return binarySearch(nums, target, 0, nums.length-1);
        }
        // case-2
        // If pivot is found, you have found 2 asc sorted arrays => {4,5,6,7,0,1,2} => {4,5,6} 7=pivot {0,1,2}
        if( nums[pivot] == target) return pivot;
        // case-3
        // If the target element is greater than start element, take the first half
        // [bcz after pivot, all are smaller elements than the target]
        if(target >= nums[0]) return binarySearch(nums, target, 0, pivot-1);
        // else part - go for second half
       return binarySearch(nums, target, pivot + 1, nums.length-1);
    }
    // it will not work on duplicate values
    static int getPivot(int[] arr)
    {
        int start = 0;
        if( arr != null || arr.length > 0)
        {
            int end = arr.length -1;

            while(start <= end)
            {
                int mid = start + (end-start)/2;

                // case-1
                if(mid < end && arr[mid] > arr[mid+1])
                {
                    return mid;
                }
                // case-2
                if(mid >start && arr[mid] < arr[mid-1])
                {
                    return mid - 1;
                }
                // case-3
                if(arr[mid] <= arr[start])
                {
                    end = mid -1;
                }// case-4
                else
                {
                    start = mid +1;
                }
            }
        }
        return -1;

    }
    static int getPivotWithDuplicates(int[] arr)
    {
        int start = 0;
        if( arr != null || arr.length > 0)
        {
            int end = arr.length -1;

            while(start <= end)
            {
                int mid = start + (end-start)/2;

                // case-1
                if(mid < end && arr[mid] > arr[mid+1])
                {
                    return mid;
                }
                // case-2
                if(mid >start && arr[mid] < arr[mid-1])
                {
                    return mid - 1;
                }
                // case-3
                //                if(arr[mid] <= arr[start])
                //                {
                //                    end = mid -1;
                //                }// case-4
                //                else
                //                {
                //                    start = mid +1;
                //                }
                // If elements at middle, start & end are equal then just skip the duplicates
                if( arr[mid] == arr[start] && arr[mid] == arr[end])
                {
                    // skip start & end both but check the pivot for each
                    if( arr[start] > arr[start+1]) // check if start is pivot
                    {
                        return start;
                    }
                    start++;
                    if(arr[end] < arr[end-1]) // check whether end is pivot
                    {
                        return end-1;
                    }
                    end--;
                }
                else if( arr[mid] > arr[start] || (arr[mid] == arr[start] && arr[mid] > arr[end]))
                {
                    start = mid + 1;
                }
                else
                {
                    end = mid -1;
                }
            }
        }
        return -1;
    }
    static int binarySearch(int[]nums, int target, int start, int end)
    {
        while(start <= end )
        {
            int mid = start + (end -start)/2;

            if(nums[mid] < target)
            {
                start = mid+1;
            }
            else if( nums[mid] > target)
            {
                end = mid -1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
