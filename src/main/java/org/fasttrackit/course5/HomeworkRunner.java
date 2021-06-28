package org.fasttrackit.course5;

public class HomeworkRunner {
    public static void main(String[] args) {
        Professor mihnea = new Professor();
        System.out.println("PROFESOR");
        mihnea.setFirstName("Lazar");
        System.out.println("Nume: "+mihnea.getFirstName());
        mihnea.setLastName("Mihnea");
        System.out.println("Prenume: "+ mihnea.getLastName());
        mihnea.setDateOfBirth("15.06.1990");
        System.out.println("Data Nasterii: "+ mihnea.getDateOfBirth());
        mihnea.setSpecializationName("JAVA");
        System.out.println("Specializare: "+ mihnea.getSpecializationName());
        mihnea.setDateOfHiring("19.07.2011");
        System.out.println("Data angajarii: "+mihnea.getDateOfHiring());
        mihnea.setType(ProfessorType.PROFESSOR);
        System.out.println("Rol: "+ mihnea.getType());


        System.out.println("");
        System.out.println("");
        System.out.println("");
        Student dragos = new Student();
        System.out.println("STUDENT");
        dragos.setFirstName("Man");
        System.out.println("Nume: "+dragos.getFirstName());
        dragos.setLastName("Dragos");
        System.out.println("Prenume: "+ dragos.getLastName());
        dragos.setDateOfBirth("30.12.1989");
        System.out.println("Data Nasterii: "+ dragos.getDateOfBirth());
        dragos.setSpecializationName("Environmental Protection");
        System.out.println("Specializare: "+ dragos.getSpecializationName());
        dragos.setDateOfEnrollment("15.04.2021");
        System.out.println("Data Inscrierii: "+ dragos.getDateOfEnrollment());
        dragos.setFacultyName("USAMV");
        System.out.println("Facultate: " + dragos.getFacultyName());
        dragos.setStype(StudentType.MASTERS);
        System.out.println("Rol: "+ dragos.getStype());


    }
}
