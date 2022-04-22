package com.roy.dsa.array.search.binary;

public class BinarySearch_Sorted {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,11,12,14,20};
        int searchKey = 11;
        int result = search(arr, searchKey );
        System.out.println("The search Key, "+ searchKey+" is at index "+result);
    }

    static int search(int[] arr, int target)
    {
        if( arr == null || arr.length == 0 ) return -1;
        int start = 0;
        int end = arr.length;


        while( start <= end )
        {
//            int mid = (start + end) / 2;
            // better approach to get the mid ( start + end ) might be exceeding the int range
            int mid  = start + (end-start)/2 ;

            if( target == arr[mid])
            {
                return mid;
            }
            else if( arr[mid] < target ) // go to right
            {
                start = mid + 1 ;
            }
            else
            {
                end = mid-1;
            }
        }
        return -1;
    }
}
