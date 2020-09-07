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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
  * From the console, the user specifies the number of dogs and names\age\size for as many dogs as he wants (divided by space)
  * An array of dogs is created based on user input. Sort generated array by name, size and age in ascending or descending order.
  * Print out the array after sorting by each field.
 */

public class DogsDemo extends Dog {

    public static void main( String[] args ) throws IOException {

        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        System.out.println("Enter count of dogs: ");
        int count = Integer.parseInt( br.readLine() );

        String name;
        int age;
        String size;

        List<Dog> dogs = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            System.out.println("Enter name: ");
            name = br.readLine();

            System.out.println("Enter age: ");
            age = Integer.parseInt( br.readLine() );

            System.out.println("Enter size: ");
            size = br.readLine();

            Dog dog = new Dog();
            dog.setName( name );
            dog.setAge( age );
            dog.setSize( size );

            dogs.add( dog );
        }

        Collections.sort(dogs, Comparator.comparing(Dog::getName));

        for (Dog dog : dogs) {
            System.out.println(String.format( "Dog %s, age - %s, size - %s",  dog.getName(), dog.getAge(), dog.getSize()));
        }

        Collections.sort(dogs, Comparator.comparing(Dog::getAge));

        for (Dog dog : dogs) {
            System.out.println(String.format( "Dog %s, age - %s, size - %s",  dog.getName(), dog.getAge(), dog.getSize()));
        }

        Collections.sort(dogs, Comparator.comparing(Dog::getSize));

        for (Dog dog : dogs) {
            System.out.println(String.format( "Dog %s, age - %s, size - %s",  dog.getName(), dog.getAge(), dog.getSize()));
        }
    }

}
