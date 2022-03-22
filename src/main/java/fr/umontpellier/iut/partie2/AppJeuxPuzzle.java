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



        ArrayList<Integer> tour1 = new ArrayList<>(3);
        ArrayList<Integer> tour2 = new ArrayList<>(3);
        ArrayList<Integer> tour3 = new ArrayList<>(3);

        tour2.add(2);
        tour3.add(3);
        tour3.add(1);



        JeuPuzzle h=new Hanoi(tour1,tour2,tour3,3);
        ArrayList<? extends JeuPuzzle> listfils= h.genererFils();
    }
}
