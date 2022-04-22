package com.roy.dsa.array.search.linear;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {18,12, 9,14,77,50};
        int searchKey =  14;
        int result = search(arr, searchKey);

        System.out.println("Search result: "+result);

        String str  = "Abhijit";
        char searchKeyStr = 'j';
        int resultStr = searchString(str, searchKeyStr);

        System.out.println("String Search result: " + resultStr);
        System.out.println("Min Number: "+ searchMin(arr));

    }

    static int searchMin(int[] arr)
    {
        int min = arr[0]; // Integer.MAX_VALUE;
        for(int i =0; i< arr.length; i++)
        {
            if(arr[i] < min )
            {
                min = arr[i];
            }
        }
        return min;
    }
    /**
     * Search in string
     * @param arr
     * @param key
     * @return
     */
    static int searchString(String str, char key)
    {
        if( str == null || str.length() == 0) return -1;

        // char[] charArr = str.toCharArray(); // using String utility method
        for(int i =0; i< str.length(); i++)
        {
            // char op = charArr[i];
            char op = str.charAt(i);
            if(op == key)
            {
                return i;
            }
        }
        return -1;
    }
    /**
     * search a number
     * @param arr
     * @param key
     * @return
     */
    static int search(int[] arr, int key)
    {
        if( arr== null || arr.length == 0) return -1;
        for(int a = 0; a < arr.length; a++)
        {
            if(arr[a] == key)
            {
                return a;
            }
        }
        return -1;
    }
}
