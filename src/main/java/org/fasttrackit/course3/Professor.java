package org.fasttrackit.course3;

import java.util.Date;

public class Professor {
    // Fields
    private String lastName;
    private String firstName;
    private String dateOfBirth;
    private String dateOfHiring;
    private String emailAddress;
    private Boolean isPhd;

    // Getters & Setters
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfHiring() {
        return dateOfHiring;
    }

    public void setDateOfHiring(String dateOfHiring) {
        this.dateOfHiring = dateOfHiring;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Boolean getPhd() {
        return isPhd;
    }

    public void setPhd(Boolean phd) {
        isPhd = phd;
    }

    //  Void Constructor

    public Professor() {
    }

    // Constructor with all parameters


    public Professor(String lastName, String firstName, String dateOfBirth, String dateOfHiring, String emailAddress, Boolean isPhd) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.dateOfHiring = dateOfHiring;
        this.emailAddress = emailAddress;
        this.isPhd = isPhd;
    }

    //  Method

    public static void main(String[] args) {
        System.out.println("Hello world");

        Professor nume = new Professor();
        Professor prenume = new Professor();
        Professor nastere = new Professor();
        Professor angajare = new Professor();
        Professor email = new Professor();
        Professor phd = new Professor();

        nume.lastName = "Lazar";
        prenume.firstName = "Mihnea";
        nastere.dateOfBirth = "16.05.1990";
        angajare.dateOfHiring = "25.04.2021";
        email.emailAddress = "mihnea.lazar@gmail.com";
        phd.isPhd = Boolean.TRUE;

        System.out.println("Numele de familie al profesorului este: " + nume.lastName);
        System.out.println("Prenumele profesorului este: " + prenume.firstName);
        System.out.println("Data de nastere al profesorului este: " + nastere.dateOfBirth);
        System.out.println("Date de angajare a profesorului este: " + angajare.dateOfHiring);
        System.out.println("Adresa de email este:" + email.emailAddress);
        System.out.println("Are facultatea terminata: " + phd.isPhd);
        System.out.println("O zi placuta!");

        // TODO am rezolvat pana acum punctele 1, 2, 3, 4, 5 si 6 din tema


    }
}
