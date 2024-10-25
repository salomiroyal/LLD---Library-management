package com.salomi.LLD_.Library.management.Services;

import com.salomi.LLD_.Library.management.Model.Bookmodel;
import com.salomi.LLD_.Library.management.Model.Membermodel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class Borrowservice {

    @Autowired
    private Bookservice bookservice;

    @Autowired
    private Memberservice memberservice;


    public String borrowBook(Long memberId, Long bookId) {
        Optional<Membermodel> memberOpt = memberservice.getMemberById(memberId);
        Optional<Bookmodel> bookOpt = bookservice.GetBookById(bookId);

            if (memberOpt.isPresent() && bookOpt.isPresent()) {
                 Bookmodel book = bookOpt.get();
                  Membermodel member = memberOpt.get();


            if (book.isAvailable()) {
                book.setAvailable(false);
                LocalDate borrowDate = LocalDate.now();
                LocalDate returnDate = borrowDate.plusDays(14); // Example: 2 weeks to return

                member.getMemberborrowed().add(bookId);

                return "Book borrowed successfully!";
            } else {
                return "Book is currently unavailable.";
            }
        }
             return "Member or Book not found.";
    }
    public String returnBook(Long memberId, Long bookId) {
        Optional<Membermodel> memberOpt = memberservice.getMemberById(memberId);
        Optional<Bookmodel> bookOpt = bookservice.GetBookById(bookId);

        if (memberOpt.isPresent() && bookOpt.isPresent()) {
            Bookmodel book = bookOpt.get();
            Membermodel member = memberOpt.get();


            if (member.getMemberborrowed().contains(bookId)) {
                book.setAvailable(true);
                member.getMemberborrowed().remove(bookId);
                LocalDate returnDate = LocalDate.now();
                return "Book returned successfully!";
            } else {
                return "This book was not borrowed by the member.";
            }
        }

        return "not avilable.";
    }
}
