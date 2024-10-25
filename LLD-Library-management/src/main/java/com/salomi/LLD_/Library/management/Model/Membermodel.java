package com.salomi.LLD_.Library.management.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Membermodel {

    private Long memberid;
    private String Name;
    private String contectNo;
    private List<Long> memberborrowed = new ArrayList<>();



    public Long getMemberid() {
        return memberid;
    }

    public void setMemberid(Long memberid) {
        this.memberid = memberid;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getContectNo() {
        return contectNo;
    }

    public void setContectNo(String contectNo) {
        this.contectNo = contectNo;
    }

    public List<Long> getMemberborrowed() {
        return memberborrowed;
    }

    public void setMemberborrowed(List<Long> memberborrowed) {
        this.memberborrowed = memberborrowed;
    }

    @Override
    public String toString() {
        return "Membermodel{" +
                "memberid=" + memberid +
                ", Name='" + Name + '\'' +
                ", contectNo='" + contectNo + '\'' +
                ", memberborrowed=" + memberborrowed +
                '}';
    }
}
