package com.salomi.LLD_.Library.management.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Bookmodel {


    private Long Bookid;
    private Long Memberid;
    private String Name;
    private String Author;
    private String Publishyear;
    private boolean isAvailable = true;

//    public Bookmodel(Long bookid, Long memberid, String name, String author, String publishyear, boolean isAvailable) {
//        Bookid = bookid;
//        Memberid = memberid;
//        Name = name;
//        Author = author;
//        Publishyear = publishyear;
//        this.isAvailable = isAvailable;
//    }

    public Long getBookid() {
        return Bookid;
    }

    public void setBookid(Long bookid) {
        Bookid = bookid;
    }

    public Long getMemberid() {
        return Memberid;
    }

    public void setMemberid(Long memberid) {
        Memberid = memberid;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getPublishyear() {
        return Publishyear;
    }

    public void setPublishyear(String publishyear) {
        Publishyear = publishyear;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Bookmodel{" +
                "Bookid=" + Bookid +
                ", Memberid=" + Memberid +
                ", Name='" + Name + '\'' +
                ", Author='" + Author + '\'' +
                ", Publishyear='" + Publishyear + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
