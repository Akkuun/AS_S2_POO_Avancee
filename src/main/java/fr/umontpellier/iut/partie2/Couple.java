package fr.umontpellier.iut.partie2;

import java.util.ArrayList;
import java.util.Collections;

public class Couple {

    private Taquin taquin;
    private Couple predecesseur;

    public Couple(Taquin taquin, Couple predecesseur) {
        this.taquin = taquin;
        this.predecesseur = predecesseur;
    }

    public void mettreAJour(ArrayList<Couple> frontiere, ArrayList<Taquin> dejaVus) {

       ArrayList<Taquin> fils= taquin.genererFils(); //on génère les fils du taquin
        for (Taquin taquin:fils) { //on parcours tout les taquin fils
            if (!dejaVus.contains(taquin)){ //si deja vu ne contient pas le taquin fils
                dejaVus.add(taquin); //on l'ajoute dans déjà vu
                frontiere.add(new Couple(taquin,this)); //et on ajoute dans le frontier le nouveau couple
                //du fils avec this en prédécesseur
            }
        }


    }

    public ArrayList<Taquin> getListeDeMouvements() {
        ArrayList<Taquin> listeToutLesTaquins = new ArrayList<Taquin>();

        Couple coupleActuel = new Couple(taquin, predecesseur);
        listeToutLesTaquins.add(coupleActuel.getTaquin());
        while (coupleActuel.predecesseur != null) {

            coupleActuel = coupleActuel.predecesseur;

            listeToutLesTaquins.add(coupleActuel.getTaquin());

        }
        Collections.reverse(listeToutLesTaquins);
        return listeToutLesTaquins;
    }


    public Taquin getTaquin() {
        return taquin;
    }
}
