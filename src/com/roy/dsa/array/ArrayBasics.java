package com.roy.dsa.array;
import java.util.Arrays;

public class ArrayBasics
{
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = { 3, 78, 90, 1, 5 };
        System.out.println("Input: "+Arrays.toString(arr));
        swap(arr, 2 ,4);
        System.out.println("SWAP(2,4): "+Arrays.toString(arr));
        System.out.println("MAX ELEMENT: "+ max(arr));
        reverse(arr, 0, arr.length-1);
        System.out.println("Reversed Array: "+ Arrays.toString(arr));
    }

    /**
     *
     * @param arr
     * @return
     */
    static int max(int[] arr)
    {
        if(arr == null || arr.length == 0  )
        {
            return -1;
        }
        int max = arr[0]; // Integer.MIN_VALUE;
        if(arr.length > 0 )
        {
            for( int i=0; i< arr.length; i++)
            {
                if (max < arr[i])
                {
                    max = arr[i];
                }
            }

        }
        return max;
    }

    /**
     *
     * @param arr
     * @param start
     * @param end
     */
    static void reverse(int[] arr, int start, int end)
    {
        while(start < end )
        {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    /**
     *
     * @param arr
     * @param index1
     * @param index2
     */
    static void swap(int[] arr, int index1, int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
