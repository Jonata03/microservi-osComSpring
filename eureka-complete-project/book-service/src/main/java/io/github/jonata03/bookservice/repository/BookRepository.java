package io.github.jonata03.bookservice.repository;

import io.github.jonata03.bookservice.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
