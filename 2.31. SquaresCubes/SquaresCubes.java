

/*

         Exercise:  2.31
         Filename:  SquaresCubes.java
		 
      Description:  write an application that calculates the squares and cubes of
                    the numbers from 0 to 10 and prints the resulting values in table format

           Author:  Eng.Fady Fawzy
          Version:  1.0

          Created:  16/8/2016
    Latest Update:  
         Revision:  30/8/2016

*/

public class SquaresCubes
{
	public static void main( String[] args )
	{
		System.out.println( "Welcome to Table of Squares and Cubes" );
		System.out.println( "number   square   cube" );
		System.out.printf( "%d        %d        %d\n", 0, 0 * 0, 0 * 0 * 0 );
		System.out.printf( "%d        %d        %d\n", 1, 1 * 1, 1 * 1 * 1 );
		System.out.printf( "%d        %d        %d\n", 2, 2 * 2, 2 * 2 * 2 );
		System.out.printf( "%d        %d        %d\n", 3, 3 * 3, 3 * 3 * 3 );
		System.out.printf( "%d        %d       %d\n", 4, 4 * 4, 4 * 4 * 4 );
		System.out.printf( "%d        %d       %d\n", 5, 5 * 5, 5 * 5 * 5 );
		System.out.printf( "%d        %d       %d\n", 6, 6 * 6, 6 * 6 * 6 );
		System.out.printf( "%d        %d       %d\n", 7, 7 * 7, 7 * 7 * 7 );
		System.out.printf( "%d        %d       %d\n", 8, 8 * 8, 8 * 8 * 8 );
		System.out.printf( "%d        %d       %d\n", 9, 9 * 9, 9 * 9 * 9 );
		System.out.printf( "%d       %d      %d\n", 10, 10 * 10, 10 * 10 * 10 );
	}
}