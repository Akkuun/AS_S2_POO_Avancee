package fr.umontpellier.iut.partie2;

import java.util.ArrayList;
import java.util.Arrays;

public class AppJeuxPuzzle {
    public static void main(String[] args) {



        ArrayList<Integer> tour1 = new ArrayList<>();
        ArrayList<Integer> tour2 = new ArrayList<>();
        ArrayList<Integer> tour3 = new ArrayList<>();

        tour2.add(2);
        tour3.add(3);
        tour3.add(1);



        JeuPuzzle h=new Hanoi(tour1,tour2,tour3,3);
        Contexte han=new Contexte(new Hanoi(3));
        han.resoudre();

        System.out.println(han.getSolution());


    }
}
