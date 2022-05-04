package com.roy.dsa.pattern;

/*
            1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5
 */
public class Pattern30
{
    public static void main(String[] args)
    {
        int n = 5;

        for(int row = 1; row<= n; row++)
        {
            // for space
            for(int s=0; s<n-row; s++)
            {
                System.out.print("  ");
            }
           for(int col = row; col>= 1; col--)
           {
               System.out.print(col +" ");
           }
            for(int col = 2; col<= row; col++)
            {
                System.out.print(col+" ");
            }
            System.out.println();
        } 
    }
}
