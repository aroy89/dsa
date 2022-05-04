package com.roy.dsa.pattern;

/*
     *
    ***
   *****
  *******
 *********
 */
public class Pattern8
{
    public static void main(String[] args)
    {
        int n = 5;

        for(int row = 0; row< n; row++)
        {
            for(int col = 1; col<= n-row; col++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=2*row+1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
