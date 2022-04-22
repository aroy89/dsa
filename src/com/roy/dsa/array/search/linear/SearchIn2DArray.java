package com.roy.dsa.array.search.linear;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                        {23, 4 , 1},
                        {18,12, 32, 9},
                        {78,99,34,56},
                        {18, 12}
                    };
        int searchKey = 34;
        int[] result = search2D(arr, searchKey); // result will contain an array --> {row, column}
        System.out.println("2D search result: "+ Arrays.toString(result));

        System.out.println("Max element in 2D : "+ max2D(arr));
    }

    static int[] search2D(int[][] arr, int key)
    {
        int[] op = new int[]{-1, -1};
        if( arr == null || arr.length == 0 ) return op;
        for( int row =0;  row < arr.length; row++ )
        {
            for( int col = 0; col< arr[row].length; col++)
            {
                if(arr[row][col] == key)
                {
                    return new int[]{row, col};
                }
            }
        }
        return op;
    }

    static int max2D(int[][] arr)
    {
        int max = arr[0][0];
        for(int[] r: arr)
        {
            for(int c: r)
            {
                if(max < c)
                {
                    max = c;
                }
            }
        }
//        for( int r=0; r< arr.length; r++)
//        {
//            for(int c =0; c< arr[r].length; c++)
//            {
//                if(max < arr[r][c])
//                {
//                    max = arr[r][c];
//                }
//            }
//        }
        return max;
    }
}
