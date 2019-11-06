package com.Mukunafreeman.GymMembership.factory;

import com.Mukunafreeman.GymMembership.Domain.Member;

public class MembersFactoy {

    public static Member getMembersDomain(String membersId, String name, String surname, String race){
        return new Member.Builder()
                .membersId(membersId)
                .name(name)
                .surname(surname)
                .race(race)
                .build();
    }
}
