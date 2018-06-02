package com.microservices.ratingapi.Entities;

import javax.persistence.Entity;

@Entity(name="REVIEW")
public class Rating {
    private final long id;
    private final long bookId;
    private final int stars;

    public Rating(long id, long bookId, int stars){
        this.id = id;
        this.bookId = bookId;
        this.stars = stars;
    }

    public long getId(){
        return this.id;
    }

    public long getBookId(){
        return this.bookId;
    }


    public int getStars(){
        return this.stars;
    }
}
