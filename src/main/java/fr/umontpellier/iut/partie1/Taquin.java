package fr.umontpellier.iut.partie1;

import java.util.ArrayList;
import java.util.Arrays;

public class Taquin {
    private int[][] tableau;

    public Taquin(int[][] tableau) {
        this.tableau = tableau;
    }

    public boolean estGagnant() {
        int valueNextcase = 2;
        boolean isGood = false;
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) { //on parcourt la matrice

                if (tableau[i][j] != valueNextcase - 1 &&
                        (i != tableau.length - 1 || j != tableau[0].length - 1))
                { //si la case est  = à valeur case +1 alors
                    return false;
                }
                valueNextcase++;
            }
        }

        return true;
    }

    public ArrayList<Taquin> genererFils() {
        int[] coordonneeTrou = trouverTrou();
        int i = coordonneeTrou[0];
        int j = coordonneeTrou[1];
        ArrayList<Taquin> listeFils = new ArrayList<>();

        if (j > 0) {            //je peux bouger le trou à gauche

        }

        return listeFils;
    }

    /**
     * @return un tableau [i,j] si tableau[i][j]==0
     */
    public int[] trouverTrou() {
        int[] coordoneeTrou = new int[2];
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                if (tableau[i][j] == 0) {
                    coordoneeTrou[0] = i;
                    coordoneeTrou[1] = j;
                    break;
                }
            }
        }
        return coordoneeTrou;
    }

    @Override
    public String toString() {//tableau.lengh = longueur
        String result = "";
        result += "+";

        for (int i = 0; i < tableau.length * tableau[0].length; i++) { //tableau[0] = largeur
            result += "-";
        }
        result += "+";

        for (int j = 0; j < tableau.length; j++) {
            result += " " + "\n" + "|";
            for (int k = 0; k < tableau[j].length; k++) {
                result += " " + tableau[j][k] + " ";
            }
            result += " " + "|" + "\n";
        }
        result += "+";
        for (int i = 0; i < tableau.length * tableau[0].length; i++) { //tableau[0] = largeur
            result += "-";
        }
        result += "+";
        return result;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Taquin taquin = (Taquin) o;
        return Arrays.deepEquals(tableau, taquin.tableau);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(tableau);
    }
}
