package com.Mukunafreeman.GymMembership.service;


import com.Mukunafreeman.GymMembership.Domain.Member;
import com.Mukunafreeman.GymMembership.repository.MembersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class MembersServiceImpl implements  MembersService{

    private static MembersServiceImpl service = null;

    @Autowired
    private MembersRepository repository;


    public static MembersServiceImpl  getService(){
        if (service == null) service = new MembersServiceImpl();
        return service;
    }

    @Override
    public List<Member> getAll() {
        return this.repository.findAll();
    }

    @Override
    public Member create(Member member) {
        return this.repository.save(member);
    }

    @Override
    public Member update(Member member)
    {
        return this.repository.save(member);
    }

    @Override
    public void delete(String s)
    {
        this.repository.deleteById(s);
    }

    @Override
    public Member read(String s) {
        Optional<Member> optMem = this.repository.findById(s);
        return optMem.orElse(null);

    }

}
