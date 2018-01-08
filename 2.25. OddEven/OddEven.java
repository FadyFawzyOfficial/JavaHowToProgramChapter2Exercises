import java.util.Scanner; // program uses Scanner

/*

         Exercise:  2.25
         Filename:  OddEven.java
		 
      Description:  Write an application that reads an integer and determines 
                    and prints whether it’s odd or even.

           Author:  Eng.Fady Fawzy
          Version:  1.0

          Created:  15/8/2016
    Latest Update:  
         Revision:  30/8/2016

*/

public class OddEven
{
	public static void main( String[] args )
	{
		// create Scanner to obtain input from user
		Scanner input = new Scanner( System.in );
		
		int x; // integer that user will be entered
		
		System.out.print( "Please, Enter an integer: " ); // prompt for input
		x = input.nextInt(); // read an integer
		
		// user can enter Zero value that not odd or even
		if ( x == 0 )
			System.out.println( "Your integer isn't odd or even because it is zero" );
		
		// determine the integer is odd or even
        if ( x != 0 )
		{
			if ( x % 2 == 1 ) // odd number equal 1 when remainder by 2
				System.out.printf( "%d is an odd integer\n", x );
		    if ( x % 2 == 0 ) // even number equal 0 when remainder by 2
			    System.out.printf( "%d is an even integer\n", x );
		}
	} // end method main
} // end class OddEven