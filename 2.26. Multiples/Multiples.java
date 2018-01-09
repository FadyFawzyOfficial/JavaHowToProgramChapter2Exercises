import java.util.Scanner; // program uses Scanner

/*

         Exercise:  2.26
         Filename:  Multiples.java
		 
      Description:  Write an application that reads two integers, determines whether the first is a
                    multiple of the second and prints the result.

           Author:  Eng.Fady Fawzy
          Version:  1.0

          Created:  15/8/2016
    Latest Update:  
         Revision:  17/8/2016

*/

public class Multiples 
{
    public static void main( String[] args )
    {
        // create Scanner to obtain input from user
        Scanner input = new Scanner( System.in );
        
        int x; // first integer input by user
        int y; // second integer input by user
        
        System.out.println( "Welcome to Multiples program" ); // Welcome message
        System.out.print( "Please, Enter first integer: " ); // prompt for input
        x = input.nextInt(); // read first number
        
        System.out.print( "Please, Enter second integer: "); // prompt for input
        y = input.nextInt(); // read second number
        
        // determine whether the first is a multiple of the second or not
        if ( x % y == 0 )
        {
            System.out.printf( "%d is a multiple of %d\n", x, y );
            
            int z = x / y;
            
            System.out.printf( "Number of multiples = %d\n", z );
        }
        
        if ( x % y != 0 )
            System.out.printf( "%d is not a multiple of %d\n", x, y );
    }
}