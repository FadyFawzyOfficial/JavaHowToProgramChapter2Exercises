import java.util.Scanner;

/*

         Exercise:  2.16
         Filename:  ComparingIntegers.java
		 
      Description:  Write an application that asks the user to enter two integers, obtains
                    them from the user and displays the larger number followed by the words
                    "is larger". If the numbers are equal, print the message "These numbers are equal".

           Author:  Eng.Fady Fawzy
          Version:  1.0

          Created:  11/8/2016
    Latest Update:  
         Revision:  30/8/2016

*/

public class ComparingIntegers
{
	public static void main( String[] args )
	{
		// create Scanner to obtain input from user
		Scanner input = new Scanner( System.in );
		
		int number1; // first integer to compare
		int number2; // second integer to compare
		
		System.out.print( "Enter first integer: ");
		number1 = input.nextInt();
		
		System.out.print( "Enter second integer: ");
		number2 = input.nextInt();
		
		if( number1 == number2 )
			System.out.println( "These numbers are equal" );
		
		if ( number1 > number2 )
			System.out.printf( "%d is larger\n", number1 );
		
		if ( number1 < number2 )
			System.out.printf( "%d is larger\n", number2 );
	}
}