package fr.umontpellier.iut.partie2;


import java.util.ArrayList;
import java.util.List;

public class Sudoku implements JeuPuzzle {

    private int[][] grille;

    // pré-requis : la grille est carrée
    public Sudoku(int[][] g) {
        this.grille = g;
    }

    @Override
    public boolean estGagnant() {
        return false;
    }

    @Override
    public ArrayList<? extends JeuPuzzle> genererFils() {


        ArrayList<Integer> valeurPossible = new ArrayList<>();


        // verifier les valeurs possible qui ne sont ni dans les ligne , colonnes, et bloc
        // qui est délimité par une longueur et largeur de racine de n
        return null;

    }

    public ArrayList<Integer> trouverValeurDisponible() {
        double valeurbloc = Math.sqrt(grille.length);

    }
}
