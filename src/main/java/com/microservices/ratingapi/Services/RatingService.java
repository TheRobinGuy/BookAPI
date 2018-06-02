package com.microservices.ratingapi.Services;

import com.microservices.bookapi.Entities.Book;

import org.springframework.data.repository.CrudRepository;

public interface RatingService extends CrudRepository<Book, Long> {
}