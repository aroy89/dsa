package com.roy.dsa.array.sorting;

import com.roy.dsa.array.ArrayBasics;

import java.util.Arrays;

public class InsertionSort
{
    public static void main(String[] args)
    {
        int[] arr =  {4,5,1,2,3}; // {1,2,3,4,5};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }

    static int[] insertionSort(int[] arr)
    {
        if( arr != null || arr.length > 0)
        {
            if(arr.length == 1) return arr;

            for(int i =0; i< arr.length-1; i++)
            {
                for(int j= i+1; j > 0; j--)
                {
                    if( arr[j] < arr[j-1])
                    {
                        int t = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1] = t;
                    }
                    else
                    {
                        break;
                    }
                }
            }
        }
        return arr;
    }
}
