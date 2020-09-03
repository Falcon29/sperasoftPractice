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

package JavaObjectsBasics.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** Write a separate class ClockDemo:
 *
 * Instantiate a Clock object firstClock using one integer seconds since midnight obtained from the user input;
 * Tick the clock ten times by applying its tick() method and print out the time after each tick.
 * Instantiate a Clock object secondClock by using three integers (hours, minutes, seconds) read from the console.
 * Then tick the clock ten times, printing the time after each tick.
 * Add the secondClock time in firstClock by calling method addClock.
 * Print both clock objects.
 * Get the difference of firstClock and secondClock by calling the method subtractClock() and print it to the console.
 */

public class CLockDemo extends  Clock {

    public static void main( String[] args ) throws IOException {
        Clock firstClock = new Clock(5732);

        for (int i = 0; i < 10; i++) {
            firstClock.tick();
            System.out.println(firstClock.timeInString());
        }

        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        int h = Integer.parseInt( br.readLine() );
        int m = Integer.parseInt( br.readLine() );
        int s = Integer.parseInt( br.readLine() );

        Clock secondClock = new Clock(h, m, s);

        for (int i = 0; i < 10; i++) {
            secondClock.tick();
            System.out.println(secondClock.timeInString());
        }
    }
}
