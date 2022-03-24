package fr.umontpellier.iut.partie2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;


class HanoiTest {

    @Test
    public void test_resoudre_3() {
        JeuPuzzle Hanoii = new Hanoi(3);
        Contexte c1 = new Contexte(Hanoii);

        c1.resoudre();
        ArrayList<Integer> tour1 = new ArrayList<>();
        ArrayList<Integer> tour2 = new ArrayList<>();
        ArrayList<Integer> tour3 = new ArrayList<>();
        tour3.add(3);
        tour3.add(2);
        tour3.add(1);
        JeuPuzzle finalh = new Hanoi(tour1, tour2, tour3,3);
        System.out.println(c1.getSolution().get(c1.getSolution().size() - 1));
        assertEquals(c1.getSolution().get(c1.getSolution().size() - 1), finalh);


    }
    @Test
    public void test_resoudre_5() {
        JeuPuzzle Hanoii = new Hanoi(5);
        Contexte c1 = new Contexte(Hanoii);

        c1.resoudre();
        ArrayList<Integer> tour1 = new ArrayList<>();
        ArrayList<Integer> tour2 = new ArrayList<>();
        ArrayList<Integer> tour3 = new ArrayList<>();
        tour3.add(5);
        tour3.add(4);
        tour3.add(3);
        tour3.add(2);
        tour3.add(1);
        JeuPuzzle finalh = new Hanoi(tour1, tour2, tour3,5);
        System.out.println(c1.getSolution().get(c1.getSolution().size() - 1));
        assertEquals(c1.getSolution().get(c1.getSolution().size() - 1), finalh);


    }
    @Test
    public void test_resoudre_6() {
        JeuPuzzle Hanoii = new Hanoi(6);
        Contexte c1 = new Contexte(Hanoii);

        c1.resoudre();
        ArrayList<Integer> tour1 = new ArrayList<>();
        ArrayList<Integer> tour2 = new ArrayList<>();
        ArrayList<Integer> tour3 = new ArrayList<>();
        tour3.add(6);
        tour3.add(5);
        tour3.add(4);
        tour3.add(3);
        tour3.add(2);
        tour3.add(1);
        JeuPuzzle finalh = new Hanoi(tour1, tour2, tour3,6);
        System.out.println(c1.getSolution().get(c1.getSolution().size() - 1));
        assertEquals(c1.getSolution().get(c1.getSolution().size() - 1), finalh);


    }
}