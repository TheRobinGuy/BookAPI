package com.microservices.bookapi.Services;

import java.util.List;
import java.util.Map;
import java.util.List;

import com.microservices.bookapi.Entities.Book;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookService extends CrudRepository<Book, Long> {

	List<Book> findAllBooks();

	Book findBookById(Long bookId);

	Book createBook(Book book);

	void deleteBook(Long bookId);

	Book updateBook(Book book, Long bookId);

	Book updateBook(Map<String, String> updates, Long bookId);
}