package org.fasttrackit.course5;

public class HomeworkRunner {
    public static void main(String[] args) {
        Professor mihnea = new Professor();
        System.out.println("PROFESOR");
        System.out.println("Nume: "+mihnea.firstName());
        System.out.println("Prenume: "+ mihnea.lastName());
        System.out.println("Data Nasterii: "+ mihnea.dateOfBirth());
        System.out.println("Specializare: "+ mihnea.specializationName());
        System.out.println("Data angajarii: "+mihnea.dateOfHiring());
        System.out.println("Rol: "+ ProfessorType.PROFESSOR);

        System.out.println("");
        System.out.println("");
        System.out.println("");
        Student dragos = new Student();
        System.out.println("STUDENT");
        System.out.println("Nume: "+dragos.firstName());
        System.out.println("Prenume: "+ dragos.lastName());
        System.out.println("Data Nasterii: "+ dragos.dateOfBirth());
        System.out.println("Specializare: "+ dragos.specializationName());
        System.out.println("Data Inscrierii: "+ dragos.dateOfEnrollment());
        System.out.println("Facultate: " + dragos.facultyName());
        System.out.println("Rol: "+ StudentType.MASTERS);

        
    }
}
