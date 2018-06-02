package com.microservices.ratingapi.Services;

import com.microservices.bookapi.Entities.Book;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingService extends CrudRepository<Book, Long> {
}