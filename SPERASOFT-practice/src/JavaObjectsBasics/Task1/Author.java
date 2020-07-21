package JavaObjectsBasics.Task1;/*
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

/**
 * Objects Basics Practice #1: Author & Book
 * Write class Author with the following features:
 *
 * Fields:
 *
 * firstName
 * lastName
 * Constructor to initialize Author class fields.
 * Method to print out author’s full name in the console.
 *
 * Write class Book with the following features:
 *
 * Fileds:
 *
 * title for the title of the book;
 * author of type Author;
 * price for the book price of type double.
 * Constructor to initialize Book class fields.
 * Method to print out book’s details to the screen
 * Write a separate class BookDemo with a main() method creates a Book titled “Developing Java Software” with authors Russel Winderand price 79.75. Prints the Book’s details to the console.

 */

public class Author {
    String firstName;
    String lastName;

    public Author( String firstName, String lastName ) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String printFullName() {
        return firstName + " " + lastName;
    }
}
