package fr.umontpellier.iut.partie2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;


class HanoiTest {

    @Test
    public void index_fonction() {
        ArrayList<Integer> tour1 = new ArrayList<>(3);
        ArrayList<Integer> tour2 = new ArrayList<>(3);
        ArrayList<Integer> tour3 = new ArrayList<>(3);
        ArrayList<Hanoi> listFils = new ArrayList<>();
        tour1.add(3);
        tour1.add(1);
        tour1.add(0);

        tour2.add(0);
        tour2.add(0);
        tour2.add(0);

        tour3.add(2);
        tour3.add(0);
        tour3.add(0);
        Hanoi hanoi = new Hanoi(tour1, tour2, tour3, 3);
        System.out.println(hanoi.indexDerniereValeurPasNull(tour1));
        System.out.println(hanoi.valeurDessus(tour1));


hanoi.genererFils();
    }
}