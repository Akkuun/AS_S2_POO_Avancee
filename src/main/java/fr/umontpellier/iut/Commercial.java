package fr.umontpellier.iut;

public abstract class Commercial extends Employe {

    private double chiffreAffaires;
    private double tauxCommission;

    public Commercial(String nrINSEE, String nom, int echelon, double base, double nbHeures, double chiffreAffaires, double tauxCommission) {
        super(nrINSEE, nom, echelon, base, nbHeures);
        this.chiffreAffaires = chiffreAffaires;
        this.tauxCommission = tauxCommission;
    }


    public void negocierTransaction(double sommeGagnée) {
        chiffreAffaires += sommeGagnée;
        System.out.println("Je négocie une transaction");
    }


    public double getChiffreAffaires() { //penser à supprimer cette fonction car elle n'aporte rien au programme , elle n'apporte que au test
        return chiffreAffaires;
    }

    @Override
    public double getSalaireBrut() {
        return getBase() + (chiffreAffaires * tauxCommission);
    }

}
