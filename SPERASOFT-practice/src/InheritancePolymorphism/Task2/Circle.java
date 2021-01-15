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

import static java.lang.Math.PI;

public class Circle extends Shape {
    protected double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle( double radius ) {
        this.radius = radius;
    }

    public Circle( double radius, String colour, boolean filled ) {
        this.radius = radius;
        super.colour = colour;
        super.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius( double radius ) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * Math.pow( radius, 2 );
    }

    @Override
    public String toString() {
        return String.format( "A Circle with radius = %s, which is a subclass of %s", radius,
                Circle.class.getSuperclass().toString() );
    }
}
