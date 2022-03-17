package fr.umontpellier.iut.partie2;

import java.util.ArrayList;

public class Contexte {

    private Taquin taquinInitial;
    private ArrayList<Taquin> solution;

    public Contexte(Taquin taquinInitial) {
        this.taquinInitial = taquinInitial;
        solution = new ArrayList<>();
    }

    public void resoudre() {
        int compteur= 0;
        ArrayList<Couple> frontiere = new ArrayList<>();

        ArrayList<Taquin> dejaVus = new ArrayList<>();
        Couple couple = new Couple(taquinInitial, null);
        frontiere.add(couple);
        dejaVus.add(taquinInitial);


        while (!frontiere.isEmpty()&&!frontiere.get(0).getTaquin().estGagnant()) { //tant que la frontière est pas vide
            frontiere.remove(0).mettreAJour(frontiere,dejaVus);
            compteur++;
            System.out.println(compteur);
        }
        if (frontiere.get(0).getTaquin().estGagnant()){ //si le couple est gagnant on met dans la solution tout les mouvement
            solution=frontiere.get(0).getListeDeMouvements();
            frontiere.clear();
        }
}

    @Override
    public String toString() {
        return "Contexte{" +
                "taquinInitial=" + taquinInitial +
                ", solution=" + solution +
                '}';
    }

    public ArrayList<Taquin> getSolution() {
        return solution;
    }
}
