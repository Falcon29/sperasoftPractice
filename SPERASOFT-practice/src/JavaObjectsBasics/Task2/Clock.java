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

/**
 * Objects Basics Practice #2: Clock
 * Writ class Clock for dealing with the daytime represented by hours, minutes, and seconds. Your class must have the following features:
 *
 * Fileds:
 *
 * hours (range 0 - 23)
 * minutes (range 0 - 59)
 * seconds (range 0 - 59)
 *
 * Three constructors:
 * default (with no parameters passed; it should initialize the represented time to 12:0:0)
 * a constructor with three parameters: hours, minutes, and seconds.
 * a constructor with one parameter: the value of time in seconds since midnight (it should be converted into the time value in hours, minutes, and seconds)
 *
 * Instance methods:
 * a set-method method setClock() with one parameter seconds since midnight (to be converted into the time value in hours, minutes, and seconds as above)
 * method tick() with no parameters that increments the time stored in a Clock object by one second;
 * method addClock() accepting an object of type Clock as a parameter. The method should add the time represented
 *  by the parameter class to the time represented in the current class;
 * method to return a String representation of the Clock object in the form "(hh:mm:ss)", for example "(03:02:34)"
 * Add an instance method tickDown() which decrements the time stored in a Clock object by one second;
 * Add an instance method subtractClock() that takes one Clock parameter and returns the difference between the time represented in the current
 *  Clock object and the one represented by the Clock parameter. The difference of time should be returned as a Clock object.
 *
 * Write a separate class ClockDemo:
 *
 * Instantiate a Clock object firstClock using one integer seconds since midnight obtained from the user input;
 * Tick the clock ten times by applying its tick() method and print out the time after each tick.
 * Instantiate a Clock object secondClock by using three integers (hours, minutes, seconds) read from the console.
 * Then tick the clock ten times, printing the time after each tick.
 * Add the secondClock time in firstClock by calling method addClock.
 * Print both clock objects.
 * Get the difference of firstClock and secondClock by calling the method subtractClock() and print it to the console.
 */

public class Clock {
    private int hour;
    private int min;
    private int sec;

    public int getHour() {
        return hour;
    }

    public int getMin() {
        return min;
    }

    public int getSec() {
        return sec;
    }

    public Clock() {
        hour = 12;
        min = 0;
        sec = 0;
    }

    public Clock( int hour, int min, int sec ) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public Clock( int secondsSinceMidnight ) {
        setClock( secondsSinceMidnight );
    }

    public void addClock(Clock clock) {
        this.hour += clock.getHour();
        this.min += clock.getMin();
        this.sec += clock.getSec();
    }
    
    public void setClock( int secondsSinceMidnight ) {
        hour = secondsSinceMidnight / 3600;
        min = secondsSinceMidnight / 60 % 60;
        sec = secondsSinceMidnight % 60;
    }

    public void tick() {
        sec++;

        if (sec > 59) {
            sec = 0;
            min++;

            if (min > 59) {
                min = 0;
                sec = 0;
                hour++;

                if (hour > 23) {
                    hour = 0;
                    min = 0;
                    sec = 0;
                }
            }
        }
    }

    public void tickDown() {
        sec--;

        if (sec < 0) {
            sec = 59;
            min--;

            if (min < 0) {
                sec = 59;
                min = 59;
                hour--;

                if (hour < 0) {
                    sec = 59;
                    min = 59;
                    hour = 23;
                }
            }
        }
    }

    public Clock subtractClock(Clock clock) {
        Clock newClock = new Clock();

        newClock.hour -= clock.getHour();
        newClock.min -= clock.getMin();
        newClock.sec -= clock.getSec();
        
        return newClock;
    }

    public String timeInString() {
        return String.format( "%02d:%02d:%02d", hour, min, sec );
    }
}
