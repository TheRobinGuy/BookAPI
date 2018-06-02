package com.microservices.bookapi.Services;

import com.microservices.bookapi.Entities.Book;

import org.springframework.data.repository.CrudRepository;

public interface BookService extends CrudRepository<Book, Long> {
}