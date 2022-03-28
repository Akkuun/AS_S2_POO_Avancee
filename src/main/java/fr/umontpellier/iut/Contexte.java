package fr.umontpellier.iut;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Contexte {


    private JeuPuzzle jeuInitial;
    private ArrayList<JeuPuzzle> solution;

    public Contexte(JeuPuzzle jeuInitial) {
        this.jeuInitial = jeuInitial;
        solution = new ArrayList<>();
    }

    public void resoudre() {
        int compteur = 0;
        ArrayList<Couple> frontiere = new ArrayList<>();

        Set<JeuPuzzle> dejaVus = new HashSet<>();
        Couple couple = new Couple(jeuInitial, null);
        frontiere.add(couple);
        dejaVus.add(jeuInitial);


        while (!frontiere.isEmpty() && !frontiere.get(0).getJeuxInitial().estGagnant()) { //tant que la frontière est pas vide
            frontiere.remove(0).mettreAJour(frontiere, dejaVus);
            compteur++;
            System.out.println(frontiere.size());
        }

        if (!frontiere.isEmpty() && frontiere.get(0).getJeuxInitial().estGagnant()) { //si le couple est gagnant on met dans la solution tout les mouvement
            solution = frontiere.get(0).getListeDeMouvements();


        }
    }

    @Override
    public String toString() {
        return "Contexte{" +
                "jeuxInitial=" + jeuInitial +
                ", solution=" + solution +
                '}';
    }

    public ArrayList<JeuPuzzle> getSolution() {
        return solution;
    }
}
