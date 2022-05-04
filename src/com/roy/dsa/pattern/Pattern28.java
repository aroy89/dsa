package com.roy.dsa.pattern;

/*
     *
    * *
   * * *
  * * * *
 * * * * *
  * * * *
   * * *
    * *
     *
 */
public class Pattern28
{
    public static void main(String[] args)
    {
        int n = 5;

        for(int row = 1; row< 2*n; row++)
        {
            int totalColsInRow = (row>n) ?  2*n-row : row ;
            int spaceLimit = n-totalColsInRow;
            for(int col=1; col<= spaceLimit; col++)
            {
                System.out.print(" ");
            }

            for(int col2 = 1; col2 <= totalColsInRow; col2++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
