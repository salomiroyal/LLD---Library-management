package com.salomi.LLD_.Library.management.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Borrowmodel {

    private Long id;
    private Long bookid;
    private Long memberid;
    private LocalDate startdate;
    private LocalDate Returndate;

//    public Borrowmodel(Long bookid, Long memberid, LocalDate startdate, LocalDate returndate) {
//        this.bookid = bookid;
//        this.memberid = memberid;
//        this.startdate = startdate;
//        Returndate = returndate;
//    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBookid() {
        return bookid;
    }

    public void setBookid(Long bookid) {
        this.bookid = bookid;
    }

    public Long getMemberid() {
        return memberid;
    }

    public void setMemberid(Long memberid) {
        this.memberid = memberid;
    }

    public LocalDate getStartdate() {
        return startdate;
    }

    public void setStartdate(LocalDate startdate) {
        this.startdate = startdate;
    }

    public LocalDate getReturndate() {
        return Returndate;
    }

    public void setReturndate(LocalDate returndate) {
        Returndate = returndate;
    }

    @Override
    public String toString() {
        return "Borrowmodel{" +
                "bookid=" + bookid +
                ", memberid=" + memberid +
                ", startdate=" + startdate +
                ", Returndate=" + Returndate +
                '}';
    }
}
