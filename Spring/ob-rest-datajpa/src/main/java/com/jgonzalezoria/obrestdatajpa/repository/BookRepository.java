package com.jgonzalezoria.obrestdatajpa.repository;

import com.jgonzalezoria.obrestdatajpa.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
