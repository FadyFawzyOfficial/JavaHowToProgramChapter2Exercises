import java.util.Scanner;

/*

         Exercise:  2.30
         Filename:  SeparatingDigits.java
		 
      Description:  Write an application that inputs one number consisting of five digits from
                    the user, separates the number into its individual digits and prints the digits
                    separated from one another by three spaces each.

           Author:  Eng.Fady Fawzy
          Version:  1.1

          Created:  11/8/2016
    Latest Update:  30/8/2016
         Revision:  30/8/2016

*/

public class SeparatingDigits
{
    public static void main( String[] args )
    {
        // Create Scanner to obtain input from user
        Scanner input = new Scanner( System.in );
        
        System.out.println( "Welcome to Separating the Digits in an Integer application" );
        System.out.print( "Please, Enter number consisting of five digits: " ); // prompt for input
        int number = input.nextInt();
        
        int x1 = number % 10000;
        int x2 = x1 % 1000;
        int x3 = x2 %100;
        int x4 = x3 %10;
        
        System.out.printf( " %d   %d   %d   %d   %d\n",
                number / 10000, x1 / 1000, x2 / 100, x3 / 10, x4 / 1 );
    } // end method main
} // end class SeparatingDigits