package fr.umontpellier.iut.partie1;

import fr.umontpellier.iut.partie2.JeuPuzzle;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.io.OutputStream;
import java.io.PrintStream;
import java.time.Duration;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ContexteTest {

    @BeforeEach
    void disableConsole() {
        System.setOut(new PrintStream(new OutputStream() {
            @Override
            public void write(int arg0) {
            }
        }));

    }


    @Test
    public void test_no_exception() {
        int[][] data = {{1, 2, 3}, {4, 5, 6}, {7, 8, 0}};
        Contexte c = new Contexte(new Taquin(data));
        assertDoesNotThrow(() -> c.resoudre());
    }

    @Test
    public void test_resoudre_1x5(){
        int[][] data ={{1,2,0,3,4}};
        Taquin t=new Taquin(data);
        Contexte c= new Contexte(t);
        c.resoudre();
        ArrayList<Taquin> solution =c.getSolution();
        System.out.println(solution);
    }
    @Test
    public void resoudre_3x3(){
        Taquin taquin =new Taquin(new int[][]{{1,2,3},{4,5,6},{0,7,8}});
        Contexte c1 = new Contexte(taquin);
        c1.resoudre();

        Taquin taquin1 =new Taquin(new int[][]{{1,2,3},{4,5,6},{7,0,8}});
        Taquin gagne =new Taquin(new int[][]{{1,2,3},{4,5,6},{7,8,0}});
        ArrayList<Taquin>solution = new ArrayList<>();
        solution.add(taquin);
        solution.add(taquin1);
        solution.add(gagne);
        assertEquals(solution,c1.getSolution());
    }



}