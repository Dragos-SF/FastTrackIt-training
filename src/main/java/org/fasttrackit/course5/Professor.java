package org.fasttrackit.course5;

import java.util.Objects;

public class Professor implements Human{
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String dateOfHiring;
    private String specializationName;
    private ProfessorType type;

    public ProfessorType getType() {
        return ProfessorType.PROFESSOR;
    }

    public void setType(ProfessorType type) {
        this.type = type;
    }

    public Professor(){

    }

    public Professor(String firstName, String lastName, String dateOfBirth, String dateOfHiring, String specializationName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.dateOfHiring = dateOfHiring;
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

    public String getDateOfHiring() {
        return dateOfHiring;
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

    public void setDateOfHiring(String dateOfHiring) {
        this.dateOfHiring = dateOfHiring;
    }

    public void setSpecializationName(String specializationName) {
        this.specializationName = specializationName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Objects.equals(firstName, professor.firstName) && Objects.equals(lastName, professor.lastName) && Objects.equals(dateOfBirth, professor.dateOfBirth) && Objects.equals(dateOfHiring, professor.dateOfHiring) && Objects.equals(specializationName, professor.specializationName) && type == professor.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, dateOfBirth, dateOfHiring, specializationName, type);
    }

    @Override
    public String toString() {
        return "Professor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", dateOfHiring='" + dateOfHiring + '\'' +
                ", specializationName='" + specializationName + '\'' +
                ", type=" + type +
                '}';
    }

    @Override
    public String firstName() {
        return "Lazar";
    }

    @Override
    public String lastName() {
        return "Mihnea";
    }

    @Override
    public String dateOfBirth() {
        return "05.11.1991";
    }

    @Override
    public String dateOfEnrollment() {
        return null;
    }

    @Override
    public String facultyName() {
        return null;
    }

    @Override
    public String specializationName() {
        return "JAVA";
    }

    @Override
    public String dateOfHiring() {
        return "15.06.2018";
    }




}
