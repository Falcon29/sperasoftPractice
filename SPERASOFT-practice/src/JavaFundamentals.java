/**

 * Java Fundamentals Practice #1: Find the minimum
 * Create the following methods:

 * the method that takes 2 integer arguments and returns the lowest;
 * the method that takes 3 integer arguments and returns the lowest (using the first method);
 * the method that takes 4 integer arguments and returns the lowest (using the previous method)

 * Java Fundamentals Practice #2: Search for an element in the array

 * Implement a program that takes 2 integer numbers from the console:

 * array size;
 * a number to search in the array.
 * Generate a random array of integers of provided size and print it. Verify if the provided element
    is present in the array. If it does print true otherwise print false.

 * Use several search algorithms. For example:

 * regular search one by one;
 * binary search.
 * Compare execution time for each algorithm.


 * Java Fundamentals Practice #3: Sort array
 * Sort random array (number of arguments should be taken from in the console) of integer numbers using at least
    2 of the following sort algorithms:

 * bubble sort;
 * optimized bubble sort;
 * insertion sort;
 * selection sort.


 * Java Fundamentals Practice #4: Count element occurrences in a String

 * Implement a program that requests an input of 1 symbol form the consoles and counts a number occurrences
    of this symbol in a pre-created text and prints it to the console. The text may be hard-coded as a String in your code.

 */

public class JavaFundamentals {

    public static void main( String[] args ) {
        int ant = fourArgs(222, 51, 111, 313);
        System.out.println(ant);
    }

    public static int twoArgs(int arg1, int arg2) {
        return arg1 < arg2 ? arg1 : arg2;
    }

    public static int threeArgs(int arg1, int arg2, int arg3) {
        int arg = twoArgs( arg1, arg2 );
        return arg < arg3 ? arg : arg3;
    }

    public static int fourArgs(int arg1, int arg2, int arg3, int arg4) {
        int arg = threeArgs( arg1, arg2, arg3 );
        return arg < arg4 ? arg : arg4;
    }

}
