package com.example.springbootbackend.controller;

import com.example.springbootbackend.model.Book;
import com.example.springbootbackend.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    // Get All books
    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

}
