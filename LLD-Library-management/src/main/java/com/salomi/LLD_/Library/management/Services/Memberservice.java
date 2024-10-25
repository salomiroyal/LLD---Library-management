package com.salomi.LLD_.Library.management.Services;

import com.salomi.LLD_.Library.management.DAL.MemberDAO;
import com.salomi.LLD_.Library.management.Model.Membermodel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class Memberservice {

    @Autowired
    private MemberDAO memberdao;

    public List<Membermodel> getAllMember() {
        return memberdao.getAllmember();
    }
    public Optional<Membermodel> getMemberById(Long memberid) {
        return memberdao.getMemberById(memberid);
    }
    public Membermodel CreateMember(Membermodel member) {
        return memberdao.CreateMember(member);
    }
    public Long DeleteMember(Long id) {
        return memberdao.DeleteMember(id);
    }
}
