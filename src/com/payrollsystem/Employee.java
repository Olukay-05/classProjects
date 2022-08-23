package com.payrollsystem;

import com.accountpayablesystem.Payable;

public abstract class Employee {

    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    public Employee(String firstName, String lastName,
                    String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {return firstName;}

    public String getLastName() {return lastName;}

    public String getSocialSecurityNumber() {return socialSecurityNumber;}

    // return String representation of Employee object
    @Override
    public String toString() {
        return String.format("%s %s%n social security number: %s",
                getFirstName(), getLastName(), getSocialSecurityNumber());
    }


    public abstract double earnings();



}
