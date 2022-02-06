package fr.umontpellier.iut.exercice3;

import java.util.Objects;

public class Tennis {
    private final String j1;
    private final String j2;
    private int nbPointsJ1;
    private int nbPointsJ2;

    public Tennis(String joueur1, String joueur2) {
        j1 = joueur1;
        j2 = joueur2;
    }

    // incrémente les points du joueur correspondant
    public void gagnerPoint(String joueur) {

        if (Objects.equals(joueur, j1)) {
            nbPointsJ1++;
        } else nbPointsJ2++;


    }

    // Retourne le score courant de la partie sous forme de chaîne de caractères
    // Cette fonction interprète le score actuel sous forme d'un texte respectant la nomenclature d'un jeu de tennis
    public String getScore() {

        String[] score = {"0", "15", "30", "40"};


        if (nbPointsJ2 > nbPointsJ1 && nbPointsJ2 > 3) {
            if (nbPointsJ2 == nbPointsJ1 + 2 && nbPointsJ1 >= 3) {
                return "Nadal gagne";
            } else if (nbPointsJ2 == nbPointsJ1 + 1 && nbPointsJ1 >= 3) {
                return "Avantage Nadal";
            }
            return "Nadal gagne";

        } else if (nbPointsJ1 > nbPointsJ2 && nbPointsJ1 > 3) {
            if (nbPointsJ1 == nbPointsJ2 + 2 && nbPointsJ2 >= 3) {
                return "Federer gagne";
            } else if (nbPointsJ1 == nbPointsJ2 + 1 && nbPointsJ2 >= 3) {
                return "Avantage Federer";
            }
            return "Federer gagne";
        }

        if (nbPointsJ1 == nbPointsJ2 && nbPointsJ1 >= 3) {
            return "Égalité";
        }

        return score[nbPointsJ1] + " : " + score[nbPointsJ2];
    }

}
