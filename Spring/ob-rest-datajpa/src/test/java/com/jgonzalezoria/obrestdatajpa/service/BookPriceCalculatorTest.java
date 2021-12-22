package com.jgonzalezoria.obrestdatajpa.service;

import com.jgonzalezoria.obrestdatajpa.entities.Book;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BookPriceCalculatorTest {

    @Test
    void calculatePriceTest() {

        // configuración de la prueba
        Book book = new Book(1L, "El señor de los anillos", "Author", 1000, 49.99, LocalDate.now(), true);
        BookPriceCalculator calculator = new BookPriceCalculator();

        // se ejecuta el comportamiento a testear
        double price = calculator.calculatePrice(book);
        System.out.println(price);
        // comprobaciones aserciones
        assertTrue(price > 0);
        assertEquals(price, 57.980000000000004);

    }
}