package fr.umontpellier.iut.exo2.exo1;

public class Matiere {
    private String intitule;
    private double coefficient;

    // 2  1
    public Matiere(String intitule,double coefficient){
        this.intitule=intitule;
        this.coefficient=coefficient;

    }

    public double getCoefficient() {
        return coefficient;
    }


}
