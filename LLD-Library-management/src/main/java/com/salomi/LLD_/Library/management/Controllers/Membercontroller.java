package com.salomi.LLD_.Library.management.Controllers;
import com.salomi.LLD_.Library.management.Model.Membermodel;
import com.salomi.LLD_.Library.management.Services.Memberservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/member")
public class Membercontroller {

    @Autowired
    private Memberservice memberservice;

    @GetMapping
    public List<Membermodel> getAllMember() {
        return memberservice.getAllMember();
    }

    @GetMapping("/{memberId}")
    public Optional<Membermodel> getMemberById(@PathVariable Long memberId) {
        return memberservice.getMemberById(memberId);
    }

    @PostMapping
    public Membermodel createMember(@RequestBody Membermodel member) {
        return memberservice.CreateMember(member);
    }

    @DeleteMapping("/{memberId}")
    public String DeleteMember(@PathVariable Long memberId) {
        memberservice.DeleteMember(memberId);
        return "member deleted successfully.";
    }


}
