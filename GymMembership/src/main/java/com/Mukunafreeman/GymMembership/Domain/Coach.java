//package com.Mukunafreeman.GymMembership.Domain;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//
//@Entity
//public class Coach {
//
//    @Id
//    private String coachId;
//
//    private String  name;
//    private String surname;
//    private String race;
//
//    public  Coach(){}
//
//    private Coach(Builder builder) {
//        this.coachId=builder.coachId;
//        this.name=builder.name;
//        this.surname=builder.surname;
//        this.race=builder.race;
//    }
//
//    public String getCoachId(){return coachId;}
//
//    public String getName(){return name;}
//
//    public String getSurname(){return surname;}
//
//    public String getRace(){return race;}
//
//    public static  class Builder {
//
//        private String coachId, name, surname, race;
//
//        public Builder coachId(String coachId){
//            this.coachId = coachId;
//            return this;
//        }
//
//        public Builder name(String name){
//            this.name = name;
//            return  this;
//        }
//
//        public Builder surname(String surname){
//            this.surname = surname;
//            return  this;
//        }
//
//        public Builder race(String race){
//            this.race = race;
//            return  this;
//        }
//
//        public Coach build(){return new Coach(this); }
//
//        public Builder copy(Coach coach) {
//
//            this.coachId= coach.coachId;
//            this.name= coach.name;
//            this.surname= coach.surname;
//            this.race= coach.race;
//
//            return this;
//        }
//    }
//    @Override
//    public String toString() {
//        return "Coach{" +
//                "coachId Id='" +  + '\'' +
//                ",Name ='" +   + '\'' +
//                ",Surname ='" +   + '\'' +
//                ",Race ='" +   + '\'' +
//                '}';
//    }
//
//
//}
