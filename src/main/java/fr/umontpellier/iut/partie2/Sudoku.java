package fr.umontpellier.iut.partie2;


import java.lang.reflect.AnnotatedArrayType;
import java.util.*;

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

        ArrayList<Sudoku> listfils = new ArrayList<>();
        ArrayList<Sudoku> valeurpossible = ;

        return listfils;
    }

    public ArrayList<Integer> valeurPossible(int[] cordonnee) {
        int x = cordonnee[0];
        int y = cordonnee[1];
        ArrayList<Integer> valeur = new ArrayList<>();
        for (int i=0;i< grille.length;i++){
            for(int j=0;j< grille[i].length;j++){

            }
        }

    }
