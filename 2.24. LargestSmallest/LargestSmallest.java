import java.util.Scanner;

/*

         Exercise:  2.24
         Filename:  LargestSmallest.java
		 
      Description:  Write an application that reads five integers and determines
                    and prints the largest and smallest integers in the group.

           Author:  Eng.Fady Fawzy
          Version:  1.1

          Created:  15/8/2016
    Latest Update:  30/8/2016
         Revision:  30/8/2016

*/

public class LargestSmallest 
{
   public static void main( String[] args )
   {
       // create Scanner to obtain input from user
       Scanner input = new Scanner( System.in );
       
       int smallest; // variable to compare with user's input and determine smallest
       int largest; // Variable to compare with user's input and determine largest
       int number1, number2, number3, number4, number5; // integers to compare
       
       System.out.println( "Welcome to my program" ); // Welcome message
       System.out.print( "Please, Enter first integer: " ); // prompt for input
       number1 = input.nextInt(); // read first integer
       
       // make first integer as a smallest and largest
           smallest = number1;
           largest = number1;
       
       System.out.print( "Please, Enter second integer: "); // prompt for input
       number2 = input.nextInt(); // read second integer
       
       if ( smallest > number2 )
           smallest = number2;
       
       if ( largest < number2 )
           largest = number2;
       
       System.out.print( "Please, Enter third integer: "); // prompt for input
       number3 = input.nextInt(); // read third integer
       
       // compare third integer with largest and smallest and update vales of them
      if ( smallest > number3 )
           smallest = number3;
       
       if ( largest < number3 )
           largest = number3;
       
       System.out.print( "Please, Enter forth integer: "); // prompt for input
       number4 = input.nextInt(); // read forth integer
       
       // compare forth integer with largest and smallest and update vales of them
       if ( smallest > number4 )
           smallest = number4;
       
       if ( largest < number4 )
           largest = number4;
       
       System.out.print( "Please, Enter fifth integer: "); // prompt for input
       number5 = input.nextInt(); // read fifth integer
       
       // compare fifth integer with largest and smallest and update vales of them
       if ( smallest > number5 )
           smallest = number5;
       
       if ( largest < number5 )
           largest = number5;
       
       if ( largest > smallest )
       { 
       // print smallest and largest integers
           System.out.printf( "%d is the smallest integer\n", smallest );
           System.out.printf( "%d is the largest integer\n", largest );
       }
       
       // if user enter five equal integers
       if ( largest == smallest )
       {
           System.out.println( "Integers you have entered are equal" );
           System.out.printf( "Smallest integer = Largest integer = %d\n", largest );
       }

   } // end method main
} // end class LargestSmallest