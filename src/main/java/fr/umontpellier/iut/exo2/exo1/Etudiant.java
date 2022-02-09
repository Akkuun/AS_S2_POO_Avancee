package fr.umontpellier.iut.exo2.exo1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Etudiant { //1

    private String nom, prenom, adresse_mail, adresse_postale;
    private LocalDate date_Naissance;
    private ArrayList<Note> listeNote;


    public Etudiant(String nom, String prenom, LocalDate date_Naissance, String adresse_mail, String adresse_postale,ArrayList<Note> listenote) {
        this.nom = nom;
        this.prenom = prenom;
        this.date_Naissance = date_Naissance;
        this.adresse_mail = adresse_mail;
        this.adresse_postale = adresse_postale;
        this.listeNote=listenote;
    }

    //2
    @Override
    public String toString() {
        return "Etudiant{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", date_Naissance=" + date_Naissance +
                ", adresse_mail='" + adresse_mail + '\'' +
                ", adresse_postale='" + adresse_postale + '\'' +
                '}';
    }

    //3
    public void setNom(String nom) {
        this.nom = nom;
    }

    //2  3

    public void noter(Matiere matiere, float note) {
        Note notes = new Note(matiere, note);
        listeNote.add(notes);

    }

    // 2  4

    public double calculerMoyenne() {  //note*coef de la matiere/ somme coef
        double moyenne = 0;
        int sommecoef = 0;

        for (int i = 0; i < listeNote.size(); i++) {
            moyenne += listeNote.get(i).getNote() * listeNote.get(i).getMatiere().getCoefficient();
            sommecoef += listeNote.get(i).getMatiere().getCoefficient();
        }
        moyenne = moyenne / sommecoef;


        return moyenne;
    }


}
