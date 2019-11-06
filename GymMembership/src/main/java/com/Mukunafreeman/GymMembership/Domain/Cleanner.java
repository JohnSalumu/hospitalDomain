//package com.Mukunafreeman.GymMembership.Domain;
//
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//
//@Entity
//public class Cleanner {
//
//    @Id
//
//    private String cleannerId;
//
//    private String  name;
//    private String surname;
//    private String race;
//
//    public Cleanner(){}
//
//    private Cleanner(Builder builder) {
//
//        this.cleannerId=builder.cleannerId;
//        this.name=builder.name;
//        this.surname=builder.surname;
//        this.race=builder.race;
//    }
//
//    public String getCleannerId(){return cleannerId;}
//
//    public String getName(){return name;}
//
//    public String getSurname(){return surname;}
//
//    public String getRace(){return race;}
//
//    public static  class Builder {
//
//        private String cleannerId, name, surname, race;
//
//
//
//        public Builder cleannerId(String cleannerId){
//            this.cleannerId = cleannerId;
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
//
//        public Cleanner build(){return new Cleanner(this); }
//
//        public Builder copy(Cleanner cleanner) {
//            this.cleannerId= cleanner.cleannerId;
//            this.name= cleanner.name;
//            this.surname= cleanner.surname;
//            this.race= cleanner.race;
//
//            return this;
//        }
//
//    }
//
//    @Override
//    public String toString() {
//        return "Cleanner{" +
//                "cleanner Id='" + cleannerId+ '\'' +
//                ",Name ='" + name + '\'' +
//                ",Surname ='" + surname + '\'' +
//                ",Race ='" + race + '\'' +
//                '}';
//    }
//
//}
