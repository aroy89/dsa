package com.roy.dsa.pattern;

/*
 4 4 4 4 4 4 4
 4 3 3 3 3 3 4
 4 3 2 2 2 3 4
 4 3 2 1 2 3 4
 4 3 2 2 2 3 4
 4 3 3 3 3 3 4
 4 4 4 4 4 4 4
 */
public class Pattern31
{
    public static void main(String[] args)
    {
        int n = 4;
        int origN = n;
        n= 2 * n-1;
        for(int row = 0; row<= n; row++)
        {
            for(int col=0; col<= n; col++)
            {
                int left = col;
                int right = n-col;
                //int lrMin = Math.min(left, right);
                int up = row;
                int down = n - row;
                //int udMin = Math.min(up, down);
                int atEveryIndex = origN - Math.min(Math.min(left, up), Math.min(right, down)) ; // (lrMin, udMin);
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        } 
    }
}
