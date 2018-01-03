import java.util.Scanner;

/*

         Exercise:  2.15
         Filename:  Arithmetic.java
		 
      Description:  Write an application that asks the user to enter two integers,
                    obtains them from the user and prints their sum, product,
                    difference and quotient (division).

           Author:  Eng.Fady Fawzy
          Version:   1.0

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
       
       int number1, number2;
       
       System.out.print( "Enter first integer: " ); // prompt for input
       number1 = input.nextInt(); // read first number
       
       System.out.print( "Enter second integer: " ); // prompt for input
       number2 = input.nextInt(); // read second number
       System.out.printf( "Sum of your two integers is %d\n", number1 + number2 );
       System.out.printf( "Product of your two integers is %d\n", number1 * number2 );
       System.out.printf( "Difference of your two integers is %d\n", number1 - number2 );
       System.out.printf( "Division of your two integers is %d\n", number1 / number2 );
       System.out.println( "Thank You" );
   } // end method main
} // end class Arithmetic