package com.Mukunafreeman.GymMembership.repository;

import com.Mukunafreeman.GymMembership.Domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface MembersRepository extends JpaRepository<Member, String> {



}
