package org.fasttrackit.course3;

public class HomeworkRunner {


    public static void main(String[] args) {
        System.out.println("Hello world");

        System.out.println("");

        Professor mihneaLazar = new Professor();


        mihneaLazar.setLastName("Lazar");
        mihneaLazar.setFirstName("Mihnea");
        mihneaLazar.setDateOfBirth("16.05.1990");
        mihneaLazar.setDateOfHiring("25.04.2021");
        mihneaLazar.setEmailAddress("mihnea.lazar@gmail.com");
        mihneaLazar.setPhd(Boolean.TRUE);

        System.out.println("Numele de familie al profesorului este: " + mihneaLazar.getLastName());
        System.out.println("Prenumele profesorului este: " + mihneaLazar.getFirstName());
        System.out.println("Data de nastere al profesorului este: " + mihneaLazar.getDateOfBirth());
        System.out.println("Date de angajare a profesorului este: " + mihneaLazar.getDateOfHiring());
        System.out.println("Adresa de email este:" + mihneaLazar.getEmailAddress());
        System.out.println("Are facultatea terminata: " + mihneaLazar.getPhd());

        System.out.println("");


        Professor dragosMan = new Professor();

        dragosMan.setLastName("Man");
        dragosMan.setFirstName("Dragos");
        System.out.println("Numele elevului este: " + dragosMan.getLastName());
        System.out.println("Prenumele elevului este: " + dragosMan.getFirstName());

        System.out.println("");

        System.out.println("O zi placuta!");

    }
}
