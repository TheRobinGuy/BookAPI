package com.microservices.bookapi.Entities;

import javax.persistence.Entity;

@Entity(name="BOOK")
public class Book {
    private final long id;
    private final String title;
    private final String author;

    public Book(long id, String title, String author){
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public long getId(){
        return this.id;
    }

    public String getTitle(){
        return this.title;
    }


    public String getAuthor(){
        return this.author;
    }
}
