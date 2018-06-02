package com.microservices.bookapi.Services;

import com.microservices.bookapi.Entities.Book;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookService extends CrudRepository<Book, Long> {
}