package fr.umontpellier.iut.exercice2;

import java.util.ArrayList;

public class PrimeFactors {
    public ArrayList<Integer> computeFactors(int number) {
        ArrayList<Integer> maListeJava = new ArrayList<>(); // déclaration + instanciation de liste vide
        int i=2;
        int dividende=0;


       /* if (number % 2 == 0 && number != 2 ) {
            quotient_n1=quotient;
            nombre=number;
            dividende=2;
            maListeJava.add(dividende);
            while (quotient_n1!=1){
                quotient=nombre/dividende;
                maListeJava.add(quotient);
                nombre=quotient;
                quotient_n1=nombre/dividende;
            }
        }*/
        while (i<=number)
        {
            if (number%i==0) {
                number = number / i;
                maListeJava.add(i);

                i = 1;
            }
            i++;
        }


        if (number == 3 || number == 5 || number == 7) {
            maListeJava.add(number);
        }

        if (number == 1) { // quand c'est un nombre premier renvoie la liste vide

        }



/*
        if (number == 4158) {
            maListeJava.add(2);
            maListeJava.add(3);
            maListeJava.add(3);
            maListeJava.add(3);
            maListeJava.add(7);
            maListeJava.add(11);
        }*/

        return maListeJava;
       /*
        if (number == 1) { // quand c'est un nombre premier renvoie la liste vide

        }
        if (number == 2) {
            maListeJava.add(2);
        }
        if (number == 3) {
            maListeJava.add(3);
        }
        if (number == 4) {
            maListeJava.add(2);
            maListeJava.add(2);
        }
        if (number == 5) {
            maListeJava.add(5);
        }
        if (number == 6) {
            maListeJava.add(2);
            maListeJava.add(3);
        }
        if (number == 7) {
            maListeJava.add(7);
        }
        if (number==8){
            maListeJava.add(2);
            maListeJava.add(2);
            maListeJava.add(2);

        }
        if (number==9){
            maListeJava.add(3);
            maListeJava.add(3);
        }
        if (number==10){
            maListeJava.add(2);
            maListeJava.add(5);
        }
        if (number==4158){
            maListeJava.add(2);
            maListeJava.add(3);
            maListeJava.add(3);
            maListeJava.add(3);
            maListeJava.add(7);
            maListeJava.add(11);
        }


        return maListeJava;*/
    }
}
