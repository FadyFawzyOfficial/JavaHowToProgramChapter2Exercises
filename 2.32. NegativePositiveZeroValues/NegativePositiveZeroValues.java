import java.util.Scanner;

/*

         Exercise:  2.32
         Filename:  NegativePositiveZeroValues.java
		 
      Description:  Write a program that inputs five numbers and determines
                    and prints the number of negative numbers input, the number of 
                    positive numbers input and the number of zeros input.

           Author:  Eng.Fady Fawzy
          Version:  1.1

          Created:  16/8/2016
    Latest Update:  30/8/2016
         Revision:  30/8/2016

*/

public class NegativePositiveZeroValues
{
    public static void main( String[] args )
    {
        // create scanner to obtain input from user
        Scanner input = new Scanner( System.in );
        
        int number1, number2, number3, number4, number5;
        int positive = 0;
        int negative = 0;
        int zero = 0;
        
        // Welcome message
        System.out.println( "Welcome to Negative, Positive and Zero Number Determined Program" );
        
        System.out.print( "Please, Enter first integer to determine: " ); //prompt for user
        number1 = input.nextInt(); // read first number
        
        // determine number: Is it negative, positive or zero
        if ( number1 < 0 )
            negative = negative + 1;
        
        if ( number1 == 0 )
            zero = zero +1;
        
        if ( number1 > 0 )
            positive = positive + 1;
        
        System.out.print( "Please, Enter second integer to determine: " ); //prompt for user
        number2 = input.nextInt(); // read second number
        
        // determine number: Is it negative, positive or zero
        if ( number2 < 0 )
            negative = negative + 1;
        
        if ( number2 == 0 )
            zero = zero +1;
        
        if ( number2 > 0 )
            positive = positive + 1;
        
        System.out.print( "Please, Enter third integer to determine: " ); //prompt for user
        number3 = input.nextInt(); // read third number
        
        // determine number: Is it negative, positive or zero
        if ( number3 < 0 )
            negative = negative + 1;
        
        if ( number3 == 0 )
            zero = zero +1;
        
        if ( number3 > 0 )
            positive = positive + 1;
        
        System.out.print( "Please, Enter fourth integer to determine: " ); //prompt for user
        number4 = input.nextInt(); // read fourth number
        
        // determine number: Is it negative, positive or zero
        if ( number4 < 0 )
            negative = negative + 1;
        
        if ( number4 == 0 )
            zero = zero +1;
        
        if ( number4 > 0 )
            positive = positive + 1;
        
        System.out.print( "Please, Enter fifth integer to determine: " ); //prompt for user
        number5 = input.nextInt(); // read fifth number
        
        // determine number: Is it negative, positive or zero
        if ( number5 < 0 )
            negative = negative + 1;
        
        if ( number5 == 0 )
            zero = zero +1;
        
        if ( number5 > 0 )
            positive = positive + 1;
        
        System.out.printf( "number of negative numbers input = %d\n", negative );
        System.out.printf( "number of positive numbers input = %d\n", positive );
        System.out.printf( "number of zeros input = %d\n", zero );
        System.out.println( "Thank You" );
    }
}