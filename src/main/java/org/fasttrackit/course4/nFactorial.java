package org.fasttrackit.course4;

public class nFactorial {



    public static void main(String[] args) {

        // Prima varianta - asta mi-a venit in cap prima data

        int calculateNFactorialWhereNIs6 = 1 * 2 * 3 * 4 * 5 * 6 ;
        System.out.println("6! = " + calculateNFactorialWhereNIs6);

        // A doua varianta - asta mi-a venit in cap dupa ce am revazut inregistrarea si recunosc ca m-am inspirat si de pe Google

        int i;
        int fact=1;
        int number=6;
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);

    }



}
