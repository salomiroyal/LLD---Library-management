package com.salomi.LLD_.Library.management.DAL;

import com.salomi.LLD_.Library.management.Model.Membermodel;

import java.util.List;
import java.util.Optional;

public interface MemberIF {

    public List<Membermodel> getAllmember();
    public Optional<Membermodel> getMemberById(Long memberid);
    public Membermodel CreateMember(Membermodel Member);
    public Long DeleteMember(Long memberid);

}
