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

public class Square  extends Rectangle {

    public Square() {
        super.length = super.width = 1.0;
    }

    public Square( double side ) {
        super.length = super.width = side;
    }

    public Square( double side, String colour, boolean filled ) {
        super.length = super.width = side;
        super.colour = colour;
        super.filled = filled;
    }

    @Override
    public void setWidth( double width ) {
        this.width = this.length = width;
    }

    @Override
    public void setLength( double length ) {
        this.width = this.length = length;
    }

    @Override
    public String toString() {
        return String.format( "A Square with side = %s, which is a subclass of %s", length,
                Circle.class.getSuperclass().toString() );
    }

}
