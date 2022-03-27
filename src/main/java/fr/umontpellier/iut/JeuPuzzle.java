package fr.umontpellier.iut;

import java.util.ArrayList;

public interface JeuPuzzle { //l'interface contient toutes les classes que ses fils devront forcement avoir

    boolean estGagnant();

    ArrayList<? extends JeuPuzzle> genererFils(); //cette fonction renvoie un array list e type inconnu mais sous classe de JeuPuzzle
}
