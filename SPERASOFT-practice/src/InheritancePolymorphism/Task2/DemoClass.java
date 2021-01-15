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

package InheritancePolymorphism.Task2;

import java.util.ArrayList;
import java.util.List;

public class DemoClass {

    /**
     * * Write a demo program in which create an array of Shapes and add at least one Circle, Rectangle and Square object in it.
     *  * Iterate through the array elements and for each object:
     *  *
     *  * print object details using toString method;
     *  * print out perimeter or area based on the object class.
     */

    public static void main( String[] args ) {
        List<Shape> shapes = new ArrayList<>();

        shapes.add( new Circle( 1.2, "red", true ) );
        shapes.add( new Rectangle( 2, 3, "green", false ) );
        shapes.add( new Square( 3, "green", true ) );

        for ( Shape shape : shapes ) {
            System.out.println( shape.toString() );
            if ( shape instanceof Circle ) {
                System.out.println( "Circle area = " + ((Circle) shape).getArea() );
            } else if ( shape instanceof Rectangle ) {
                System.out.println( "Rectangle perimeter = " + ((Rectangle) shape).getPerimeter() );
            } else if ( shape instanceof Square ) {
                System.out.println( "Square perimeter = " + ((Square) shape).getPerimeter() );
            }
        }
    }
}
