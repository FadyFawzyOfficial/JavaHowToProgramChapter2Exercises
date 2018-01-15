import java.util.Scanner;

/*

         Exercise:  2.32
         Filename:  NegativePositiveZeroValues.java
		 
      Description:  Write a program that inputs five numbers and determines
                    and prints the number of negative numbers input, the number of 
                    positive numbers input and the number of zeros input.

           Author:  Eng.Fady Fawzy
          Version:  1.0

          Created:  16/8/2016
    Latest Update:  
         Revision:  30/8/2016

*/

public class NegativePositiveZeroValues
{
   public static void main( String[] args )
   {
       // create scanner to obtain input from user
       Scanner input = new Scanner( System.in );
       
       System.out.println( "Welcome to Negative, positive and Zero Number determined Program" );
       System.out.print( "Please, Enter first integer you want to determine: " );
       int number1 = input.nextInt();
       
       if ( number1 < 0 )
           System.out.printf( "%d is Negative Number\n", number1 );
       
       if ( number1 == 0 )
           System.out.printf( "%d is Zero Number\n", number1 );
       
       if ( number1 > 0 )
           System.out.printf( "%d is Positive Number\n", number1 );
       
       System.out.println( "Thank You" );
   }
}