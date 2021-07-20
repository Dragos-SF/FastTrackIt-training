package org.fasttrackit.course6;

public class CountVowelsAndConsonants {

    public static void main(String[] args) {
         String aplhabet = "abcdefghijklmnoprstuvwxyz";
         int vCOunt=0, cCount=0;

        for(int i = 0; i < aplhabet.length(); i++) { char ch = aplhabet.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { vCOunt++; }
            else if((ch >= 'a'&& ch <= 'z')) {
            cCount++;
        }
        }
        System.out.println("Number of Vowels: " + vCOunt);
        System.out.println("Number of Consonants: " + cCount);



    }



}
