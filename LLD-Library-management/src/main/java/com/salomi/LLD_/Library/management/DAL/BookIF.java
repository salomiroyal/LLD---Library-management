package com.salomi.LLD_.Library.management.DAL;

import com.salomi.LLD_.Library.management.Model.Bookmodel;

import java.util.List;
import java.util.Optional;

public interface BookIF {

    public List<Bookmodel> getAllbook();
    public Optional<Bookmodel> getBookById(Long bookId);
    public Bookmodel CreateBook(Bookmodel Book);
    public Long DeleteBook(Long bookid);
    public List<Bookmodel> getAllavailablebooks();
}
