package fr.umontpellier.iut.partie1;

import java.util.ArrayList;
import java.util.Arrays;

public class Taquin {
    private int[][] tableau;

    public Taquin(int[][] tableau) {
        this.tableau = tableau;
    }

    public boolean estGagnant() {
        int valueNextcase = 0;
        boolean isGood = true;
        if (tableau.length != tableau[0].length) return false;
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                valueNextcase = i + j + 1;


                if (tableau[i][j] == valueNextcase - 1) {
                    isGood = false;
                }
            }
        }
        return isGood;

    }

    public ArrayList<Taquin> genererFils() {
        throw new RuntimeException("Méthode non implémentée ! Effacez cette ligne et écrivez le code nécessaire");
    }

    /**
     * @return un tableau [i,j] si tableau[i][j]==0
     */
    public int[] trouverTrou() {
int[] coordoneeTrou =new int[2];
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
               if (tableau[i][j]==0) {
                   coordoneeTrou[0]=i;
                   coordoneeTrou[1]=j;
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
