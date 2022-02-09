package fr.umontpellier.iut;

import java.util.Objects;

public class Produit {
    private final int numProduit;
    private String descriptionProduit;
    private final double prixInitial;
    private double pasEnchere;
    private double coutParticipation;

    private boolean disponible;

    public Produit(int numProduit, String descriptionProduit, double prixInitial, double coutParticipation) {
        this.descriptionProduit = descriptionProduit;
        this.prixInitial = prixInitial;
        this.coutParticipation = coutParticipation;
        this.numProduit = numProduit;
        disponible = false;
    }

    public int getNumProduit() {
        return numProduit;
    }

    // question 1
    public void setPasEnchere(double pas) {
        pasEnchere = pas;
    }

    public void demarrerEnchere() {
        throw new RuntimeException("Méthode non implémentée ! Effacez cette ligne et écrivez le code nécessaire");
    }

    public void arreterEnchere() {
        throw new RuntimeException("Méthode non implémentée ! Effacez cette ligne et écrivez le code nécessaire");
    }

    // question 5
    public double getPrixEnCours(){
        throw new RuntimeException("Méthode non implémentée ! Effacez cette ligne et écrivez le code nécessaire");
    }

    // pré-requis : l'offre passée en paramètre est valide
    public void ajouterOffre(OffreEnchere o) {
        throw new RuntimeException("Méthode non implémentée ! Effacez cette ligne et écrivez le code nécessaire");
    }

    public double getCoutParticipation() {
        return coutParticipation;
    }

    public OffreEnchere getOffreGagnante() {
        throw new RuntimeException("Méthode non implémentée ! Effacez cette ligne et écrivez le code nécessaire");
    }

    public boolean estDisponible() {
        return disponible;
    }

    // vérifie si l'offre est correcte
    public boolean verifierOffre(OffreEnchere offre) {
        throw new RuntimeException("Méthode non implémentée ! Effacez cette ligne et écrivez le code nécessaire");
    }


    // fonction permettant la comparaison des Produits
    // cette fonction doit rester intacte
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produit produit)) return false;
        return getNumProduit() == produit.getNumProduit();
    }

    // fonction auxiliaire définissant le hashCode des objets de type Produit en respectant le contrat de equals(Object o)
    // cette fonction doit rester intacte
    @Override
    public int hashCode() {
        return Objects.hash(getNumProduit());
    }
}
