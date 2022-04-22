package com.roy.dsa.array.search.linear.leetcode;

/**
 * LeetCode Problem:
 * https://leetcode.com/problems/richest-customer-wealth/
 *
 * Input: accounts = [[1,5],[7,3],[3,5]]
 * Output: 10
 * Explanation:
 * 1st customer has wealth = 6
 * 2nd customer has wealth = 10
 * 3rd customer has wealth = 8
 * The 2nd customer is the richest with a wealth of 10.
 */
public class RichestCustomerWealth1672 {

    public static void main(String[] args) {
        int[][] accounts = {{1,5}, {7,3},{3,5}};
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts)
    {
        int n = accounts.length;

        if(accounts == null || n == 0) return -1;

        int max = Integer.MIN_VALUE;
        for( int r =0; r< n; r++) // use enhance for loop for better performance
            // for( int[] r : accounts)
        {
            int sum = 0;

            for( int c=0; c < accounts[r].length; c++) // use enhance for loop for better performance
                // for (int c : r)
            {
                sum += accounts[r][c]; // sum += c;

            }
            if( max < sum)
            {
                max = sum;
            }
        }
        return max;
    }
}
