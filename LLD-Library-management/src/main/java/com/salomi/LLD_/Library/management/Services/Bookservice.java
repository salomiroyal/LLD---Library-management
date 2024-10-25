package com.salomi.LLD_.Library.management.Services;

import com.salomi.LLD_.Library.management.DAL.BookDAO;
import com.salomi.LLD_.Library.management.Model.Bookmodel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class Bookservice {

    @Autowired
    private  BookDAO bookdao;

    public List<Bookmodel> getallbook(){
        return bookdao.getAllbook();
    }
    public Optional<Bookmodel> GetBookById(Long bookid) {
        return bookdao.getBookById(bookid);
    }
    public Bookmodel CreateBook(Bookmodel book){
        return bookdao.CreateBook(book);
    }
    public Long DeleteBook(Long bookid ){
        return bookdao.DeleteBook(bookid);
    }
    public List <Bookmodel> GetAvailableBooks() {
        return bookdao.getAllavailablebooks();
    }

}
