package com.salomi.LLD_.Library.management.DAL;

import com.salomi.LLD_.Library.management.Model.Bookmodel;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Repository
public class BookDAO implements BookIF {
    private HashMap<Long, Bookmodel> bookMap = new HashMap<>();
    private Long bookIdCounter = 1L; // For generating unique book IDs

    public List<Bookmodel> getAllbook() {
        return new ArrayList<>(bookMap.values());
    }
    public Optional<Bookmodel> getBookById(Long bookId) {
        return Optional.ofNullable(bookMap.get(bookId));
    }

    public Bookmodel CreateBook(Bookmodel book) {
        if (book.getBookid() == null) {
            book.setBookid(bookIdCounter++);
        }
        bookMap.put(book.getBookid(), book);
        return book;
    }


    public Long DeleteBook(Long bookId) {
        Bookmodel removedBook = bookMap.remove(bookId);
        return removedBook != null ? bookId : null;
    }

    public List<Bookmodel> getAllavailablebooks() {
        List<Bookmodel> availableBooks = new ArrayList<>();
        for (Bookmodel book : bookMap.values()) {
            if (book.isAvailable()) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }

}
