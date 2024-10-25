package com.salomi.LLD_.Library.management.Controllers;

import com.salomi.LLD_.Library.management.Model.Bookmodel;
import com.salomi.LLD_.Library.management.Services.Bookservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/books")
public class Bookcontroller {

    @Autowired
    private Bookservice bookService;


    @GetMapping
    public List<Bookmodel> getallBooks() {
        return bookService.getallbook();
    }

    @GetMapping("/{bookId}")
    public Optional<Bookmodel> getBookById(@PathVariable Long bookId) {
        return bookService.GetBookById(bookId);
    }

    @PostMapping
    public Bookmodel createBook(@RequestBody Bookmodel book) {
        return bookService.CreateBook(book);
    }

    @DeleteMapping("/{bookId}")
    public String DeleteBook(@PathVariable Long bookId) {
        bookService.DeleteBook(bookId);
        return "Book deleted successfully.";
    }

    @GetMapping("/available")
    public List<Bookmodel> getAvailableBooks() {
        return bookService.GetAvailableBooks();
    }
}
