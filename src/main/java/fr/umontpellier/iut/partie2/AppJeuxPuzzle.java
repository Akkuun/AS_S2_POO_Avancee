package fr.umontpellier.iut.partie2;

public class AppJeuxPuzzle {
    public static void main(String[] args) {
        int[][] tab = {{1, 4, 3, 0, 2}};
        JeuPuzzle jeuPuzzle = new Taquin(tab);
        Contexte context = new Contexte(jeuPuzzle);
        context.resoudre();
        System.out.println(context.getSolution());
    }
}
