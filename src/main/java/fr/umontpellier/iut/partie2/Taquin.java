package fr.umontpellier.iut.partie2;

import java.util.ArrayList;
import java.util.Arrays;

public class Taquin implements JeuPuzzle {
    private int[][] tableau;

    public Taquin(int[][] tableau) {
        this.tableau = tableau;
    }

    @Override
    public boolean estGagnant() {
        int valueNextcase = 2;
        boolean isGood = false;
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) { //on parcourt la matrice

                if (tableau[i][j] != valueNextcase - 1 &&
                        (i != tableau.length - 1 || j != tableau[0].length - 1)) { //si la case est  = à valeur case +1 alors
                    return false;
                }
                valueNextcase++;
            }
        }

        return true;
    }
    @Override
    public ArrayList<? extends JeuPuzzle> genererFils() {
        int[] coordonneeTrou = trouverTrou();
        int cordonnee_i_trou = coordonneeTrou[0];
        int cordonnee_j_trou = coordonneeTrou[1];
        ArrayList<Taquin> listeFils = new ArrayList<>();
        if (cordonnee_j_trou > 0) {            //je peux bouger le trou à gauche
            int[][] taquin_pour_deplacement_a_gauche = getCopyTableau();
            taquin_pour_deplacement_a_gauche[cordonnee_i_trou][cordonnee_j_trou] = taquin_pour_deplacement_a_gauche[cordonnee_i_trou][cordonnee_j_trou - 1];//on échange la vlauer du trou et de sa case à gauche
            taquin_pour_deplacement_a_gauche[cordonnee_i_trou][cordonnee_j_trou - 1] = 0;
            Taquin deplacement_gauche = new Taquin(taquin_pour_deplacement_a_gauche);
            listeFils.add(deplacement_gauche);
        }
        if (cordonnee_j_trou < tableau[0].length - 1) { //je peux bouger le trou à droite et qu'il n'est pas sur la droite du taquin
            int[][] taquin_pour_deplacement_a_droite = getCopyTableau();
            taquin_pour_deplacement_a_droite[cordonnee_i_trou][cordonnee_j_trou] = taquin_pour_deplacement_a_droite[cordonnee_i_trou][cordonnee_j_trou + 1];
            taquin_pour_deplacement_a_droite[cordonnee_i_trou][cordonnee_j_trou + 1] = 0;
            Taquin deplacement_droite = new Taquin(taquin_pour_deplacement_a_droite);
            listeFils.add(deplacement_droite);
        }
        if (cordonnee_i_trou > 0) //peut bouger le trou en haut
        {
            int[][] taquin_pour_deplacement_haut = getCopyTableau();
            taquin_pour_deplacement_haut[cordonnee_i_trou][cordonnee_j_trou] = taquin_pour_deplacement_haut[cordonnee_i_trou - 1][cordonnee_j_trou];
            taquin_pour_deplacement_haut[cordonnee_i_trou - 1][cordonnee_j_trou] = 0;
            Taquin deplacement_haut = new Taquin(taquin_pour_deplacement_haut);
            listeFils.add(deplacement_haut);
        }
        if (cordonnee_i_trou < tableau.length - 1) //peut bouger le trou en bas
        {
            int[][] taquin_pour_deplacement_bas = getCopyTableau();
            taquin_pour_deplacement_bas[cordonnee_i_trou][cordonnee_j_trou] = taquin_pour_deplacement_bas[cordonnee_i_trou + 1][cordonnee_j_trou];
            taquin_pour_deplacement_bas[cordonnee_i_trou + 1][cordonnee_j_trou] = 0;
            Taquin deplacement_bas = new Taquin(taquin_pour_deplacement_bas);
            listeFils.add(deplacement_bas);
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


    public int[][] getCopyTableau() {
        int[][] copie_Tableau_Attribut = new int[tableau.length][tableau[0].length]; //on copie le tableau car sinon on prends la reference de notre tableau de notre attribut

        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                copie_Tableau_Attribut[i][j] = tableau[i][j];
            }
        }
        return copie_Tableau_Attribut;
    }
}
