package com.roy.dsa.array.search.linear.leetcode;

/**
 * LeetCode problem:
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/
 *
 * 1295. Find Numbers with Even Number of Digits
 * Input: nums = [12,345,2,6,7896]
 * Output: 2
 * Explanation:
 * 12 contains 2 digits (even number of digits).
 * 345 contains 3 digits (odd number of digits).
 * 2 contains 1 digit (odd number of digits).
 * 6 contains 1 digit (odd number of digits).
 * 7896 contains 4 digits (even number of digits).
 * Therefore only 12 and 7896 contain an even number of digits.
 */
public class EvenDigit1295 {
    public static void main(String[] args) {
        int[] nums = {12,345,22,6,78, -96};
        System.out.println( "Even Digits count: "+ findNumbers(nums));
    }

    public static int findNumbers(int[] nums)
    {
        if( nums == null ) return 0;

        int count =0;
        for(int n : nums)
        {
            if( n < 0 ) n *= -1; // to consider the negative num

            if(isEven3(n))
            {
                count++;
            }
        }
        return count;
    }

    // Way-1 ----- convert it into string array
    // Way-2 ----- divide by 10
    // Way-3 ----- Math.log10(num) --- Best approach

    // Way-1
    private static boolean isEven1(int num)
    {
        String str = Integer.toString(num);
        char[] strArr = str.toCharArray();
        if( strArr.length % 2 == 0 ) return true;
        return false;
    }
    // Way-2
    private static boolean isEven2(int n)
    {
        int count = 0;
        while(n > 0)
        {
            count++;
            n = n/10;
        }
        if( count % 2 ==0 ) {
            return true;
        }
        return false;
    }

    // Way-3
    private static boolean isEven3(int num )
    {
        int res = (int)Math.log10(num) + 1 ;
        return res % 2 == 0;
    }
}
