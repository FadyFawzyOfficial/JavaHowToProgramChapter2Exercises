import java.util.Scanner;

/*

         Exercise:  2.15
         Filename:  Arithmetic.java
		 
      Description:  Write an application that asks the user to enter two integers,
                    obtains them from the user and prints their sum, product,
                    difference and quotient (division).

           Author:  Eng.Fady Fawzy
          Version:   1.1

          Created:  11/8/2016
    Latest Update:  11/8/2016
         Revision:  30/8/2016

*/

public class Arithmetic
{
    public static void main( String[] args )
    {
        // create Scanner to obtain input from user
        Scanner input = new Scanner( System.in );
        
        int x; // first integer
        int y; // second integer
        int sum; // sum of these integers
        int product; // product of these integers
        int difference; // difference of these integers
        int division; // division of these integers
        
        System.out.print( "Enter first integer: " ); // prompt for input
        x = input.nextInt(); // read first number
        
        System.out.print( "Enter second integer: " ); // prompt for input
        y = input.nextInt(); // read second number
        
        sum = x + y; // calculate sum of numbers
        product = x * y; // calculate product of numbers
        difference = x - y; // calculate difference of numbers
        
        System.out.printf( "Sum of your two integers is %d\n", sum );
        System.out.printf( "Product of your two integers is %d\n", product );
        System.out.printf( "Difference of your two integers is %d\n", difference );
        
         if ( y != 0 )
        {
            division = x / y; // calculate division of numbers
            System.out.printf( "Division of your two integers is %d\n", division );
        }
        
        if ( y == 0 )
            System.out.println( "You can't make division by zero" );
        
        System.out.println( "Thank You" );
    } // end method main
} //