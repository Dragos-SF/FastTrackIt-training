package org.fasttrackit.course5;

import java.util.Objects;

public class Student implements Human{
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String dateOfEnrollment;
    private String facultyName;
    private String specializationName;
    private StudentType stype;

    public StudentType getStype() {
        return StudentType.MASTERS;
    }

    public void setStype(StudentType stype) {
        this.stype = stype;
    }

    public Student(){

    }

    public Student(String firstName, String lastName, String dateOfBirth, String dateOfEnrollment, String facultyName, String specializationName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.dateOfEnrollment = dateOfEnrollment;
        this.facultyName = facultyName;
        this.specializationName = specializationName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public String getDateOfEnrollment() {
        return dateOfEnrollment;
    }

    public String getSpecializationName() {
        return specializationName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setDateOfEnrollment(String dateOfEnrollment) {
        this.dateOfEnrollment = dateOfEnrollment;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public void setSpecializationName(String specializationName) {
        this.specializationName = specializationName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(dateOfBirth, student.dateOfBirth) && Objects.equals(dateOfEnrollment, student.dateOfEnrollment) && Objects.equals(facultyName, student.facultyName) && Objects.equals(specializationName, student.specializationName) && stype == student.stype;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, dateOfBirth, dateOfEnrollment, facultyName, specializationName, stype);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", dateOfEnrollment='" + dateOfEnrollment + '\'' +
                ", facultyName='" + facultyName + '\'' +
                ", specializationName='" + specializationName + '\'' +
                ", stype=" + stype +
                '}';
    }


    @Override
    public String firstName() {
        return "Dragos";
    }

    @Override
    public String lastName() {
        return "Man";
    }

    @Override
    public String dateOfBirth() {
        return "30.12.1989";
    }

    @Override
    public String dateOfEnrollment() {
        return "14.05.2021";
    }

    @Override
    public String facultyName() {
        return "USAMV";
    }

    @Override
    public String specializationName() {
        return "Environmental Protection";
    }

    @Override
    public String dateOfHiring() {
        return null;
    }




}
