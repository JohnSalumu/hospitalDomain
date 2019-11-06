package com.Mukunafreeman.GymMembership.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Member {

    @Id
    //@GeneratedValue(strategy= GenerationType.IDENTITY)
    private String membersId;

    private String  name;
    private String surname;
    private String race;


    private Member(){}

    private Member(Builder builder) {
        this.membersId=builder.membersId;
        this.name=builder.name;
        this.surname=builder.surname;
        this.race=builder.race;
    }

    public String getMembersId(){return membersId;}

    public String getName(){return name;}

    public String getSurname(){return surname;}

    public String getRace(){return race;}

    public static  class Builder {

        private String membersId, name, surname, race;

        public Builder membersId(String membersId){
            this.membersId = membersId;
            return this;
        }

        public Builder name(String name){
            this.name = name;
            return  this;
        }

        public Builder surname(String surname){
            this.surname = surname;
            return  this;
        }

        public Builder race(String race){
            this.race = race;
            return  this;
        }


        public Member build(){return new Member(this); }

        public Builder copy(Member member) {
            this.membersId= member.membersId;
            this.name= member.name;
            this.surname= member.surname;
            this.race= member.race;

            return this;
        }
    }

    @Override
    public String toString() {
        return "Member{" +
                "Members Id='" + membersId+ '\'' +
                ",Name ='" + name + '\'' +
                ",Surname ='" + surname + '\'' +
                ",Race ='" + race + '\'' +
                '}';
    }

}
