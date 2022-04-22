package com.roy.dsa.array.search.binary;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args)
    {
         int[] arrAsc = {1,2,3,4,5,6,7,8,9};
         int[] arrDesc = {9,8,7,6,5,4,3,2,1};
        int searchKey = 7;
        int index = orderAgnosticSearch(arrDesc, searchKey);
        System.out.println(index);

    }

    static int orderAgnosticSearch(int[] arr, int target)
    {
        if( arr == null || arr.length == 0 ) return -1;

        // order check
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start] < arr[end];
        while( start <= end)
        {
            int mid = start + (end-start)/2;
            if( arr[mid] == target ) return mid;
            if( isAsc )
            {
                if( arr[mid] < target )
                {
                    start = mid + 1;
                }
                else
                {
                    end = mid -1;
                }
            }
            else // desc logic
            {
                if( arr[mid] > target )
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
}
