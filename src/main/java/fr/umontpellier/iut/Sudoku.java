package fr.umontpellier.iut;


import java.util.ArrayList;
import java.util.Arrays;

public class Sudoku implements JeuPuzzle {

    private int[][] grille;

    // pré-requis : la grille est carrée
    public Sudoku(int[][] g) {
        this.grille = g;
    }



    @Override
    public ArrayList<? extends JeuPuzzle> genererFils() {
        ArrayList<JeuPuzzle> listeFils = new ArrayList<>();
        int[] coordoneeTrou = trouverCoordoneeTrou();

        for (int i = 1; i <= grille.length; i++){
            int[][] data = new int[grille.length][grille[0].length];

            for (int j = 0; j < grille.length; j++){
                for (int k = 0; k < grille[j].length; k++){
                    data[j][k] = grille[j][k];
                }
            }

            data[coordoneeTrou[0]][coordoneeTrou[1]] = i;

            Sudoku fils = new Sudoku(data);

            listeFils.add(fils);
        }

        return listeFils;
    }

    @Override
    public boolean estGagnant() { //possible de parcourir le tableau et verifier qu'il n'y a pas de tableau

        return horizontalGagant() && estVerticalementGagnant() && estConfigGagante();
    }

    public int[] trouverCoordoneeTrou(){
        boolean estTrouve = false;
        int[] coordonee = new int[2];

        for (int i = 0; i < grille.length && !estTrouve; i++){
            for (int j = 0; j < grille[i].length && !estTrouve; j++){
                if (grille[i][j] == 0){
                    estTrouve = true;
                    coordonee[0] = i;
                    coordonee[1] = j;
                }
            }
        }

        return coordonee;
    }

    public boolean estConfigGagante(){
        int[] frequences;
        boolean estGagnant = true;

        int tailleSousTab = (int) Math.floor(Math.sqrt(grille.length));
        System.out.println(tailleSousTab);

        for(int k = 0; estGagnant && k < tailleSousTab; k++){
            for (int l = 0; estGagnant && l < tailleSousTab; l++) {
                frequences=new int[grille.length];
                for (int i = 0; estGagnant && i < tailleSousTab; i++) {
                    for (int j = 0; estGagnant && j < tailleSousTab; j++) {
                        if (grille[i + k * tailleSousTab][j+l * tailleSousTab] == 0 || frequences[grille[i + k * tailleSousTab][j+l * tailleSousTab] - 1] == 1) {
                            estGagnant = false;
                        } else {
                            frequences[grille[i + k * tailleSousTab][j + l * tailleSousTab] - 1]++;
                        }
                    }
                }
            }
        }

        return estGagnant;
    }
    public boolean horizontalGagant(){
        int[] frequences;
        boolean estGagnant = true;

        for(int i = 0; i < grille.length && estGagnant; i++){
            frequences = new int[grille.length];
            for(int j = 0; j < grille[i].length && estGagnant; j++){
                if (grille[i][j] == 0 || frequences[grille[i][j]-1] == 1){
                    estGagnant = false;
                } else {
                    frequences[grille[i][j] - 1]++;
                }
            }
        }

        return estGagnant;
    }

    public boolean estVerticalementGagnant(){
        int[] frequences;
        boolean estGagnant = true;

        for(int j = 0; j < grille[0].length && estGagnant; j++){
            frequences = new int[grille.length];
            for(int i = 0; i < grille.length && estGagnant; i++){
                if (grille[i][j] == 0 || frequences[grille[i][j]-1] == 1){
                    estGagnant = false;
                } else {
                    frequences[grille[i][j] - 1]++;
                }
            }
        }

        return estGagnant;
    }



    @Override
    public String toString(){
        String s ="";

        for(int[] ligne : grille){
            s+= Arrays.toString(ligne)+'\n';
        }

        return s;
    }

    @Override
    public boolean equals(Object obj) {
        boolean areEquals = false;

        if (obj instanceof Sudoku){
            if (Arrays.deepEquals(grille, ((Sudoku) obj).grille)){
                areEquals = true;
            }
        }

        return areEquals;
    }
}
