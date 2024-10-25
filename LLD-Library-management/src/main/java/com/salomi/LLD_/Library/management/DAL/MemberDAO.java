package com.salomi.LLD_.Library.management.DAL;

import com.salomi.LLD_.Library.management.Model.Membermodel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Repository
public class MemberDAO implements MemberIF {

    private HashMap<Long, Membermodel> memberMap = new HashMap<>();
    private Long memberIdCounter = 1L; // For generating unique member IDs


    public List<Membermodel> getAllmember() {
        return new ArrayList<>(memberMap.values());
    }

    public Optional<Membermodel> getMemberById(Long bookId) {
        return Optional.ofNullable(memberMap.get(bookId));
    }


    public Membermodel CreateMember(Membermodel member) {
        if (member.getMemberid() == null) {
            member.setMemberid(memberIdCounter++);
        }
        memberMap.put(member.getMemberid(), member);
        return member;
    }


    public Long DeleteMember(Long memberId) {
        Membermodel removedMember = memberMap.remove(memberId);
        return removedMember != null ? memberId : null;
    }

}
