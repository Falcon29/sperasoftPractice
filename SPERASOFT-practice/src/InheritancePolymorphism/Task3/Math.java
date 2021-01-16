/*
 *
 * =======================================================================
 *
 * Copyright (c) 2009-2021 Sony Network Entertainment International, LLC. All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Sony Network Entertainment International, LLC.
 * You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with
 * Sony Network Entertainment International, LLC.
 *
 * =======================================================================
 *
 * For more information, please see http://www.sony.com/SCA/outline/corporation.shtml
 *
 */

package InheritancePolymorphism.Task3;

/**
 * Objects Basics Practice #3: Math Util
 *
 * Implement custom Math util class (do not use Java Math) with the following methods:
 * min( array ) - return the lowest number in the array;
 * max( array ) - return the biggest number in the array;
 * nextAfter( array, number )- return the first number from the array that is greater than the 'number' parameter
 * ( return 0 if there is no such number )
 * pow( number, number ) - return the value of the first argument raised to the power of the second argument.
 * All methods should accept parameters of at least two types: int and double ( all parameters should be either int or double )
 * Write a demo program to test all the implemented methods for all supported parameter types.
 */

public class Math {

    public static int max( int[] array ) {
        int maxValue = array[0];

        for ( int i = 1; i < array.length; i++ ) {
            if( array[i] > maxValue ){
                maxValue = array[i];
            }
        }

        return maxValue;
    }

    public static double max( double[] array ) {
        double maxValue = array[0];

        for ( int i = 1; i < array.length; i++ ) {
            if( array[i] > maxValue ){
                maxValue = array[i];
            }
        }

        return maxValue;
    }


    public static int min( int[] array ) {
        int minValue = array[0];

        for ( int i = 1; i < array.length; i++ ) {
            if( array[i] < minValue ){
                minValue = array[i];
            }
        }

        return minValue;
    }

    public static double min( double[] array ) {
        double minValue = array[0];

        for ( int i = 1; i < array.length; i++ ) {
            if( array[i] < minValue ){
                minValue = array[i];
            }
        }

        return minValue;
    }

    public static int nextAfter( int[] array, int number ) {
        int greaterNumber = 0;

        for (int i = 0; i < array.length; i++) {
            if ( array[i] > number )
                return array[i];
        }

        return greaterNumber;
    }

    public static double nextAfter( double[] array, double number ) {
        double greaterNumber = 0;

        for (int i = 0; i < array.length; i++) {
            if ( array[i] > number )
                return array[i];
        }

        return greaterNumber;
    }

    public static int pow( int number1, int number2 ) {
        int result = 1;

        for (int i = 0; i < number2; i++) {
            result *= number1;
        }

        return result;
    }

    public static double pow( double number1, double number2 ) {
        double result = 1.0;

        for (int i = 0; i < number2; i++) {
            result *= number1;
        }

        return result;
    }

    public static void main( String[] args ) {
        int[] intArray = {2, 5, 7, 1, 19, 11};
        double[] doubleArray = {2.3, 5.1, 7, 1.9, 1.9, 1.1};

        System.out.println( max( intArray ) );
        System.out.println( max( doubleArray ) );
        System.out.println( min( intArray ) );
        System.out.println( min( doubleArray ) );
        System.out.println( nextAfter( intArray, 4 ) );
        System.out.println( nextAfter( doubleArray, 9.9 ) );
        System.out.println( pow(2, 3) );
        System.out.println( pow(2.1, 5.33) );
    }
}
