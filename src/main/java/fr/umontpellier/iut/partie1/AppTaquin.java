package fr.umontpellier.iut.partie1;

import java.util.ArrayList;
import java.util.Arrays;

public class AppTaquin {
    public static void main(String[] args) {

        int[][] dataPR = {{1, 2, 0}, {4, 5, 3}, {7, 8, 6}};     //Résolvable
        int[][] dataR = {{1, 2, 3}, {4, 5, 6}, {7, 0, 8}};      //Résolvable
        int[][] petitT = {{2 , 0} , {1 , 3}};                   //Petit résolvable
        int[][] impossible = {{1,2,3}, {4,5,6}, {8,7,0}};       //Trop long et irrésolvable
        int[][] impossible2 = {{0, 2}, {3, 1}};
        int[][] UnPeuLongMaisBon = {{2,3,8}, {7,6,4}, {5,1,0}};

        Contexte c1= new Contexte(new Taquin(UnPeuLongMaisBon));
        c1.resoudre();
        System.out.println(c1.getSolution());
    }
}
