package fr.umontpellier.iut.exo1;


import java.util.ArrayList;

public class Departement {


    private String specialite;
    private String adresse;
    private ArrayList<Etudiant> TabEtudiants;

    public Departement(String specialite,String adresse,ArrayList<Etudiant>TabEtudiants){
        this.specialite=specialite;
        this.adresse=adresse;
        this.TabEtudiants=TabEtudiants;

    }
//7
    @Override
    public String toString() {
        return "Departement{" +
                "specialite='" + specialite + '\'' +
                ", adresse='" + adresse + '\'' +
                ", TabEtudiants=" + TabEtudiants +
                '}';
    }
    //8
    public void inscrire(Etudiant etudiant){

        TabEtudiants.add(etudiant);
    }
    //9
    public void desinscrire(Etudiant etudiant){

        TabEtudiants.remove(etudiant);
    }
}
