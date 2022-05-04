package com.roy.dsa.array.sorting;
import java.util.Arrays;

/**
 * Leetcode Problem:
 * 268: Missing Number
 *
 */
public class CyclicSort
{
    public static void main(String[] args)
    {
        int[] arr = {3,5,2,1,4};
        System.out.println(Arrays.toString(cyclicSort(arr)));
    }

    static int[] cyclicSort(int[] arr)
    {
        if( arr !=null || arr.length > 0 )
        {
            if(arr.length == 1) return arr;
            int i=0;
            while(i < arr.length)
            {
                if(arr[i] != arr[arr[i]-1]) // if(arr[i] != i+1)
                {
                    swap(arr, i, arr[i]-1);
                }
                else
                {
                    i++;
                }
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
}
