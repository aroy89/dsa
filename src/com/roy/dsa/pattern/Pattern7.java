package com.roy.dsa.pattern;

/*
 *****
  ****
   ***
    **
     *
 */
public class Pattern7
{
    public static void main(String[] args)
    {
        int n = 5;

        for(int row = 1; row<= n; row++)
        {
            int c = n - row+1;
            for(int j=1; j<row; j++)
            {
                System.out.print(" ");
            }
            for(int col=1; col<=c; col++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
