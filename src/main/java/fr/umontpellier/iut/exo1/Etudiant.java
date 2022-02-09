package fr.umontpellier.iut.exo1;
import java.time.LocalDate;
import java.util.Date;

public class Etudiant { //1

    private String nom,prenom,adresse_mail,adresse_postale;
    private LocalDate date_Naissance;


    public Etudiant(String nom,String prenom,LocalDate date_Naissance,String adresse_mail,String adresse_postale){
        this.nom=nom;
        this.prenom=prenom;
        this.date_Naissance=date_Naissance;
        this.adresse_mail=adresse_mail;
        this.adresse_postale=adresse_postale;
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




}
