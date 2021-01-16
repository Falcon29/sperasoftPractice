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

package InheritancePolymorphism.Task1;

public class DemoCylinder {

    /**
     *  * Write a demo class with main() method in which create a Circle object and print its parameters and area.
     *  * After that create a Cylinder object and print its parameters, area and volume.
     */

    public static void main( String[] args ) {
        Circle circle = new Circle(14);
        Cylinder cylinder = new Cylinder(circle.getRadius(), 15);

        cylinder.getVolume();
        cylinder.getArea();

        System.out.println( cylinder.toString() );
    }
}
