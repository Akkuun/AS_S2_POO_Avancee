package fr.umontpellier.iut.exo3;

import java.time.LocalDate;
import java.time.Month;

class GestionEtudiants {
    public static void main(String[] args) {
        EtudiantJavaBeans toto = new EtudiantJavaBeans();
        toto.setNom("Dupont");
        toto.setDate_Naissance(LocalDate.of(2003, Month.JANUARY,28));
        /* ... */
        toto.setAdresse_postale("99, av. Occitanie, 34000 Montpellier");
    }

    // 3   4
    // avantage telescopique : on peut choisir le constructeur qui nous convient le mieux
    //desavantage : code plus lourd à réaliser
    // avantage  javabeans : plus d'accesibilite dans les parametres  des objets
    // desavantage : rend le code plus vulnérable et offre la possibilite de faire tout cassé car tout le monde a acces aux paramtre


}

