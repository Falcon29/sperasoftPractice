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

public class Circle {
    protected double radius;
    protected String colour;

    public Circle() {}

    public Circle( double radius ) {
        this.radius = radius;
    }

    public Circle( double radius, String colour ) {
        this.radius = radius;
        this.colour = colour;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius( double radius ) {
        this.radius = radius;
    }

    public String getColour() {
        return colour;
    }

    public void setColour( String colour ) {
        this.colour = colour;
    }

    /**
     *  * getArea();
     *  * toString() - print Circle parameters in a user-friendly form.
     */

    public double getArea() {
        return PI*Math.pow( radius, 2 );
    }

    @Override
    public String toString() {
        return String.format("");
    }


}
