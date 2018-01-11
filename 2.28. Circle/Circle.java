import java.util.Scanner;

/*

         Exercise:  2.28
         Filename:  Circle.java
		 
      Description:  Write an application that inputs from the user the radius of a circle
                    as an integer and prints the circle’s diameter, circumference and 
                    area using the floating-point value 3.14159 for π.

           Author:  Eng.Fady Fawzy
          Version:  1.0

          Created:  20/8/2016
    Latest Update:  
         Revision:  20/8/2016

*/

public class Circle 
{
    public static void main( String[] args )
    {
        // Create Scanner to obtain input from user
        Scanner input = new Scanner ( System.in );
        
        System.out.println( "Welcome to Circle program" ); // Welcome message
        System.out.print( "Please, Enter the radius of a circle ( as integer ) : " ); // prompt for input
        int r = input.nextInt(); // read circle's radius
        
        System.out.printf( "Circle's diameter = %d \n", 2 * r ); // print diameter
        System.out.printf( "Circle's circumference = %f\n", 2 * Math.PI * r ); // print circumference
        System.out.printf( "Circle's area = %f\n", Math.PI * r * r ); // print area
        System.out.println( "Thank You" );
        
    } // end method main
} // end class Circle