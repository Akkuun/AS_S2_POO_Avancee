package fr.umontpellier.iut.partie1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Couple {

    private Taquin taquin;
    private Couple predecesseur;

    public Couple(Taquin taquin, Couple predecesseur) {
        this.taquin = taquin;
        this.predecesseur = predecesseur;
    }

    public void mettreAJour(ArrayList<Couple> frontiere, ArrayList<Taquin> dejaVus) {







    }

    public ArrayList<Taquin> getListeDeMouvements() {
        ArrayList<Taquin> listeToutLesTaquins = new ArrayList<Taquin>();

        Couple coupleActuel = new Couple(taquin, predecesseur);
        listeToutLesTaquins.add(coupleActuel.getTaquin());
        while (coupleActuel.predecesseur != null) {

            coupleActuel = predecesseur;
            listeToutLesTaquins.add(coupleActuel.getTaquin());

        }
        Collections.reverse(listeToutLesTaquins);
        return listeToutLesTaquins;
    }


    public Taquin getTaquin() {
        return taquin;
    }
}
