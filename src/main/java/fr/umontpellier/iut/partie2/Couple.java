package fr.umontpellier.iut.partie2;

import java.util.ArrayList;
import java.util.Collections;

public class Couple {

    private JeuPuzzle jeuxInitial;
    private Couple predecesseur;

    public Couple(JeuPuzzle jeu, Couple predecesseur) {
        this.jeuxInitial = jeu;
        this.predecesseur = predecesseur;
    }

    public void mettreAJour(ArrayList<Couple> frontiere, ArrayList<JeuPuzzle> dejaVus) {

       ArrayList<? extends JeuPuzzle> fils= jeuxInitial.genererFils(); //on génère les fils du taquin
        for (JeuPuzzle jeux:fils) { //on parcours tout les taquin fils
            if (!dejaVus.contains(jeux)){ //si deja vu ne contient pas le taquin fils
                dejaVus.add(jeux); //on l'ajoute dans déjà vu
                frontiere.add(new Couple(jeux,this)); //et on ajoute dans le frontier le nouveau couple
                //du fils avec this en prédécesseur
            }
        }


    }

    public ArrayList<JeuPuzzle> getListeDeMouvements() {
        ArrayList<JeuPuzzle> listeMouvemement = new ArrayList<JeuPuzzle>();

        Couple coupleActuel = new Couple(jeuxInitial, predecesseur);
        listeMouvemement.add(coupleActuel.getJeuxInitial());
        while (coupleActuel.predecesseur != null) {

            coupleActuel = coupleActuel.predecesseur;

            listeMouvemement.add(coupleActuel.getJeuxInitial());

        }
        Collections.reverse(listeMouvemement);
        return listeMouvemement;
    }


    public JeuPuzzle getJeuxInitial() {
        return jeuxInitial;
    }
}
