package fr.umontpellier.iut.exo3;

import fr.umontpellier.iut.exo2.exo1.Note;

import java.time.LocalDate;
import java.util.ArrayList;

public class EtudiantsTelescopique {

    private String nom, prenom, adresse_mail, adresse_postale;
    private LocalDate date_Naissance;
    private ArrayList<Note> listeNote;


    public EtudiantsTelescopique(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;

    }


    public EtudiantsTelescopique(String nom, String prenom, String adresse_mail) {
        this(nom,prenom);
        this.adresse_mail = adresse_mail;

    }

    public EtudiantsTelescopique(String nom, String prenom, LocalDate date_Naissance) {
        this(nom,prenom);
        this.date_Naissance = date_Naissance;
    }
    //3 2 on ne peut pas car on a déjà utlise this(nom,prenom)
    /*
    public EtudiantsTelescopique(String nom,String prenom,String adresse){
        this(nom,prenom);
        this.adresse_postale=adresse;
    }
*/

}
