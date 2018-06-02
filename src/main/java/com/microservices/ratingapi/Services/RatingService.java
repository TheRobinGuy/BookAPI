package com.microservices.ratingapi.Services;

import java.util.List;
import java.util.Map;

import com.microservices.bookapi.Entities.Book;
import com.microservices.ratingapi.Entities.Rating;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingService extends CrudRepository<Book, Long> {

	List<Rating> findAllRatings();

	List<Rating> findRatingsByBookId(Long bookId);

	Rating createRating(Rating rating);

	void deleteRating(Long ratingId);

	Rating updateRating(Rating rating, Long ratingId);

	Rating updateRating(Map<String, String> updates, Long ratingId);
}