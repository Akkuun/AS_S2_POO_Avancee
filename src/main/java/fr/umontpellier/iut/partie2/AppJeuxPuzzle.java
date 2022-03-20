package fr.umontpellier.iut.partie2;

import java.util.ArrayList;
import java.util.Arrays;

public class AppJeuxPuzzle {
    public static void main(String[] args) {
       int[][] tab = {{1, 4, 3, 0, 2}};
        JeuPuzzle jeuPuzzle = new Taquin(tab);
        Contexte context = new Contexte(jeuPuzzle);
        context.resoudre();
        System.out.println(context.getSolution());



        ArrayList<Integer> tour1 = new ArrayList<>();
        ArrayList<Integer> tour2 = new ArrayList<>();
        ArrayList<Integer> tour3 = new ArrayList<>();
        tour3.add(1);
        tour3.add(2);
        tour3.add(3);

        tour2.add(2);


        JeuPuzzle h=new Hanoi(tour1,tour2,tour3,3);
        System.out.println(h.estGagnant());
    }
}
