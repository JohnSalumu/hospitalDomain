package com.Mukunafreeman.GymMembership.service;


import com.Mukunafreeman.GymMembership.Domain.Member;

import java.util.List;
import java.util.Set;

public interface MembersService extends IService<Member, String>  {
    List<Member> getAll();
}
