package fr.umontpellier.iut.partie2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Hanoi implements JeuPuzzle {

    private ArrayList<Integer> tour_1;
    private ArrayList<Integer> tour_2;
    private ArrayList<Integer> tour_3;

    private int taille;

    public Hanoi(int taille) {
        /* crée un hanoi avec la configuration suivante :
         * sur la tour 1 les disques [taille,taille-1, .., 1]
         * rien sur les tour 2 et 3 (elles sont vides)

         */
        ArrayList<Integer> t = new ArrayList<>();
        for (int i = 0; i < taille; i++) {

            t.add(taille - i);
        }
        tour_1 = t;
        this.taille = taille;
    }


    public Hanoi(ArrayList<Integer> tour1, ArrayList<Integer> tour2, ArrayList<Integer> tour3, int taille) {
        /*
        Crée un hanoi où la tour 1 (resp. tour 2 et tour 3) contient les entiers de tour1 (resp. tour2 et tour3). Par exemple,
        si tour1 est une ArrayList contenant [3,2,1], et tour2 et tour3 sont des ArrayList vides, alors
        Hanoi(tour1, tour2, tour3) doit créer la même configuration que Hanoi(3).
         */

        this.tour_1 = tour1;
        this.tour_2 = tour2;
        this.tour_3 = tour3;
        this.taille = 3;

    }


    @Override
    public boolean estGagnant() {
        ArrayList<Integer> finalHanoi = new ArrayList<>();
        finalHanoi.add(1);
        finalHanoi.add(2);
        finalHanoi.add(3);

        return tour_1.isEmpty() && tour_2.isEmpty() && tour_3.equals(finalHanoi);
    }

    @Override
    public ArrayList<? extends JeuPuzzle> genererFils() {
        ArrayList<Hanoi> fils = new ArrayList<>();

        int valeurTour1 = valeurDessus(tour_1);
        int valeurTour2 = valeurDessus(tour_2);
        int valeurTour3 = valeurDessus(tour_3);

        int index_DerniereValeur1 = indexDerniereValeurPasNull(tour_1);
        int index_DerniereValeur2 = indexDerniereValeurPasNull(tour_2);
        int index_DerniereValeur3 = indexDerniereValeurPasNull(tour_3);



        if (valeurTour1 != 0) { // on fait 1--> 2
            if (valeurTour1 < valeurTour2 || valeurTour2 == 0) {
                ArrayList<Integer> copieTour1 =copieListe(tour_1);
                ArrayList<Integer> copieTour2 =copieListe(tour_2);
                ArrayList<Integer> copieTour3 =copieListe(tour_3);
                if (valeurTour2 == 0) {

                    copieTour2.add(index_DerniereValeur2 , valeurTour1);
                    copieTour1.remove(index_DerniereValeur1);
                    Hanoi hanoi_fils_1_2 = new Hanoi(copieTour1,copieTour2,copieTour3,taille);
                    fils.add(hanoi_fils_1_2);

                } else {

                    copieTour2.add(index_DerniereValeur2+1, valeurTour1);
                    copieTour1.remove(index_DerniereValeur1);
                    Hanoi hanoi_fils_1_2 = new Hanoi(copieTour1,copieTour2,copieTour3, taille);
                    fils.add(hanoi_fils_1_2);

                }
            }
            if (valeurTour1 < valeurTour3 || valeurTour3 == 0) {
                if (valeurTour3 == 0) {
                    tour_3.add(index_DerniereValeur3, valeurTour1);
                    tour_1.remove(index_DerniereValeur1);
                    Hanoi hanoi_fils_1_3 = new Hanoi(tour_1, tour_2, tour_3, taille);
                    fils.add(hanoi_fils_1_3);
                } else {
                    tour_3.add(index_DerniereValeur3 + 1, valeurTour1);
                    tour_1.remove(index_DerniereValeur1);
                    Hanoi hanoi_fils_1_3 = new Hanoi(tour_1, tour_2, tour_3, taille);
                    fils.add(hanoi_fils_1_3);
                }

            }
        }


        return fils;
    }

    public int valeurDessus(ArrayList<Integer> tour) {
        int res = 0;
        if (tour.size() != 0) {

            for (int i = 0; i < tour.size(); i++) {
                if (tour.get(i) != 0) {
                    res = tour.get(i);
                }
            }
        }
        return res;
    }

    public int indexDerniereValeurPasNull(ArrayList<Integer> tour) {
        int index = 0;
        if (tour.size() != 0) {

            for (int i = 0; i < tour.size(); i++) {
                if (tour.get(i) != 0) {
                    index = i;
                }
            }
        }


        return index;

    }

    public ArrayList<Integer>copieListe(ArrayList<Integer> copie){
        ArrayList<Integer>finallcopie= new ArrayList<>();
        finallcopie.addAll(copie);
        return finallcopie;
    }


}
