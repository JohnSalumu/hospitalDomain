package com.Mukunafreeman.GymMembership.controller;

import com.Mukunafreeman.GymMembership.Domain.Member;
import com.Mukunafreeman.GymMembership.service.MembersService;
import com.Mukunafreeman.GymMembership.service.MembersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/member")
public class MembersController {

    @Autowired
    private MembersService service;

    @PostMapping("/create")
    @ResponseBody
    public Member create(@RequestBody Member member) {return service.create(member);}

    @PostMapping("/update")
    @ResponseBody
    public Member update(@RequestBody Member member){return service.update(member);}

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Member read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public List<Member> getAll() {
        return service.getAll();
    }
}
