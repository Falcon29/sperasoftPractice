import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

    public static void main( String[] args ) throws IOException {
        int ant = fourArgs(222, 51, 111, 313);
        System.out.println(ant);
        
        arrayGenerator();
        arraySort();
    }

    /* Practice #1 */

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

    /* Practice #2 */

    public static void arrayGenerator() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader( System.in ) );
        int size = Integer.parseInt(bufferedReader.readLine());
        int index = Integer.parseInt(bufferedReader.readLine());

        int arraj[] = new int[size];

        for ( int i = 0; i < arraj.length; i++ ) {
            arraj[i] = (int) Math.round(Math.random() * 999);
        }

        for ( Integer j : arraj ) {
            if (j == index) {
                System.out.println("true");
                break;
            } else {
                System.out.println("false");
                break;
            }
        }
    }

    /* Practice #3 */

    public static void arraySort() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader( System.in ) );
        int size1 = Integer.parseInt(bufferedReader.readLine());
        int size2 = Integer.parseInt(bufferedReader.readLine());

        int arr1[] = new int[size1];
        int arr2[] = new int[size2];

        for ( int i = 0; i < arr1.length; i++ ) {
            arr1[i] = (int) Math.round(Math.random() * 999);
        }

        for ( int j = 0; j < arr2.length; j++ ) {
            arr2[j] = (int) Math.round(Math.random() * 999);
        }

        //bubble sort arr1
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length - i - 1; j++) {
                if ( arr1[j] > arr1[j + 1]) {
                    int temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }
        }

        //insertion sort arr2
        for ( int i = 1; i < arr2.length; i++ ) {
            int current = arr2[i];
            int j = i - 1;

            while( j >= 0 && current < arr2[j] ) {
                arr2[j + 1] = arr2[j];
                j--;
            }

            arr2[j+1] = current;
        }

        for (Integer i : arr1) {
            System.out.print(i + ", ");
        }

        System.out.println();

        for (Integer j : arr2) {
            System.out.print(j + ", ");
        }
    }
}
