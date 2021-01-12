/*
 *
 * =======================================================================
 *
 * Copyright (c) 2009-2020 Sony Network Entertainment International, LLC. All rights reserved.
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

package InheritancePolymorphism.Task1;

import static java.lang.Math.PI;

/**
 * Objects Basics Practice #1: Circle & Cylinder
 * Implement Circle class as follows:
 *
 * Fields:
 * radius - double
 * colour - String (or an enum with some predefined colours)
 * Methods:
 *
 * constructors: Circle(), Circle( radius ), Circle( radius, color );
 * getters\setters;
 * getArea();
 * toString() - print Circle parameters in a user-friendly form.
 * Implement Cylinder class inherited from a Circle class:
 *
 * Fields:
 *
 * height - double
 * Methods:
 *
 * constructors: Cylinder(), Cylinder( radius ), Cylinder( radius, height ), Cylinder( radius, height, color )
 * getters\setters;
 * getArea() - should return the surface area (=2π×radius×height + 2×base-area) of the cylinder
 * getVolume() - should return the cylinder volume using getArea() method of the Circle class
 * toString() - print Cylinder parameters in a user-friendly form.
 * Write a demo class with main() method in which create a Circle object and print its parameters and area.
 * After that create a Cylinder object and print its parameters, area and volume.
 */

public class Cylinder extends Circle {
    protected double height;

    public Cylinder() {}

    public Cylinder(double radius) {
        this.radius = radius;
    }

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public Cylinder(double radius, double height, String colour) {
        this.radius = radius;
        this.height = height;
        this.colour = colour;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight( double height ) {
        this.height = height;
    }

    public double getArea() {
        return 2*PI*radius*radius + 2*PI*height*radius;
    }

    public double getVolume() {
        return  getArea() * height;
    }

    @Override
    public String toString() {
        return String.format( "Area: %s, Volume: %s", getArea(), getVolume() );
    }
}
