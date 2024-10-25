package com.salomi.LLD_.Library.management.Controllers;

import com.salomi.LLD_.Library.management.Services.Borrowservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books")
public class Borrowcontroller {

    @Autowired
    private Borrowservice borrowService;

    @PostMapping("/borrow/{memberId}/{bookId}")
    public String borrowBook(@PathVariable Long memberId, @PathVariable Long bookId) {
        return borrowService.borrowBook(memberId, bookId);
    }

    @PostMapping("/return/{memberId}/{bookId}")
    public String returnBook(@PathVariable Long memberId, @PathVariable Long bookId) {
        return borrowService.returnBook(memberId, bookId);
    }
}
