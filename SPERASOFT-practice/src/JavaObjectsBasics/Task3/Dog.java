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

package JavaObjectsBasics.Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.UUID;

/**
 * Objects Basics Practice #3: Dogs
 * Create class Dog with the following fields:
 *
 * name
 * size (one of 3 options big, small, medium)
 * age 1 to 20
 * The user can specify any or none of the values for name, age or size when creating a new Dog
 * (from the console\file user specifies the number of dogs and names for as many dogs as he wanted (divided by space); Example: '10 Penny Sheldon Leonard').
 *
 * If the name isn't provided, it should be auto-generated;
 * If age isn't provided, it should be auto-generated (1 to 20);
 * If size isn't provided, it should be auto-generated.
 * Write a separate class DogsDemo:
 *
 * From the console, the user specifies the number of dogs and names\age\size for as many dogs as he wants (divided by space)
 * An array of dogs is created based on user input. Sort generated array by name, size and age in ascending or descending order.
 * Print out the array after sorting by each field.
 */

public class Dog {

    private String name;
    private int age;
    private Size size;

    private static final Random RAND = new Random();
    BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

    public void setName( String name ) {
        if (name.isEmpty()) {
            this.name = UUID.randomUUID().toString();
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setSize(String size) {
        this.size = Size.getSizeByString(size);
    }

    public Size getSize() {
        return size;
    }

    public void setAge( String age ) {
        if (age.isEmpty()) {
            this.age = RAND.nextInt(20 - 1 ) + 1;
        } else {
            this.age = Integer.parseInt( age );
        }
    }

    public int getAge() {
        return age;
    }

    enum Size {
        BIG,
        MEDIUM,
        SMALL;

        private static final Size[] VALUES = values();

        public static Size getRandomValue() {
            return VALUES[RAND.nextInt( VALUES.length )];
        }

        public static Size getSizeByString(String size) {
            if (size.isEmpty()
                    || !(size.equalsIgnoreCase( "Big" )
                    || size.equalsIgnoreCase( "Medium" )
                    || size.equalsIgnoreCase( "Small" ))) {
                return Size.getRandomValue();
            } else {
                return Size.valueOf( size );
            }
        }
    }

}
