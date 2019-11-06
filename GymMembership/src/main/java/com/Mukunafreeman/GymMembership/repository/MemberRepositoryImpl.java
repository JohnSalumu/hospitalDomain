//package com.Mukunafreeman.GymMembership.repository;
//
//
//import org.springframework.stereotype.Repository;
//
//import java.lang.reflect.Member;
//import java.util.HashSet;
//import java.util.Set;
//
//@Repository("InMemory")
//public class MemberRepositoryImpl implements MembersRepository {
//
//
//    private static MemberRepositoryImpl repository = null;
//    private Set<Member> member;
//
//    private MemberRepositoryImpl(){this.member = new HashSet<>();
//    }
//
//    private Member findMember(final String memberID){
//        return this.member.stream()
//                .filter(member -> member.getName().trim().equals(memberID))
//                .findAny()
//                .orElse(null);
//    }
//
//    public static MemberRepositoryImpl getRepository(){
//        if (repository == null) repository = new MemberRepositoryImpl();
//        return repository;
//    }
//
//    @Override
//    public Set<Member> getAll() {
//        return member;
//    }
//
//    @Override
//    public Member create(Member member) {
//
//        this.member.add(member);
//
//
//        return member;
//    }
//
//    @Override
//    public Member update(Member member) {
//        Member toDelete = findMember(member.getName());
//        if(toDelete != null) {
//            this.member.remove(toDelete);
//            return create(member);
//        }
//        return null;
//    }
//
//
//    @Override
//    public void delete(String s) {
//
//        Member member = findMember(s);
//        if (member != null) this.member.remove(member);
//    }
//
//    @Override
//    public Member read(String s) {
//        Member member=findMember(s);
//        return member;
//    }
//}
