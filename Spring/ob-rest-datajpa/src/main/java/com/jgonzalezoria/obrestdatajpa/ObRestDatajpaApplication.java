package com.jgonzalezoria.obrestdatajpa;

import com.jgonzalezoria.obrestdatajpa.entities.Book;
import com.jgonzalezoria.obrestdatajpa.repository.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class ObRestDatajpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ObRestDatajpaApplication.class, args);
		BookRepository repository = context.getBean(BookRepository.class);

		// CRUD
		// crear un libro
		Book book1 = new Book(null, "Homo Deus", "Yuval Noah", 450, 29.99, LocalDate.of(2018, 12, 1), true);
		Book book2 = new Book(null, "Homo Sapiens", "Yuval Noah", 450, 19.99, LocalDate.of(2013, 12, 1), true);

		// alamacenar un libro
		System.out.println("Número de libros en base de datos: " + repository.findAll().size());
		repository.save(book1);
		repository.save(book2);

		// recuperar todos los libros
		System.out.println("Número de libros en base de datos: " + repository.findAll().size());

		// borrar un libro
		// repository.deleteById(1L);
		System.out.println("Número de libros en base de datos: " + repository.findAll().size());

	}

}
