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

package JavaObjectsBasics.Task1;

public class BookDemo {
    public static void main( String[] args ) {
        Author author = new Author("Russel", "Winderand");
        Book book = new Book("Developing Java Software", author.printFullName(), 79.75);
        book.printBook();
    }
}
