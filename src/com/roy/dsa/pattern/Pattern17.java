package com.roy.dsa.pattern;

/*
        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
  4 3 2 1 2 3 4
    3 2 1 2 3
      2 1 2
        1
 */
public class Pattern17
{
    public static void main(String[] args)
    {
        int n = 5;

        for(int row = 1; row<= 2*n-1; row++)
        {
            int c = row > n ? 2*n-row : row;
            int spaceLimit = n-c;
            // for space
            for(int s=0; s< spaceLimit; s++)
            {
                System.out.print("  ");
            }
            for(int col = c; col>= 1; col--)
            {
               System.out.print(col +" ");
            }
            for(int col = 2; col<= c; col++)
            {
                System.out.print(col+" ");
            }
            System.out.println();
        } 
    }
}
