package com.example.springmongodb;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @GetMapping("/books")
    public List<My_Book> getBooks() {
        return bookRepository.findAll();
    }

    @PostMapping(value = "/insertBook")
    public void addBook(@RequestBody CreateRequest request) {
        My_Book myBook = new My_Book(request.getName(), request.getAuthor(), request.getCost());
        bookRepository.save(myBook);
    }

    @GetMapping("/getBooksByAuthor")
    public List<My_Book> getBooksByAuthor(@RequestParam(value= "name") String name) {
        return bookRepository.findByAuthor(name);
    }
}
