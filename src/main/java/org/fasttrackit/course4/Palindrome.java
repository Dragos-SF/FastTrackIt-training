package org.fasttrackit.course4;

public class Palindrome {
    public static void main(String[] args) {

        int rem, rev= 0, temp;
        int n=15221; // user defined number to be checked for palindrome

        temp = n; //We store the number into a variable

        // reversed integer is stored in variable
        while( n != 0 )
        {
            rem= n % 10;
            rev= rev * 10 + rem;
            n=n/10;
        }

        // palindrome if orignalInteger(temp) and reversedInteger(rev) are equal
        if (temp == rev)
            System.out.println(temp + " is a palindrome.");
        else
            System.out.println(temp + " is not a palindrome.");


    }
}
