package com.roy.dsa.pattern;

/*
 *
 * *
 * * *
 * * * *
 * * * * *
 */
public class Pattern1
{
    public static void main(String[] args)
    {
        int n = 5;
        // for(int row = 0; row<n; row++)
        for(int row = 0; row<=n; row++)
        {
            // for(int col = row +1; col>0; col-- )
            for(int col = 1; col<= row; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
