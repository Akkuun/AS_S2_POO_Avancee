package fr.umontpellier.iut.partie2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class AppJeuxPuzzle {
    public static void main(String[] args) {


/*

        ArrayList<Integer> tour1 = new ArrayList<>();
        ArrayList<Integer> tour2 = new ArrayList<>();
        ArrayList<Integer> tour3 = new ArrayList<>();

        tour2.add(2);
        tour3.add(3);
        tour3.add(1);



        JeuPuzzle h=new Hanoi(tour1,tour2,tour3,3);
        Contexte han=new Contexte(new Hanoi(3));
        han.resoudre();

       // System.out.println(han.getSolution());

        int[][] UnPeuLongMaisBon = {{2,3,8}, {7,6,4}, {5,1,0}};

        Contexte tauin= new Contexte(new Taquin(UnPeuLongMaisBon));
       // tauin.resoudre();
        //System.out.println(tauin.getSolution());
*/



        int[][] sudo=  new int[][]{
                {4, 1, 2, 3},
                {0, 0, 1, 4},
                {0, 3, 4, 1},
                {1, 4, 3, 2}
        };

        Sudoku s= new Sudoku(sudo);
       ArrayList<int []> list= new ArrayList<>();
        s.genererFils();

    }
}
