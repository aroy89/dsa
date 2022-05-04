package com.roy.dsa.array.sorting;
import java.util.Arrays;

public class BubbleSort
{
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4}; // {5,4,3,2,1};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
    static int[] bubbleSort(int[] arr)
    {
        boolean isSwapAtOnce= false;
        if( arr != null || arr.length > 0 )
        {
            if( arr.length == 1) return arr;

            for( int i=0; i< arr.length ; i++) // here i is a counter
            {
                isSwapAtOnce= false;
                for( int j=1; j < arr.length-i; j++) // check j & j-1 and swap accordingly
                {
                    if(arr[j-1] > arr[j])
                    {
                        isSwapAtOnce = true;
                        swap(arr, j-1, j);
                    }
                }
                if(isSwapAtOnce == false)
                {
                    // if Input Array is Already sorted
                     break;
                }
            }

        }
        return arr;
    }

    static void swap(int[] arr, int n1, int n2)
    {
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }
}
