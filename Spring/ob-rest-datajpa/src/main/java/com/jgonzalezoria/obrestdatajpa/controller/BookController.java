package com.jgonzalezoria.obrestdatajpa.controller;

import com.jgonzalezoria.obrestdatajpa.entities.Book;
import com.jgonzalezoria.obrestdatajpa.repository.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    private final Logger log = LoggerFactory.getLogger(BookController.class);

    // atributos
    private BookRepository bookRepository;

    // constructores

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    // CRUD sobre la entidad Book

    // Buscar todos los libros (lista libros)

    /**
     * http://localhost:8080/api/books
     * @return
     */
    @GetMapping("/api/books")
    public List<Book> findAll(){
        // recuperar y devolver los libros de base de datos
        return bookRepository.findAll();
    }

    /**
     * Request
     * Response
     * @param id
     * @return
     */


    // Buscar un solo libro en base de datos según su id
    @GetMapping("/api/books/{id}")
    public ResponseEntity<Book> findOneById(@PathVariable Long id){
        Optional<Book> bookOpt = bookRepository.findById(id);
        // opcion 1
        if(bookOpt.isPresent()){
            return ResponseEntity.ok(bookOpt.get());
        }
        else{
            return ResponseEntity.notFound().build();
        }

        // opcion 2
        //return bookOpt.orElse(null);
    }


    // Crear un libro nuevo en base de datos

    /**
     * Método POST, no colisiona con findAll porque son diferentes métodos HTTP: GET vs. POST
     * @param book
     * @param headers
     * @return
     */
    @PostMapping("/api/books")
    public ResponseEntity<Book> create(@RequestBody Book book, @RequestHeader HttpHeaders headers){
        System.out.println(headers.get("User-Agent"));
        // guardar el libro recibido por parámetro en la base de datos
        if(book.getId() != null){
            log.warn("trying to create a book with id");
            System.out.println("trying to create a book with id");
            return ResponseEntity.badRequest().build();
        }
        Book result = bookRepository.save(book);
        return ResponseEntity.ok(result); // el libro devuelto tiene la clave primaria
    }

    // Actualizar un libro existente en base de datos
    @PutMapping("/api/books")
    public ResponseEntity<Book> update(@RequestBody Book book){
        if(book.getId() == null){ // si no tiene id quiere decir que es una creación
            log.warn("trying to update a non existent book");
            return ResponseEntity.badRequest().build();

        }
        if(!bookRepository.existsById(book.getId())){
            log.warn("trying to update a non existent book");
            return ResponseEntity.notFound().build();
        }
        // El proceso de actualización
        Book result = bookRepository.save(book);
        return ResponseEntity.ok(result);
    }

    // Borrar un libro en base de datos
    @DeleteMapping("/api/books/{id}")
    public ResponseEntity<Book> delete(@PathVariable Long id){
        if(!bookRepository.existsById(id)){
            log.warn("trying to delete a non existent book");
            return ResponseEntity.notFound().build();
        }
        bookRepository.deleteById(id);

        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/api/books")
    public ResponseEntity<Book> deleteAll(){
        log.info("REST request for delete all books");
        bookRepository.deleteAll();
        return ResponseEntity.noContent().build();
    }

}
