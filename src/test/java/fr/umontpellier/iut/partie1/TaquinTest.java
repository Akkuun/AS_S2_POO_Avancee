package fr.umontpellier.iut.partie1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TaquinTest {

    @Test
    public void test_est_gagnant_faux_3_X_3() {
        int[][] data = {{1, 2, 0}, {4, 5, 3}, {7, 8, 6}};
        Taquin t = new Taquin(data);
        assertFalse(t.estGagnant());
    }

    @Test
    public void test_est_gagnant_vrai_3_X_3() {
        int[][] data = {{1, 2, 3}, {4, 5, 6}, {7, 8, 0}};
        Taquin t = new Taquin(data);
        assertTrue(t.estGagnant());
    }

    @Test
    public void test_est_gagnant_vrai_4_X_4() {
        int[][] data = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 0, 14, 15}};
        Taquin t = new Taquin(data);
        assertFalse(t.estGagnant());
    }

    @Test
    public void test_est_gagnant_faux_2_X_3() {
        int[][] data = {{1, 2, 3}, {4, 5, 0}};
        Taquin t = new Taquin(data);
        assertTrue(t.estGagnant());
    }

    @Test
    public void test_est_gagnant_faux_1_X_3() {
        int[][] data = {{1}, {2}, {0}};
        Taquin t = new Taquin(data);
        assertTrue(t.estGagnant());
    }


    @Test
    public void test_trouver_trou_coin_hd_3_X_3() {
        int[][] data = {{1, 2, 0}, {4, 5, 3}, {7, 8, 6}};
        Taquin t = new Taquin(data);
        int[] res = t.trouverTrou();
        int[] res2 = {0, 2};
        assertArrayEquals(res2, res);
    }

    @Test
    public void test_trouver_trou_coin_hd_4_X_4() {
        int[][] data = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 0, 14, 15}};
        Taquin t = new Taquin(data);
        int[] res = t.trouverTrou();
        int[] res2 = {3, 1};
        assertArrayEquals(res2, res);
    }


    @Test
    public void test_equals_vrai_3_X_3() {
        int[][] data = {{1, 2, 0}, {4, 5, 3}, {7, 8, 6}};
        Taquin t = new Taquin(data);
        int[][] data2 = {{1, 2, 0}, {4, 5, 3}, {7, 8, 6}};
        Taquin t2 = new Taquin(data2);
        assertEquals(t, t2);
    }


    @Test
    public void test_generer_Fils_coin_3_X_3() {
        int[][] data = {{1, 2, 0}, {4, 5, 3}, {7, 8, 6}};
        Taquin t = new Taquin(data);
        ArrayList<Taquin> res = t.genererFils();

        ArrayList<Taquin> res2 = new ArrayList<>();
        int[][] datafils1 = {{1, 2, 3}, {4, 5, 0}, {7, 8, 6}};
        Taquin fils1 = new Taquin(datafils1);
        int[][] datafils2 = {{1, 0, 2}, {4, 5, 3}, {7, 8, 6}};
        Taquin fils2 = new Taquin(datafils2);
        res2.add(fils1);
        res2.add(fils2);
        assertTrue(res.containsAll(res2) && res2.containsAll(res));
    }

    @Test
    public void test_generer_Fils_coin_4_X_4() {
        int[][] data = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 0, 11}, {12, 13, 14, 15}};
        Taquin t = new Taquin(data);
        ArrayList<Taquin> res = t.genererFils();

        ArrayList<Taquin> listeFilsTest = new ArrayList<>();
        int[][] datafils1 = {{1, 2, 3, 4}, {5, 6, 0, 8}, {9, 10, 7, 11}, {12, 13, 14, 15}};
        Taquin fils1 = new Taquin(datafils1);
        listeFilsTest.add(fils1);
        int[][] datafils2 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 0, 10, 11}, {12, 13, 14, 15}};
        Taquin fils2 = new Taquin(datafils2);
        listeFilsTest.add(fils2);

        int[][] datafils3 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 0}, {12, 13, 14, 15}};
        Taquin fils3 = new Taquin(datafils3);
        listeFilsTest.add(fils3);

        int[][] datafils4 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 14, 11}, {12, 13, 0, 15}};
        Taquin fils4 = new Taquin(datafils4);
        listeFilsTest.add(fils3);



        assertTrue( res.containsAll(listeFilsTest));
    }
    @Test
    public void test_generer_fils_1x5(){

        int [][]data= {{1,2,0,3,4}};
        Taquin t=new Taquin(data);
        ArrayList<Taquin> result= t.genererFils();
        ArrayList<Taquin> listeFils=new ArrayList<>();

        int[][] fils1 ={{1,0,2,3,4}};
        int[][] fils2 ={{1,2,3,0,4}};
        Taquin Fils1= new Taquin(fils1);
        Taquin Fils2=new Taquin(fils2);
        listeFils.add(Fils1);
        listeFils.add(Fils2);
        assertTrue( result.containsAll(listeFils));
    }
}