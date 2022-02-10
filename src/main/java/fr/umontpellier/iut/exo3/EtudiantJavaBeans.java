package fr.umontpellier.iut.exo3;

import fr.umontpellier.iut.exo2.exo1.Note;

import java.time.LocalDate;
import java.util.ArrayList;

public class EtudiantJavaBeans {

    private String nom, prenom, adresse_mail, adresse_postale;
    private LocalDate date_Naissance;
    private ArrayList<Note> listeNote;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse_mail(String adresse_mail) {
        this.adresse_mail = adresse_mail;
    }

    public void setAdresse_postale(String adresse_postale) {
        this.adresse_postale = adresse_postale;
    }

    public void setDate_Naissance(LocalDate date_Naissance) {
        this.date_Naissance = date_Naissance;
    }
}
