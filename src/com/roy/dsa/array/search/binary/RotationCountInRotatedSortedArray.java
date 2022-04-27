package com.roy.dsa.array.search.binary;

/**
 * G4G problem:
 * Find the Rotation Count in Rotated Sorted array
 * https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
 * Input: arr = {15, 18,2,3,6,12};
 * Output: 2
 *
 * Input: arr[] = {7, 9, 11, 12, 5}
 * Output: 4
 *
 * Input: arr[] = {7, 9, 11, 12, 15};
 * Output: 0
 */
public class RotationCountInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {7, 9, 11, 12, 5}; // {7, 9, 11, 12, 15}; // {15, 18,2,3,6,12};
        // Sol: pivot + 1
        int rotationCount = countRotation(arr);
        System.out.println("Rotation Count is : "+ rotationCount);
    }
    static int countRotation(int[] arr)
    {
        int pivot = getPivot(arr);
        return pivot + 1;
    }
    static int getPivot(int[] arr)
    {
        int start = 0;
        int end = arr.length -1;
        while( start <= end)
        {
            int mid = start + (end-start)/2;
            // case-1
            if( mid < end && arr[mid] > arr[mid+1])
            {
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1])
            {
                return mid-1;
            }
            if(arr[mid] <=  arr[start])
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }

        }
        return -1;
    }
}
