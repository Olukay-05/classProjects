package com.employeehierarchy;

//public class HourlyEmployee extends Employee {
//
//            private double hours;
//            private double wage;
//    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hours, double wage) {
//        super(firstName, lastName, socialSecurityNumber);
//
//
//
//        this.hours = hours;
//        this.wage = wage;
//
//    }
//
//    public double getHours() {
//
//        return hours;
//    }
//
//    public void setHours(double hours) {
//
//        if (hours < 0.0 || hours > 168.0){
//
//            throw new IllegalArgumentException("Value of hours must be < 0.0 and > 168");
//        }
//        this.hours = hours;
//    }
//
//    public double getWage() {
//        return wage;
//    }
//
//    public void setWage(double wage) {
//
//        if (wage > 0.0)
//        this.wage = wage;
//    }
//
//    public double earnings(){
//
//        return getWage() * getHours();
//    }
//
//    @Override
//    public String toString() {
//        return "Employee" + " " + "Earnings in" + " " +
//                 "Hours = " + hours +
//                ", Wage = " + wage + "Earnings = " + earnings();
//    }
//}
//
