package com.example.springmongodb;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BookRepository extends MongoRepository<My_Book, Integer> {

    public List<My_Book> findByAuthor(String name);
}
