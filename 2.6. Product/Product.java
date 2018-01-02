import java.util.Scanner;

/*

         Exercise:  2.6
         Filename:  Product.java
		 
      Description:  Using the statements you wrote in Exercise 2.5,
                    write a complete program that calculates and prints the product of three integers.

           Author:  Eng.Fady Fawzy
          Version:  1.0

          Created:  11/8/2016
    Latest Update:  11/8/2016
         Revision:  11/8/2016

*/

public class Product{
    public static void main(String[] args){
        // create Scanner to obtain input from command window
		Scanner input = new Scanner( System.in );
		
		int x; // first number input by user
		int y; // second number input by user
		int z; // third number input by user
		int result; // product of numbers
		
		System.out.print( "Enter first integer: " ); // prompt for input
		x = input.nextInt(); // read first integer
		
		System.out.print( "Enter second integer: " ); // prompt for input
		y = input.nextInt(); // read second integer
		
		System.out.print( "Enter third integer: " ); // prompt for input
		z = input.nextInt(); // read third integer
		
		result = x * y * z; // calculate product of numbers
		
		System.out.printf( "Product is: %d\n", result );    
    } // end method main
} // end class Product