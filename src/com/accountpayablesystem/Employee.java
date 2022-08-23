package com.accountpayablesystem;

public abstract class Employee implements Payable {

    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private final int month;
    private final int day;
    private final int year;


         // constructor
         public Employee(String firstName, String lastName, String socialSecurityNumber, int month,int day,int year) {
         this.firstName = firstName;
         this.lastName = lastName;
         this.socialSecurityNumber = socialSecurityNumber;
         this.month = month;
         this.day = day;
         this.year = year;
         }

         // return first name
         public String getFirstName() {return firstName;}

         // return last name
         public String getLastName() {return lastName;}

         // return social security number
         public String getSocialSecurityNumber() {return socialSecurityNumber;}

         // return String representation of Employee object
         @Override
        public String toString() {
         return String.format("%s %s%n social security number: %s",
                 getFirstName(), getLastName(), getSocialSecurityNumber());
         }

         // abstract method must be overridden by concrete subclasses
        public abstract double earnings(); // no implementation here

        public double getPaymentAmount() {return earnings();}




}
