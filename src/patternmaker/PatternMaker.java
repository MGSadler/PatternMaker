/* Follow these guidelines:

The program prompts the user for five input values:
1. An integer value for the number of rows to be printed
2. A second integer value for the number of columns to be printed
3. A string value for the starting string of the pattern
4. A string value for the second string of the pattern
5. A string value that separates the first two strings

The program must use nested for loops to print a rectangular array of alternating first
and second strings of the pattern, separated by the separator string and such that the
first string in the first row uses the "first string" provided by the user, but each 
subsequent row alternates the starting string between the "second string" the user 
provided and the "first string" the user provided.

So, for instance, if the user enters 5 for the number of rows, 7 for the number of columns,
and "XX" for the first string, "OO" for the second string, and "***" for the separator, 
your program should print the following rectangular pattern.

XX***OO***XX***OO***XX***OO***XX

OO***XX***OO***XX***OO***XX***OO

XX***OO***XX***OO***XX***OO***XX

OO***XX***OO***XX***OO***XX***OO

XX***OO***XX***OO***XX***OO***XX

Thoughts
Note the requirement for this program to use nested for loops (Horstmann section 4.3).
Note that there is no delimiter at the end of the lines.
The logic needed for the nested for loops is a bit tricky. Try writing out the logic for simple cases (e.g., 2 rows and 3 columns).
 */

package patternmaker;

import java.util.Scanner;

public class PatternMaker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows;
        int columns;
        int x;
        int y;
        String firstString;
        String secondString;
        String separator;
        
        System.out.print("Please enter the number of rows: ");
        rows = input.nextInt();
        System.out.print("Please enter the number of columns: ");
        columns = input.nextInt();
        System.out.print("Please enter the first pattern: ");
        firstString = input.next();
        System.out.print("Please enter the second pattern: ");
        secondString = input.next();
        System.out.print("Please enter the separator pattern: ");
        separator = input.next();
        
        for(x = 0; x < rows; x++) {
            if (x % 2 == 0) {
                System.out.print(firstString);
            }
            else {
                System.out.print(secondString);
            }
            for(y = 1; y < columns; y++){
                if ((x % 2 == 0 && y % 2 == 1)  || (x % 2 == 1 && y % 2 == 0)){
                    System.out.print(separator + secondString);
                }
                else {
                    System.out.print(separator + firstString);
                }
            }
            System.out.println();
        }
    }
}
