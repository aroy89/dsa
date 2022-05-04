package com.roy.dsa.pattern;

/*
     *
    **
   ***
  ****
 *****
 */
public class Pattern6
{
    public static void main(String[] args)
    {
        int n = 5;

        for(int row = 1; row<= n; row++)
        {
            int c = n-row;

            for(int col=1; col<=c; col++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=row; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
