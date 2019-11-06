//package com.Mukunafreeman.GymMembership.Domain;
//
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//
//@Entity
//public class Technician {
//
//    @Id
//    private String technId;
//
//    private String  name;
//    private String surname;
//    private String race;
//
//    public  Technician(){}
//
//
//    private Technician(Builder builder){
//        this.technId=builder.technId;
//        this.name=builder.name;
//        this.surname=builder.surname;
//        this.race=builder.race;
//    }
//
//    public static  class Builder{
//
//        private String technId, name, surname, race;
//
//        public Builder technId(String technId){
//            this.technId = technId;
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
//        public Technician build(){return new Technician(this);}
//
//    }
//
//    public String getTechnId(){return technId;}
//
//    public String getName(){return name;}
//
//    public String getSurname(){return surname;}
//
//    public String getRace(){return race;}
//
//
//
//
//
//    @Override
//    public String toString() {
//        return "technId{" +
//                "Techn Id Id='" + technId+ '\'' +
//                ",Name ='" + name + '\'' +
//                ",Surname ='" + surname + '\'' +
//                ",Race ='" + race + '\'' +
//                '}';
//    }
//
//}
