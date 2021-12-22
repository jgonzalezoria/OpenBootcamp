package com.jgonzalezoria.obrestdatajpa.service;

import com.jgonzalezoria.obrestdatajpa.entities.Book;

public class BookPriceCalculator {

    public double calculatePrice(Book book){
        double price = book.getPrice();

        if(book.getPages() > 300){
            price += 5;
        }
        // envío
        price += 2.99;
        return price;
    }

}
