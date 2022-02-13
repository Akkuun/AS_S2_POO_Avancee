package fr.umontpellier.iut.exo3;


import java.time.LocalDate;


public class EtudiantBuilder {
    private String nom, prenom, adresse_mail, adresse_postale;
    private LocalDate date_Naissance;


    public EtudiantBuilder ajouterNom(String nom){
        this.nom=nom;
        return this;
    }

    public EtudiantBuilder ajouterPrenom(String prennom){
        this.prenom=prennom;
        return this;
    }

    public EtudiantBuilder ajouterAdressePostale(String adresse){
        this.adresse_postale=adresse;
        return this;
    }

    public EtudiantBuilder ajouterMail(String mail){
        this.adresse_mail=mail;
        return this;
    }

    public EtudiantBuilder ajouterDateNaissance(LocalDate date){
        this.date_Naissance=date;
        return this;
    }
    public EtudiantBuilder build(){
        EtudiantBuilder etu=new EtudiantBuilder();
        etu.nom=nom;
        etu.prenom=prenom;
        etu.adresse_mail=adresse_mail;
        etu.adresse_postale=adresse_postale;
        etu.date_Naissance=date_Naissance;
        return etu;
    }

}
