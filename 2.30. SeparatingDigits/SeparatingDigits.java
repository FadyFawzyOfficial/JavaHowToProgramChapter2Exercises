import java.util.Scanner;

/*

         Exercise:  2.30
         Filename:  SeparatingDigits.java
		 
      Description:  Write an application that inputs one number consisting of five digits from
                    the user, separates the number into its individual digits and prints the digits
                    separated from one another by three spaces each.

           Author:  Eng.Fady Fawzy
          Version:  1.0

          Created:  11/8/2016
    Latest Update:  
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
       int digit1, digit2, digit3, digit4, digit5;
       
       digit1 = number / 10000;
       digit2 = number % 10000 / 1000;
       digit3 = number % 10000 % 1000 / 100;
       digit4 = number % 10000 % 1000 % 100 / 10;
       digit5 = number % 10000 % 1000 % 100 % 10 / 1;
       
       System.out.printf( "%d  %d  %d  %d  %d\n",
               digit1, digit2, digit3, digit4, digit5 );
   } // end method main
} // end class SeparatingDigits