package com.sda.SDASCheduleAPP;

import java.time.LocalDate;

public class Person {

    public Person(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }


    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
       sb.append("First Name: ").append(this.firstName).append(" , ").append("Last Name: ")
               .append(this.lastName).append(" , ").append("Date of Birth").append(this.dateOfBirth);

       return sb.toString();
    }
}
