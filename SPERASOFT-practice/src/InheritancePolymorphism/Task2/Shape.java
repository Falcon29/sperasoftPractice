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

/**
 * Write a superclass called Shape (as shown in the class diagram), which contains:
 *
 * Fields:
 *
 * colour - String
 * filled - boolean
 * Methods:
 *
 * Two constructors: a no-arg (no-argument) constructor that initializes the colour to "green" and filled to true,
 * and a constructor that initializes the colour and filled to the given values;
 * Getters and setters for all the instance variables;
 * A toString() method that returns "A Shape with the colour of xxx and filled/Not filled".
 * Write two subclasses of Shape called Circle (you may update the Circle class from the previous task) and Rectangle.
 *
 * The Circle class contains:
 *
 * Fields:
 *
 * radius - double
 * Methods:
 *
 * Three constructors: Circle() - init radius to 1.0, Circle( radius ), Circle( radius, colour, filled )
 * Getters/setters;
 * getArea();
 * Override the toString() method, to return "A Circle with radius=xxx, which is a subclass of yyy",
 * where yyy is the output of the toString() method from the superclass
 * The Rectangle class contains:
 *
 * Fields:
 *
 * width  - double
 * length - double
 * Methods:
 *
 * Three constructors:
 * Rectangle() - init width\length to 1.0,
 * Rectangle( width, length),
 * Rectangle( width, length, colour, filled )
 * Getter and setter for all the instance variables.
 * getPerimeter().
 * Override the toString() method inherited, to return "A Rectangle with width=xxx and length=zzz, which is a subclass of yyy", where yyy is the output of the toString() method from the superclass.
 *
 * Write a class called Square, as a subclass of Rectangle. Square has no instance variables but inherits the instance variables width and length from its superclass Rectangle.
 *
 * Methods
 *
 * Provide the appropriate constructors: Square(), Square( side ), Square( side, colour, filled )
 * Override the toString() method to return "A Square with side=xxx, which is a subclass of yyy", where yyy is the output of the toString() method from the superclass.
 * Override the setLength() and setWidth() to change both the width and length, so as to maintain the square geometry.
 * Write a demo program in which create an array of Shapes and add at least one Circle, Rectangle and Square object in it.
 * Iterate through the array elements and for each object:
 *
 * print object details using toString method;
 * print out perimeter or area based on the object class.
 */

public class Shape {
    protected boolean filled;
    protected String colour;

    public Shape() {
        this.colour = "green";
        this.filled = true;
    }

    public Shape( boolean filled, String colour ) {
        this.filled = filled;
        this.colour = colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled( boolean filled ) {
        this.filled = filled;
    }

    public String getColour() {
        return colour;
    }

    public void setColour( String colour ) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return String.format( "A Shape with the colour of %s and %s", colour,
                isFilled() ? "filled" : "not filled");
    }
}
