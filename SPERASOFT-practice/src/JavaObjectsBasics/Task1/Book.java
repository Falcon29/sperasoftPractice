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

public class Book {
    String title;
    String author;
    double price;

    public Book( String title, String author, double price ) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void printBook() {
        System.out.println("Book: " + title
                + ", Author: " + author
                + ", Price: " + price);
    }
}
