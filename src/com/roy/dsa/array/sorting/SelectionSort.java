package com.roy.dsa.array.sorting;

import java.util.Arrays;

/**
 * Logic:
 * - Select the max element
 * - put it into the right position => swap the max element with last sorted element-1
 */
public class SelectionSort
{
    public static void main(String[] args)
    {
        int[] arr =  {4,5,1,2,3}; // {1,2,3,4,5};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    static int[] selectionSort(int[] arr)
    {
        if(arr != null || arr.length > 0 )
        {
            if( arr.length == 1 ) return arr;


            for(int i =0; i<arr.length; i++)
            {
                int last = arr.length - i -1;
                int  maxIndex = getMaxIndex(arr, 0, last);

                swap (arr, maxIndex , last);
            }

        }
        return arr;
    }

    static void swap(int[] arr, int n1, int n2)
    {
        int t = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = t;
    }
    static int getMaxIndex(int[] arr, int start, int end)
    {
        int max = start;
        for(int i=start; i<= end; i++)
        {
            if(arr[max] < arr[i])
            {
                max = i;
            }
        }
        return max;
    }
}
