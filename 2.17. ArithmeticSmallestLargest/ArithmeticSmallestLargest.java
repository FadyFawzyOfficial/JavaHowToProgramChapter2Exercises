import java.util.Scanner;

/*

         Exercise:  2.17
         Filename:  ArithmeticSmallestLargest.java
		 
      Description:  Write an application that inputs three integers from the
                    user and displays the sum, average, product, smallest 
                    and largest of the numbers.

           Author:  Eng.Fady Fawzy
          Version:  1.1

          Created:  15/8/2016
    Latest Update:  30/8/2016
         Revision:  30/8/2016

*/

public class ArithmeticSmallestLargest
{
   public static void main( String[] args )
   {
       //create Scanner to obtain input from user
       Scanner input = new Scanner( System.in );
       
       int number1, number2, number3; // three integers
       int sum;
       int average;
       int product;
       
       System.out.print( "Enter first integer: " ); // prompt for input
       number1 = input.nextInt(); // read first number
       
       System.out.print( "Enter second integer: " ); // prompt for input
       number2 = input.nextInt(); // read second number
       
       System.out.print( "Enter third integer: " ); // prompt for input
       number3 = input.nextInt(); // read third number
       
       sum = number1 + number2 + number3;
       product = number1 * number2 * number3;
       average = sum / 3;
       
       System.out.printf( "Sum of these numbers is: %d\n", sum );
       System.out.printf( "Product of these numbers is: %d\n", product );
       System.out.printf( "Average of these numbers is: %d\n", average );
       
       int largest, smallest;
       largest = number1;
       smallest = number2;
       
       if ( number1 <= number2 )
       {
           largest = number2;
           smallest = number1;
       }
       
       if ( number3 > largest )
           largest = number3;
           
       if ( number3 < smallest)
           smallest = number3;
       
       System.out.printf( "Smallest number is: %d\n", smallest);
       System.out.printf( "Largest number is: %d\n", largest);
   }
}