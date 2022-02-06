package fr.umontpellier.iut.exercice2;

import java.util.ArrayList;

public class PrimeFactors {
    public ArrayList<Integer> computeFactors(int number) {
        ArrayList<Integer> maListeJava = new ArrayList<>(); // déclaration + instanciation de liste vide
        int i=2;
        int dividende=0;



        while (i<=number)
        {
            if (number%i==0) {
                number = number / i;
                maListeJava.add(i);

                i = 1;
            }
            i++;
        }

        return maListeJava;

    }
}
